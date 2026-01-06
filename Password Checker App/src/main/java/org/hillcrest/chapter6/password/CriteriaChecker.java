package org.hillcrest.chapter6.password;

/**
 * Utility class that evaluates a password against specific criteria.
 */
public class CriteriaChecker {

    /**
     * Checks if a password meets certain conditions
     * @param password - the password inputted by the user
     * @return - a score out of 5
     */
    public static int evaluateCriteria(String password) {
        int score = 0;
        boolean hasLength = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        String special = "!@#$%^&*()-+=";

        // checks if the password has a length of at least 8 characters
        if (password.length() >= 8) {
            hasLength = true;
            score += 1;
        }

        // checks if the other four conditions are met
        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (special.contains(String.valueOf(c))) {
                hasSpecial = true;
            } else if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }
            // increases the score by one for each condition it has met
            if (hasLowerCase) {score += 1;}
            if (hasUpperCase) {score += 1;}
            if (hasNumber) {score += 1;}
            if (hasSpecial) {score += 1;}

            return score;
        }

    /**
     * Returns Weak, Moderate, or Strong based on the score
     * @param score - the criteria score
     * @return - the strength of a password
     */
    public static String determineStrength(int score) {
           if (score >= 0 && score <= 2){return "Weak";}
           else if (score == 3){return "Moderate";}
           else if (score == 4 || score == 5){return "Strong";}
           else {return "Not a valid score"; }
        }

    }



