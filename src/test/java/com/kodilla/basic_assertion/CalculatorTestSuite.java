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
        boolean correct = ResultChecker.assertEquals(3, subtractResult);
        if (correct) {
            System.out.println("Metoda subtract działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }
    }
    @Test
    public void testPOW() {
        Calculator calculator = new Calculator();
        int a = 8;
        int powResult = calculator.pow(a);
        boolean right = ResultChecker.assertEquals(64, powResult);
        if (right) {
            System.out.println("Metoda pow działa poprawnie dla liczb " + a);
        } else {
            System.out.println("Metoda pow nie działa poprawnie dla liczb " + a);
        }
        if (a < 0) {
            System.out.println("Wynik jest mniejszy od zera");
        }else if (a > 0){
            System.out.println("Wynik jest większy od zera");
        }else {
            System.out.println("Wynik musi być większy od zera");
        }
        if(a == 0) {
            System.out.println("Wynik jest równy zeru");

        }
    }
}
