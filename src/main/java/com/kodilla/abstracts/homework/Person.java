package com.kodilla.abstracts.homework;




public class Person {
    private String FirstName;
    private int age;
    private String Job;

    public static void main(String[] args) {


        Builder builder= new Builder();
        builder.showResponsibilities();
        System.out.println(builder.showResponsibilities());


        TaxiDriver taxidriver = new TaxiDriver();
        taxidriver.showResponsibilities();
        System.out.println(taxidriver.showResponsibilities());
    }
    }







