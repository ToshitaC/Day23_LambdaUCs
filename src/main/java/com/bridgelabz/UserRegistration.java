package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //Pattern
    public static final String NAME_PATTERN = "^[A-Z]{1}[a-zA-z]{2,}";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    public static final String PHONE_PATTERN = "^[1-9]+[0-9]+[/s\\\\-]?[1-9]{1}[0-9]{9}$";
    public static final String PASSWORD_PATTERN = "^[a-zA-Z]*@[^W][a-zA-Z0-9]*${8,}";
    //UC13: Using Lambda Function to validate User Entry
    UserRegistrationInterface rgObj = (detailsPattern, details) -> {
        Pattern pattern = Pattern.compile(detailsPattern);
        Matcher matcher = pattern.matcher(details);
        return matcher.find();
    };

    // First name
    public boolean validateFirstName(String fname) throws ValidateFirstNameException {
        try {
            if (rgObj.validate(NAME_PATTERN, fname)) {
                return true;
            } else {
                throw new ValidateFirstNameException("Enter a valid first name");
            }
        } catch (Exception e) {
            throw new ValidateFirstNameException("Enter a valid first name");
        }
    }

    //Last name
    public boolean validateLastName(String lname) throws ValidateLastNameException {
        try {
            if (rgObj.validate(NAME_PATTERN, lname)) {
                return true;
            } else {
                throw new ValidateLastNameException("Enter a valid last name");
            }
        } catch (Exception e) {
            throw new ValidateLastNameException("Enter a valid last name");
        }
    }

    //Email Id
    public boolean validateEmail(String email) throws ValidateEmailException {
        try {
            if (rgObj.validate(EMAIL_PATTERN, email)) {
                return true;
            } else {
                throw new ValidateEmailException("Enter a valid email Id");
            }
        } catch (Exception e) {
            throw new ValidateEmailException("Enter a valid email Id");
        }
    }

    // Phone number
    public boolean validatePhoneNumber(String phoneNumber) throws ValidatePhoneNumberException {
        try {
            if (rgObj.validate(PHONE_PATTERN, phoneNumber)) {
                return true;
            } else {
                throw new ValidatePhoneNumberException("Enter a valid phone number");
            }
        } catch (Exception e) {
            throw new ValidatePhoneNumberException("Enter a valid phone number");
        }
    }

    //Password
    public boolean validatePassword(String password) throws ValidatePasswordException {
        try {
            if (rgObj.validate(PASSWORD_PATTERN, password)) {
                return true;
            } else {
                throw new ValidatePasswordException("Enter a valid password");
            }
        } catch (Exception e) {
            throw new ValidatePasswordException("Enter a valid password");
        }
    }
}