package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserValidator {
    /**
    * @param NAME_PATTERN contain the correct pattern for First name and last name
     * @param PHONE_NUMBER_PATTERN contain the correct pattern for ohone number
    */
    private final String NAME_PATTERN = "^[A-Z]{1}[a-z]{2,10}$";
    private final String PHONE_NUMBER_PATTERN = "[0-9]{2}[\\s][0-9]{10}$";
    private final String PASSWORD_PATTERN = "^(?=.*\\d)([a-z])*(?=.*[A-Z])(?=.*[@#$%^&+=]).{8,}$";
    private final String EMAIL_PATTERN = "^[a-zA-Z0-9]{1,}[[.|+|-]a-zA-Z0-9]*@[a-zA-Z0-9]{1,}((.){1}+)([a-z]{1,3}+)(.[a-z]{2,3})*$";

    /**
     * @method validateFirstName Check the pattern for first name
     * @return boolean this returns true/false based on the firstname test result
     */

    public boolean validateFirstName(String firstName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        return result;
    }
    /**
     * @method validateFirstName Check the pattern for first name
     * @return boolean this returns true/false based on the firstname test result
     */
    public boolean validateLastName(String lastName) {
        Pattern pattern = Pattern.compile(NAME_PATTERN);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        return result;
    }

    /**
     * @method validatePhoneNumber Check the pattern for Phone Number
     * @return boolean this returns true/false based on the phoneNumber test result
     */
    public boolean validatePhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile(PHONE_NUMBER_PATTERN);
        Matcher matcher = pattern.matcher(phoneNumber);
        boolean result = matcher.matches();
        return result;
    }

    /**
     * @method validatePassword Check the pattern for Password
     * @return boolean this returns true/false based on the password test result
     */

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(PASSWORD_PATTERN);
        Matcher matcher = pattern.matcher(password);
        boolean result = matcher.matches();
        return result;
    }

    /**
     * @method validateEmail Check the pattern for email
     * @return boolean this returns true/false based on the email test result
     */

    public boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_PATTERN);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        return result;
    }
}
