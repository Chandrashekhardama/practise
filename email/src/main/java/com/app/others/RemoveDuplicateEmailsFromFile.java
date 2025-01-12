package com.app.others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateEmailsFromFile {

    public static void main(String[] args) {
        String inputFilePath = "D:\\personal\\my docs\\Hr_mail_list\\mail_searched\\consolidated_mail.txt"; // The file containing 4000 email IDs
        String outputFilePath = "D:\\personal\\my docs\\Hr_mail_list\\mail_searched\\removed_dupli.txt"; // The file to write unique emails to

        try {
            // Read email IDs from the input file
            Set<String> emailSet = readEmailsFromFile(inputFilePath);

            // Write unique email IDs to the output file
            writeEmailsToFile(outputFilePath, emailSet);

            System.out.println("Duplicates removed and unique emails saved to: " + outputFilePath);

        } catch (IOException e) {
            System.err.println("Error processing files: " + e.getMessage());
        }
    }

    // Function to read email IDs from a file and remove duplicates while maintaining insertion order
    public static Set<String> readEmailsFromFile(String filePath) throws IOException {
        Set<String> emailSet = new LinkedHashSet<>(); // Maintain insertion order
        BufferedReader reader = new BufferedReader(new FileReader(filePath));

        String email;
        while ((email = reader.readLine()) != null) {
            emailSet.add(email.trim()); // Add email to set (duplicates are automatically handled)
        }

        reader.close();
        return emailSet;
    }

    // Function to write unique email IDs to a file
    public static void writeEmailsToFile(String filePath, Set<String> emailSet) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filePath));

        for (String email : emailSet) {
            writer.write(email);
            writer.newLine();
        }

        writer.close();
    }
}
