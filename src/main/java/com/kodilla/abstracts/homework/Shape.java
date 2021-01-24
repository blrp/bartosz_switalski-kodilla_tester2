package com.kodilla.abstracts.homework;

public abstract class Shape {
    private int numberOfSurface;
    private int numberOfPerimeter;

    public Shape(int numberOfSurface, int numberOfPerimeter) {
        this.numberOfSurface = numberOfSurface;
        this.numberOfPerimeter = numberOfPerimeter;
    }

    public int getNumberOfSurface() {

        return numberOfSurface;
    }
    public int getNumberOfPerimeter() {

        return numberOfPerimeter;
    }

    public abstract void giveSurface();


    public abstract void givePerimeter ();


}
