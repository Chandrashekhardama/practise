package com.app.others;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class EmailExtrRaw {

	public static void main(String[] args) {
		String inputFilePath = "D:\\personal\\my docs\\Hr_mail_list\\mail_searched\\consolidated_mail.txt"; 
		String outputFilePath = "D:\\personal\\my docs\\Hr_mail_list\\mail_searched\\removed_dupli.txt"; 
		try {
			// Read and extract email IDs from the input file
			Set<String> emailSet = extractEmailsFromFile(inputFilePath);

			// Write unique email IDs to the output file
			writeEmailsToFile(outputFilePath, emailSet);

			System.out.println("Duplicates removed and unique emails saved to: " + outputFilePath);

		} catch (IOException e) {
			System.err.println("Error processing files: " + e.getMessage());
		}
	}

	// Function to extract email IDs from a file and remove duplicates while
	// maintaining insertion order
	public static Set<String> extractEmailsFromFile(String filePath) throws IOException {
		Set<String> emailSet = new LinkedHashSet<>(); // Maintain insertion order

		// Regular expression for matching email addresses
		String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
		Pattern pattern = Pattern.compile(emailRegex);

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
			StringBuilder textBuilder = new StringBuilder();
			String line;

			// Read entire file into a single String
			while ((line = reader.readLine()) != null) {
				textBuilder.append(line).append(" ");
			}

			// Match email addresses in the entire text
			Matcher matcher = pattern.matcher(textBuilder.toString());

			// Find and add all email addresses
			while (matcher.find()) {
				emailSet.add(matcher.group());
			}
		}

		return emailSet;
	}

	// Function to write unique email IDs to a file
	public static void writeEmailsToFile(String filePath, Set<String> emailSet) throws IOException {
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
			for (String email : emailSet) {
				writer.write(email);
				writer.newLine();
			}
		}
	}
}
