package com.java.practice.examples;

public class Mensuration 
{ 
   private double l, b, r; 

   public double getL() { 
     return l; 
   } 
   public double getB() { 
     return b; 
   } 
   public double getR() { 
     return r; 
   } 

   public void setL(double l) { 
    this.l = l; 
   } 
   public void setB(double b) { 
    this.b = b; 
   } 
   public void setR(double r) { 
     this.r = r; 
   } 

   public double areaRec() { 
    double area = l * b; 
    return area; 
   } 
   public double perRec() { 
    double per = 2 * (l + b); 
     return per; 
   } 
   public double areaCircle() { 
    double area = 3.14 * r * r; 
     return area; 
   } 
   public double circumCircle() { 
    double circumference = 2 * 3.14 * r; 
    return circumference; 
   } 
}
