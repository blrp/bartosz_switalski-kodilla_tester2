package com.kodilla.abstracts.homework;




public class Person {
    private int firstName;
    private int age;
    private int job;

    public static void main(String[] args) {
        Job driver = new Driver(5000,1);

        JobProcessor processor = new JobProcessor();
        processor.process(driver);
    }





}
