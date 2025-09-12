package com.app.testdama;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.apache.http.client.methods.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.*;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {
    private static final String AUTHORIZE_URL = "https://www.dropbox.com/oauth2/authorize";
    private static final String TOKEN_URL = "https://api.dropbox.com/oauth2/token";
    private static final String GET_CURRENT_ACCOUNT = "https://api.dropboxapi.com/2/users/get_current_account";
//    private static final String TEAM_GET_INFO = "https://api.dropboxapi.com/2/team/get_info";

    // Read from env (safer than hard-coding)
    private static final String CLIENT_ID = System.getenv("DBX_CLIENT_ID");
    private static final String CLIENT_SECRET = System.getenv("DBX_CLIENT_SECRET");
    private static final String REDIRECT_URI = System.getenv().getOrDefault("DBX_REDIRECT_URI","http://localhost:8080/callback");

    public static void main(String[] args) throws Exception {
        if (CLIENT_ID == null || CLIENT_SECRET == null) {
            System.err.println("Set DBX_CLIENT_ID and DBX_CLIENT_SECRET environment variables before running.");
            System.exit(1);
        }
        String scopes = "team_info.read members.read events.read account_info.read";
        String authorizeUrl = AUTHORIZE_URL + "?"
                + "response_type=code"
                + "&client_id=" + URLEncoder.encode(CLIENT_ID, "UTF-8")
                + "&redirect_uri=" + URLEncoder.encode(REDIRECT_URI, "UTF-8")
                + "&token_access_type=offline"
                + "&scope=" + URLEncoder.encode(scopes, "UTF-8");

        System.out.println("1) Open this URL in your browser and authorize the app:");
        System.out.println(authorizeUrl);
        System.out.println("\n2) After authorizing you'll be redirected to your redirect URI with a 'code' param.");
        System.out.print("Paste the 'code' parameter here: ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String code = br.readLine().trim();

        // Exchange code for token
        String tokenJson = exchangeCodeForToken(code);
        ObjectMapper mapper = new ObjectMapper();
        JsonNode tokenNode = mapper.readTree(tokenJson);
        String accessToken = tokenNode.has("access_token") ? tokenNode.get("access_token").asText() : null;
        String refreshToken = tokenNode.has("refresh_token") ? tokenNode.get("refresh_token").asText() : null;

        System.out.println("\nAccess token: " + (accessToken==null ? "NONE" : accessToken.substring(0, Math.min(10, accessToken.length())) + "..."));
        if (refreshToken != null) System.out.println("Refresh token received (stored securely).");

        // Call team/get_info
        if (accessToken != null) {
            String teamInfo = callTeamGetInfo(accessToken);
            Object pretty = mapper.readTree(teamInfo);
            System.out.println("\n== team/get_info response ==\n" + mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pretty));
        } else {
            System.err.println("No access token, cannot call API.");
        }
    }

    private static String exchangeCodeForToken(String code) throws Exception {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost(TOKEN_URL);

        String body = "code=" + URLEncoder.encode(code, "UTF-8") +
                      "&grant_type=authorization_code" +
                      "&client_id=" + URLEncoder.encode(CLIENT_ID, "UTF-8") +
                      "&client_secret=" + URLEncoder.encode(CLIENT_SECRET, "UTF-8") +
                      "&redirect_uri=" + URLEncoder.encode(REDIRECT_URI, "UTF-8");
        post.setHeader("Content-Type","application/x-www-form-urlencoded");
        post.setEntity(new StringEntity(body, StandardCharsets.UTF_8));
        try (CloseableHttpResponse resp = client.execute(post)) {
            String respStr = EntityUtils.toString(resp.getEntity(), StandardCharsets.UTF_8);
            if (resp.getStatusLine().getStatusCode() >= 400) {
                throw new RuntimeException("Token endpoint returned error: " + respStr);
            }
            return respStr;
        }
    }

    private static String callTeamGetInfo(String accessToken) throws Exception {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost(GET_CURRENT_ACCOUNT);
//        HttpPost post = new HttpPost(TEAM_GET_INFO);
        post.setHeader("Authorization", "Bearer " + accessToken);
        post.setHeader("Content-Type", "application/json");
        // team/get_info expects an RPC body; passing "null" is acceptable per docs
        post.setEntity(new StringEntity("null", StandardCharsets.UTF_8));
        try (CloseableHttpResponse resp = client.execute(post)) {
            String respStr = EntityUtils.toString(resp.getEntity(), StandardCharsets.UTF_8);
            if (resp.getStatusLine().getStatusCode() >= 400) {
                throw new RuntimeException("API returned error: " + respStr);
            }
            return respStr;
        }
    }
}
