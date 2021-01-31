package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 5;
        int subtractResult = calculator.subtract(a, b);
       assertEquals(3, subtractResult);

    }
    @Test
    public void testPOW() {
        Calculator calculator = new Calculator();
        int a = 8;
        int powResult = calculator.pow(a);
      assertEquals(64, powResult);

    }
}
