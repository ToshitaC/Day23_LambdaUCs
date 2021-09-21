package com.bridgelabz;

import static org.junit.Assert.*;

import org.junit.Test;


public class UserRegistrationTest {

    @Test
    public void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserRegistration validatorObj = new UserRegistration();
        boolean result = validatorObj.validateFirstName("Toshita");
        assertTrue(result);
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserRegistration validatorObj = new UserRegistration();
        boolean result = validatorObj.validateLastName("Chaudhari");
        assertTrue(result);
    }

    @Test
    public void givenEmail_whenMatches_ShouldReturnTrue() {
        UserRegistration validatorObj = new UserRegistration();
        assertTrue(validatorObj.validateEmail("abc04.xyz@gmail.co.in"));
    }

    @Test
    public void givenPhoneNumber_whenMatches_ShouldReturnTrue() {
        UserRegistration validatorObj = new UserRegistration();
        assertTrue(validatorObj.validatePhoneNumber("919001233201"));
    }

    public void givenPassword_whenMatches_ShouldReturnTrue() {
        UserRegistration validatorObj = new UserRegistration();

        assertTrue(validatorObj.validatePassword("@qwerty!@*"));
    }
    @Test
    public void givenMessage_whenNotSad_ShouldReturnHappy() {
        UserRegistration moodAnalyser = new UserRegistration();
        String mood = moodAnalyser.analyzeMood("This is a sad message");
        assertEquals("Happy", mood);
    }
}
