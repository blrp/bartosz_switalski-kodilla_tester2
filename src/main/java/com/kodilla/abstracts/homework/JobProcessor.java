package com.kodilla.abstracts.homework;

import com.kodilla.abstracts.Animal;

public class JobProcessor {
    public void process(Job job) {
        System.out.println("Job has " + job.getResponsibilities() + " responsibilities");
        job.giveResponsibilities();
    }
}
