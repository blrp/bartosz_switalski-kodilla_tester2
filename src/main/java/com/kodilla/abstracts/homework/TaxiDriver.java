package com.kodilla.abstracts.homework;

public class TaxiDriver extends Job{


    @Override
    double salary() {
        return 0;
    }

    @Override
    String responsibilities() {
        return null;
    }

    @Override
    public boolean showResponsibilities() {
        System.out.println("Driving people to various destination");

        return true;
    }
}
