package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

public class CalculatorTestSuite3 {
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
