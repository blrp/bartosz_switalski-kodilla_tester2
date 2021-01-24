package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
    public Triangle() {
        super(60, 30);
    }

    @Override
    public void giveSurface() {
        System.out.println("60");

    }

    @Override
    public void givePerimeter() {
        System.out.println(30);

    }
}
