package com.app.others;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RemoveSpacesFromFile {

	public static void main(String[] args) {
		String inputFilePath = "D:\\personal\\my docs\\Hr_mail_list\\unique_emails.txt"; // The file containing 4000 email IDs
		String outputFilePath = "D:\\personal\\my docs\\Hr_mail_list\\cleaned_output.txt"; // The file to write unique emails to

		try {
			removeSpacesFromFile(inputFilePath, outputFilePath);
			System.out.println("Empty spaces removed and cleaned data saved to: " + outputFilePath);

		} catch (IOException e) {
			System.err.println("Error processing files: " + e.getMessage());
		}
	}

	// Function to remove spaces and write cleaned lines to a new file
	public static void removeSpacesFromFile(String inputFilePath, String outputFilePath) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
		BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath));

		String line;
		while ((line = reader.readLine()) != null) {
			// Remove leading and trailing spaces and skip empty lines
			line = line.trim();
			if (!line.isEmpty()) {
				writer.write(line);
				writer.newLine();
			}
		}

		reader.close();
		writer.close();
	}
}
