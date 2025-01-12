package com.app.others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractContactPersonEmails {
	public static void main(String[] args) {
		// Specify the full path for input and output files
		String inputFile = "D:\\personal\\my docs\\Hr_mail_list\\mail_searched\\input.txt"; // Update with your actual
																							// input file path
		String outputFile = "D:\\personal\\my docs\\Hr_mail_list\\mail_searched\\dummy.txt"; // Update with your desired
																								// output file path

		// Regex pattern for extracting Contact Person's Email IDs
		Pattern emailPattern = Pattern.compile("Contact Person's Email ID\\s+([^\\n]*)");

		// Regex pattern to validate email addresses
		Pattern validEmailPattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

			StringBuilder content = new StringBuilder();
			String line;
			while ((line = reader.readLine()) != null) {
				content.append(line).append("\n");
			}

			// Extracting Contact Person's Email IDs using regex
			Matcher matcher = emailPattern.matcher(content);
			while (matcher.find()) {
				String emailString = matcher.group(1).trim();

				// Split the email IDs by comma and process each one
				String[] emails = emailString.split("\\s*,\\s*");
				for (String email : emails) {
					email = email.trim(); // Remove extra spaces around email
					if (validEmailPattern.matcher(email).matches()) {
						// Print the valid email ID to the console
						System.out.println("Found email ID: " + email);

						// Write the extracted email ID to the output file
						writer.write(email);
						writer.newLine();
					}
				}
			}

			System.out.println("Contact Person's Email IDs extracted successfully to " + outputFile);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}