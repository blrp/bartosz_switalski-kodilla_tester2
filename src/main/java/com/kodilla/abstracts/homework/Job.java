package com.kodilla.abstracts.homework;

public abstract class Job {

    private int salary;
    private int responsibilities;

    public Job(int salary, int responsibilities ) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public int getSalary() {

        return salary;
    }
    public int getResponsibilities() {

        return responsibilities;
    }

    public abstract void giveSalary();


    public abstract void giveResponsibilities ();
}
