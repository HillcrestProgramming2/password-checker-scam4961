package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests possible outcomes to see if the prediction meets the actual output
 * for the methods EvaluateCriteria & DetermineStrength
 */
public class CriteriaCheckerTest {
    /**
     * Tests if the output score for a strong password will be 5 as predicted
     */
    @Test
    public void testEvaluateCriteria_shouldBe5__testEvaluateStrengthShouldBeStrong(){
        int score = CriteriaChecker.evaluateCriteria("Secure@2024");
        Assertions.assertEquals(5 ,score);
        Assertions.assertEquals("Strong",CriteriaChecker.determineStrength(score));

    }
    /**
     * Tests if the output score for a Moderate password will be 3 as predicted
     */
    @Test
    public void testEvaluateCriteria_shouldBe3__testEvaluateStrengthShouldBeModerate(){
        int score = CriteriaChecker.evaluateCriteria("password1234");
        Assertions.assertEquals(3 ,score);
        Assertions.assertEquals("Moderate",CriteriaChecker.determineStrength(score));
    }
    /**
     * Tests if the output score for a Weak password will be 1 as predicted
     */
    @Test
    public void testEvaluateCriteria_shouldBe1__testEvaluateStrengthShouldBeWeak(){
        int score = CriteriaChecker.evaluateCriteria("123");
        Assertions.assertEquals(1 ,score);
        Assertions.assertEquals("Weak",CriteriaChecker.determineStrength(score));
    }



}
