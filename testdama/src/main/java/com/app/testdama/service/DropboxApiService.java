package com.app.testdama.service;

import org.apache.http.client.methods.*;
import org.apache.http.impl.client.*;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;

@Service
public class DropboxApiService {
    private static final String BASE_URL = "https://api.dropboxapi.com/2";
    private final String accessToken = System.getenv("DBX_ACCESS_TOKEN");

    private String callDropboxApi(String endpoint, String body) throws Exception {
        try (CloseableHttpClient client = HttpClients.createDefault()) {
            HttpPost post = new HttpPost(BASE_URL + endpoint);
            post.setHeader("Authorization", "Bearer " + accessToken);
            post.setHeader("Content-Type", "application/json");

            if (body != null) {
                post.setEntity(new StringEntity(body, StandardCharsets.UTF_8));
            }

            try (CloseableHttpResponse resp = client.execute(post)) {
                String respStr = EntityUtils.toString(resp.getEntity(), StandardCharsets.UTF_8);
                if (resp.getStatusLine().getStatusCode() >= 400) {
                    throw new RuntimeException("API Error (" + endpoint + "): " + respStr);
                }
                return respStr;
            }
        }
    }

    public String getTeamInfo() throws Exception {
        return callDropboxApi("/team/get_info", "null");
    }

    public String listTeamMembers() throws Exception {
        return callDropboxApi("/team/members/list", "{}");
    }

    public String getTeamEvents() throws Exception {
        String body = "{ \"limit\": 10 }";
        return callDropboxApi("/team_log/get_events", body);
    }
}
