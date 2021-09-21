package com.bridgelabz;

import static org.junit.Assert.*;

import org.junit.Test;


public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        try {
            UserRegistration validatorObj = new UserRegistration();
            assertTrue(validatorObj.validateFirstName("Toshita"));
        } catch (ValidateFirstNameException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        try {
            UserRegistration validatorObj = new UserRegistration();
            assertTrue(validatorObj.validateLastName("Chaudhari"));
        } catch (ValidateLastNameException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenEmail_whenMatches_ShouldReturnTrue() {
        try {
            UserRegistration validatorObj = new UserRegistration();
            assertTrue(validatorObj.validateEmail("abc.xyz04@gmail.co.in"));
        } catch (ValidateEmailException e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void givenPhoneNumber_whenMatches_ShouldReturnTrue() {
        try {
            UserRegistration validatorObj = new UserRegistration();
            assertTrue(validatorObj.validatePhoneNumber("918823576358"));
        } catch (ValidatePhoneNumberException e) {
            System.out.println(e.getMessage());
        }
    }

    public void givenPassword_whenMatches_ShouldReturnTrue() {
        try {
            UserRegistration validatorObj = new UserRegistration();
            assertTrue(validatorObj.validatePassword("*qwerty@123"));
        } catch (ValidatePasswordException e) {
            System.out.println(e.getMessage());
        }
    }

}
