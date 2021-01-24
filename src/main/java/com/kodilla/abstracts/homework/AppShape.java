package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.AnimalProcessor;

public class AppShape {
    public static void main(String[] args) {
       Shape quadrat = new Quadrat();
       Shape rectangle = new Rectangle();
       Shape triangle = new Triangle();

        ShapeProcessor processor = new ShapeProcessor();
        processor.process(quadrat);

    }
}
