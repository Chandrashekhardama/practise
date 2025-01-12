package com.app.email;

import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailRunner implements CommandLineRunner {

	private final EmailService emailService;

	public EmailRunner(EmailService emailService) {
		this.emailService = emailService;
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			emailService.sendEmails();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
