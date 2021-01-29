package com.kodilla.abstracts.homework;

public class Triangle extends Shape{
   public double a, b, h, c;

   public double Pole()
   {
       return 0.5*a*h;
   }
   public double Obwod()
   {
       return a+b+c;
   }

}
