package com.kodilla.abstracts.homework;

public abstract class Job {

   abstract double salary();
   abstract String responsibilities();

   public boolean showResponsibilities() {
      System.out.println("Job responsibilities");
      return true;
   }


}
