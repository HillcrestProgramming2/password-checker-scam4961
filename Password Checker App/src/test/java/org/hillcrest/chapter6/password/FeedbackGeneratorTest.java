package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests possible outcomes to see if the prediction meets the actual output
 * for the method GenerateFeedback
 */
public class FeedbackGeneratorTest {
    // this test checks if it returns the right phrases for a password missing zero things
    @Test
    public void testGenerateFeedback_ShouldReturnNothing() {
        String feedback = FeedbackGenerator.generateFeedback("Secure@2024");
        Assertions.assertEquals("",feedback);
    }
    // this test checks if it returns the right phrases for a password missing two things
    @Test
    public void testGenerateFeedback_ShouldReturnTwoPhrases() {
        String feedback = FeedbackGenerator.generateFeedback("password123");
        Assertions.assertEquals("Suggestions to improve your password: \n" +
                "- Add at least one uppercase letter.\n" +
                "- Include at least one special character.\n",feedback);
    }
    // this test checks if it returns the right phrases for a password missing four things
    @Test
    public void testGenerateFeedback_ShouldReturn4Problems() {
        String feedback = FeedbackGenerator.generateFeedback("1234");
        Assertions.assertEquals("Suggestions to improve your password: \n" +
                "- Increase the length to at least 8 characters. \n" +
                "- Add at least one lowercase letter.\n" +
                "- Add at least one uppercase letter.\n" +
                "- Include at least one special character.\n",feedback);
    }

}
