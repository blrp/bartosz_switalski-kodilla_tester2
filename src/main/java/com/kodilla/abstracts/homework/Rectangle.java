package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle() {
        super(200, 140);
    }

    @Override
    public void giveSurface() {
        System.out.println("200");

    }

    @Override
    public void givePerimeter() {
        System.out.println("140");

    }
}
