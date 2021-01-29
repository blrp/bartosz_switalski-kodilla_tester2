package com.kodilla.abstracts.homework;

public class Builder extends Job {
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
        System.out.println("Builid houses");

        return true;
    }
}
