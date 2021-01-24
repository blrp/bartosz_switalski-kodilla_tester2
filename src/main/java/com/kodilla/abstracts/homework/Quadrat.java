package com.kodilla.abstracts.homework;

public class Quadrat extends Shape {
    public Quadrat() {
        super(100, 80);
    }

    @Override
    public void giveSurface() {
        System.out.println("100");

    }

    @Override
    public void givePerimeter() {
        System.out.println("80");

    }

}




