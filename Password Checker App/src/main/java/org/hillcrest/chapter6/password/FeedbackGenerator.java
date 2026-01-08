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

        // checks if the password does not meet length criteria
        if (!CriteriaChecker.isHasLength()){
            feedback += "- Increase the length to at least 8 characters. \n";
        }

        // adds a feedback message for each criteria the password hasn't met
        if (!CriteriaChecker.isHasLowerCase()) {feedback += "- Add at least one lowercase letter.\n"; }
        if (!CriteriaChecker.isHasUpperCase()) {feedback += "- Add at least one uppercase letter.\n";}
        if (!CriteriaChecker.isHasNumber()) {feedback += "- Add at least one number\n";}
        if (!CriteriaChecker.isHasSpecial()) {feedback += "- Include at least one special character.\n";}

        return feedback;


    }
}
