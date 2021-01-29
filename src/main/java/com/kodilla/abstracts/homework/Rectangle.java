package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
   public double a, b;

   public double Pole()
   {
       return a*b;
   }

   public double Obwod()
   {
       return 2*a + 2*b;
   }
}
