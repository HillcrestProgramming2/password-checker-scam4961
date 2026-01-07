package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Tests possible outcomes to see if the prediction meets the actual output
 * for the methods EvaluateCriteria & DetermineStrength
 */
public class CriteriaCheckerTest {
    @Test
    public void testEvaluateCriteria_shouldBe5__testEvaluateStrengthShouldBeStrong(){
        int score = CriteriaChecker.evaluateCriteria("Secure@2024");
        Assertions.assertEquals(5 ,score);
        Assertions.assertEquals("Strong",CriteriaChecker.determineStrength(score));

    }

    @Test
    public void testEvaluateCriteria_shouldBe3__testEvaluateStrengthShouldBeModerate(){
        int score = CriteriaChecker.evaluateCriteria("password1234");
        Assertions.assertEquals(3 ,score);
        Assertions.assertEquals("Moderate",CriteriaChecker.determineStrength(score));
    }
    @Test
    public void testEvaluateCriteria_shouldBe1__testEvaluateStrengthShouldBeWeak(){
        int score = CriteriaChecker.evaluateCriteria("1234");
        Assertions.assertEquals(1 ,score);
        Assertions.assertEquals("Weak",CriteriaChecker.determineStrength(score));
    }



}
