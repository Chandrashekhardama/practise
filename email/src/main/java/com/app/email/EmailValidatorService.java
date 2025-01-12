package com.app.email;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Service
public class EmailValidatorService {

    private final Validator validator;

    @Autowired
    public EmailValidatorService(Validator validator) {
        this.validator = validator;
    }

    public boolean isValidEmail(String email) {
        EmailDto emailDto = new EmailDto(email);
        Set<ConstraintViolation<EmailDto>> violations = validator.validate(emailDto);
        return violations.isEmpty();
    }

    // DTO for email validation
    public static class EmailDto {
        @NotNull
        @Email
        private final String email;

        public EmailDto(String email) {
            this.email = email;
        }

        public String getEmail() {
            return email;
        }
    }
}
