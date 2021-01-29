package com.kodilla.abstracts.homework;

public class ShapeProcessor {
    public static void main(String[] args) {
        Quadrat zadanie1 = new Quadrat();
        zadanie1.a = 10;
        System.out.println("Pole quadrat = " + zadanie1.Pole());
        System.out.println("Obwod quadrat = " + zadanie1.Obwod());

        Rectangle zadanie2 = new Rectangle();
        zadanie2.a = 5;
        zadanie2.b = 2;
        System.out.println("Pole rectangle =" + zadanie2.Pole());
        System.out.println("Obwod rectangle = " + zadanie2.Obwod());

        Triangle zadanie3 = new Triangle();
        zadanie3.a = 8;
        zadanie3.b = 4;
        zadanie3.c = 3;
        zadanie3.h = 5;
        System.out.println("Pole triangle =" + zadanie3.Pole());
        System.out.println("Obwod triangle = " + zadanie3.Obwod());


    }
}

