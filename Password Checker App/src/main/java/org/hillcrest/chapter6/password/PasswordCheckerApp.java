package org.hillcrest.chapter6.password;

import java.util.Scanner;

/**
 * This class contains the main method, which serves as the application entry point.
 * It handles input/output operations and coordinates interactions between the user and the other classes.
 * Instance Variables: None
 */
public class PasswordCheckerApp {
    //main method goes here
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //prompt user for password
        System.out.print("Enter a password: ");


        String password = in.nextLine();

        //Check strength
        int score = CriteriaChecker.evaluateCriteria(password);

        String strength = CriteriaChecker.determineStrength(score);

        String feedback = FeedbackGenerator.generateFeedback(password);

        //Provide user feedback based on the strength
        System.out.printf("""
                Password Strength: %s (%d/5)
                %s
                """,strength,score,feedback);







    }
}
