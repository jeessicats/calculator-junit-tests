package com.jeessicats.calculator;

import org.junit.jupiter.api.BeforeEach;
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

}
