package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public static final String NAME_PATTERN = "^[A-Z]{1}[a-zA-z]{2,}";
    public static final String EMAIL_PATTERN = "^[a-zA-Z0-9]+([._+-][0-9a-zA-Z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,4})?$";
    public static final String PHONE_PATTERN = "^[1-9]+[0-9]+[/s\\\\-]?[1-9]{1}[0-9]{9}$";
    public static final String PASSWORD_PATTERN = "^[a-zA-Z]*@[^W][a-zA-Z0-9]*${8,}";

    public boolean validateFirstName(String fname) throws ValidateFirstNameException {
        try {
            Pattern pattern = Pattern.compile(NAME_PATTERN);
            Matcher matcher = pattern.matcher(fname);
            if (matcher.find())
                return true;
            else
                throw new ValidateFirstNameException("Enter a valid first name");
        } catch (Exception e) {
            throw new ValidateFirstNameException("Enter a valid first name");
        }
    }

    public boolean validateLastName(String lname) throws ValidateLastNameException {
        try {
            Pattern pattern = Pattern.compile(NAME_PATTERN);
            Matcher matcher = pattern.matcher(lname);
            if (matcher.find())
                return true;
            else
                throw new ValidateLastNameException("Enter a valid last name");
        } catch (Exception e) {
            throw new ValidateLastNameException("Enter a valid last name");
        }
    }

    public boolean validateEmail(String email) throws ValidateEmailException {
        try {
            Pattern pattern = Pattern.compile(EMAIL_PATTERN);
            Matcher matcher = pattern.matcher(email);
            if (matcher.find())
                return true;
            else
                throw new ValidateEmailException("Enter a valid email address");
        } catch (ValidateEmailException e) {
            throw new ValidateEmailException("Enter a valid email adddress");
        }
    }

    public boolean validatePhoneNumber(String phoneNumber) throws ValidatePhoneNumberException {
        try {
            Pattern pattern = Pattern.compile(PHONE_PATTERN);
            Matcher matcher = pattern.matcher(phoneNumber);
            if (matcher.find())
                return true;
            else
                throw new ValidatePhoneNumberException("Enter a valid phone number");
        } catch (Exception e) {
            throw new ValidatePhoneNumberException("Enter a valid phone number");
        }
    }

    public boolean validatePassword(String password) throws ValidatePasswordException {
        try {
            Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
            Matcher matcher = pattern.matcher(password);
            if (matcher.find())
                return true;
            else
                throw new ValidatePasswordException("Enter valid password");
        } catch (Exception e) {
            throw new ValidatePasswordException("Enter valid password");
        }
    }
}
