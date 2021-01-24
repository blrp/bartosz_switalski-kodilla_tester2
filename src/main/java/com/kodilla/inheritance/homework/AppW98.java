package com.kodilla.inheritance.homework;

public class AppW98 {
    public static void main(String[] args) {
        OperatingSystem operatingsystem = new OperatingSystem(1998);
        operatingsystem.turnOn();

        Windows98 windows98 = new Windows98(1998);
        windows98.displayYearOfPublishment();
    }
}

