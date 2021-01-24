package com.kodilla.abstracts.homework;

public class ShapeProcessor {
    public void process(Shape shape) {
        System.out.println("Shape has " + shape.getNumberOfSurface()  + "surface ");
        shape.giveSurface();
        System.out.println("Shape has " + shape.getNumberOfPerimeter()  + "perimeter ");
        shape.givePerimeter();

    }
}

