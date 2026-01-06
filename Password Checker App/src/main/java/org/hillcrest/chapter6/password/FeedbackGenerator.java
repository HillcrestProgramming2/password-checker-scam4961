package org.hillcrest.chapter6.password;

/**
 * utility class for generating feedback based on password
 */
public class FeedbackGenerator {
    /**
     * Generates a single feedback string for improving the password.
     * @param password - the password
     * @return - the single feedback string
     */
    public static String generateFeedback(String password){
        String feedback = "";
        // checks if the password had erros before adding the suggestion message
        if (!(CriteriaChecker.evaluateCriteria(password) == 5)){
            feedback += "Suggestions to improve your password: \n";
        }


        boolean hasLowerCase = false;
        boolean hasUpperCase = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;

        String special = "!@#$%^&*()-+=";
        // checks if the password does not meet length criteria
        if (password.length() < 8){
            feedback += "- Increase the length to at least 8 characters. \n";
        }
        // checks if meets the other criterias
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
        // adds a feedback message for each criteria the password hasn't met
        if (!hasLowerCase) {feedback += "- Add at least one lowercase letter.\n"; }
        if (!hasUpperCase) {feedback += "- Add at least one uppercase letter.\n";}
        if (!hasNumber) {feedback += "- Add at least one number\n";}
        if (!hasSpecial) {feedback += "- Include at least one special character.\n";}

        return feedback;


    }
}
