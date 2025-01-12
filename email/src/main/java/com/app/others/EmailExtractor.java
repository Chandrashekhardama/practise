package com.app.others;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class EmailExtractor {

    public static void main(String[] args) {
        // Paths to the input and output files
        String inputFilePath = "D:\\personal\\my docs\\Hr_mail_list\\mail_searched\\blr_27-08-2024\\blr_org_input_mail.txt"; // Input file path
        String outputFilePath = "D:\\personal\\my docs\\Hr_mail_list\\mail_searched\\blr_27-08-2024\\blr_output_mail.txt"; // Output file path

        // Set to store extracted email addresses (to handle duplicates and maintain order)
        Set<String> emailSet = new LinkedHashSet<>();

        // Regular expression for matching email addresses
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";

        Pattern pattern = Pattern.compile(emailRegex);

        // Read the input file and extract email addresses
        try (BufferedReader br = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                Matcher matcher = pattern.matcher(line);

                // Find and add all email addresses in the current line
                while (matcher.find()) {
                    emailSet.add(matcher.group());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Write the extracted and deduplicated email addresses to the output file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFilePath))) {
            for (String email : emailSet) {
                bw.write(email);
                bw.newLine(); // Add a new line after each email address
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Email extraction and deduplication complete. Check the output file.");
    }
}
