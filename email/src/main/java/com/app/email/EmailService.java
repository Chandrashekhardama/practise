package com.app.email;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.activation.DataSource;
import jakarta.activation.FileDataSource;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    @Autowired
    private EmailValidatorService emailValidatorService;

    @Value("${email.excel.file.path}")
    private String excelFilePath;

    @Value("${email.txt.file.path}")
    private String textFilePath;

    @Value("${email.attachment.file.path}")
    private String attachmentFilePath;

    @Value("${email.template.file.path}")
    private String templateFilePath;

    @Value("${email.sender.address}")
    private String senderAddress;

    @Value("${email.source.flag}")
    private String sourceFlag; // "excel" or "txt"

    private int emailCount = 0; // Counter for the number of emails sent

    public void sendEmails() throws IOException {
        System.out.println("Invoking sendEmails");

        String templateContent = readFile(templateFilePath);

        if ("excel".equalsIgnoreCase(sourceFlag)) {
            sendEmailsFromExcel(templateContent);
        } else if ("txt".equalsIgnoreCase(sourceFlag)) {
            sendEmailsFromTextFile(templateContent);
        } else {
            System.out.println("Invalid source flag. Please specify 'excel' or 'txt'.");
        }
    }

    private void sendEmailsFromExcel(String templateContent) throws IOException {
        try (FileInputStream excelFile = new FileInputStream(new File(excelFilePath));
             Workbook workbook = new XSSFWorkbook(excelFile)) {

            Sheet sheet = workbook.getSheetAt(0);

            // Skip the header row and start from the next row
            for (int i = 1; i < sheet.getPhysicalNumberOfRows(); i++) {
                Row row = sheet.getRow(i);
                if (row == null) continue; // Skip empty rows

                Cell emailCell = row.getCell(2); // Email ID is in the third column (index 2)
                Cell orgCell = row.getCell(4);   // Organization Name is in the fifth column (index 4)
                Cell nmCell = row.getCell(1);    // Name is in the second column (index 1)

                if (emailCell != null && orgCell != null && nmCell != null) {
                    String email = emailCell.getStringCellValue().trim();
                    String organization = orgCell.getStringCellValue().trim();
                    String name = nmCell.getStringCellValue().trim();

                    if (emailValidatorService.isValidEmail(email)) {
                        // Replace placeholders in the template
                        String subject = "Java Developer opportunities at " + organization;
                        String body = templateContent.replace("${name}", name).replace("${organization}", organization);
                        sendEmail(email, subject, body, attachmentFilePath);
                    } else {
                        System.out.println("Invalid email address: " + email);
                    }
                }
            }
        }
    }

    private void sendEmailsFromTextFile(String templateContent) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(textFilePath))) {
            String email;
            while ((email = reader.readLine()) != null) {
                email = email.trim();
                if (emailValidatorService.isValidEmail(email)) {
                    // Replace placeholders in the template with default values for text file emails
                    String subject = "Java Developer Opportunities at Your Company";
                    String body = templateContent; // No placeholder replacement needed
                    sendEmail(email, subject, body, attachmentFilePath);
                } else {
                    System.out.println("Invalid email address: " + email);
                }
            }
        }
    }

    private void sendEmail(String to, String subject, String body, String attachmentFilePath) {
        try {
            MimeMessage message = mailSender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(message, true);

            helper.setTo(to);
            helper.setSubject(subject);
            helper.setText(body);

            helper.setFrom(senderAddress); // Replace with the actual allowed 'from' address

            // Add attachment
            File file = new File(attachmentFilePath);
            DataSource source = new FileDataSource(file);
            helper.addAttachment(file.getName(), source);

            mailSender.send(message);
            emailCount++; // Increment the counter after sending the email
            System.out.println("Email sent successfully to " + to);
            System.out.println("Total emails sent: " + emailCount); // Print the count immediately
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private String readFile(String filePath) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
