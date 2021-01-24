package com.kodilla.abstracts.homework;

public class Driver extends Job{

    public Driver(int salary, int responsibilities) {
        super(5000,1);
    }



    @Override
    public void giveSalary() {
        System.out.println("5000");

    }

    @Override
    public void giveResponsibilities() {
        System.out.println("drive");

    }
}
