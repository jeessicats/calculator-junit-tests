package com.jeessicats.calculator;

//import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();


    // This is an alternative to the above line, but it is not recommended in this case, as the calculator object is not being modified.
//    private Calculator calculator;

//    @BeforeEach
//    void setUp() {
//        calculator = new Calculator();
//    }

    @Test
    public void testAddZeroPlusZero() {
        int sum = calculator.add(0, 0);
        assertEquals(0, sum, "Was expecting sum of 0");
    }

    @Test
    public void testAddOnePlusOne() {
        int sum = calculator.add(1, 1);
        assertEquals(2, sum);
    }

    @Test
    public void testAddOnePlusMinusOne() {
        int sum = calculator.add(1, -1);
        assertEquals(0, sum);
    }

    @Test
    @Disabled
    // @Ignore is the JUnit 4 equivalent of @Disabled
    public void canAddMaxIntPlusOne() {
        int sum = calculator.add(Integer.MAX_VALUE, 1);
        assertEquals(Integer.MAX_VALUE + 1L, sum);
    }

    @Test
    public void annuityPayment() {
        String answer = calculator.calculateAnnuityPayment("22000", 7, ".06", 1);
        assertEquals("$184,664.43", answer);
    }

    @Test
    public void annuityPractice2() {
        String answer = calculator.calculateAnnuityPayment("1200", 10, ".08", 4);
        assertEquals("$72,482.38", answer);
    }

}
