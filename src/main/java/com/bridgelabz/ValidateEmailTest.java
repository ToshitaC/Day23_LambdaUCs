package com.bridgelabz;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ValidateEmailTest {
    private String Email;
    private boolean expected;
    private UserRegistration userRegistration;

    public ValidateEmailTest(String Email, boolean expected) {
        super();
        this.Email = Email;
        this.expected = expected;
    }

    @Before
    public void initialize() {
        userRegistration = new UserRegistration();
    }

    @SuppressWarnings("rawtypes")
    @Parameterized.Parameters
    public static Collection input() {
        return Arrays.asList(new Object[][]{
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {"abc", false},
                {"abc@.com.my", false},
                {"abc123@gmail.a", false},
                {".abc@abc.com", false},
                {"abc()*@gmail.com", false},
                {"abc@%*.com", false},
                {"abc..2002@gmail.com", false},
                {"abc.@gmail.com", false},
                {"abc@abc@gmail.com", false},
                {"abc@gmail.com.1a", false},
                {"abc@gmail.com.aa.au", false},
                {"abc123@.com", false},
                {"abc123@.com.com", false}});
    }

    @Test
    public void testValidateEmailTest() {
        try {
            assertEquals(expected, userRegistration.validateEmail(Email));
        } catch (ValidateEmailException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
