package com.kodilla.abstracts.homework;

public class Cook extends Job{
    public Cook(int salary, int responsibilities) {
        super(3000, 2);
    }

    @Override
    public void giveSalary() {
        System.out.println("3000");

    }

    @Override
    public void giveResponsibilities() {
        System.out.println("cook");

    }
}
