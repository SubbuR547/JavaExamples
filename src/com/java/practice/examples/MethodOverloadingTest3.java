package com.java.practice.examples;

public class MethodOverloadingTest3 
{ 
  void multiply(int a, double b) 
  { 
    double m1 = a * b; 
    System.out.println("Multiplication of two numbers: " +m1); 
  } 
void multiply(double a, int b) 
{ 
  double m2 = a * b; 
  System.out.println("Multiplication of two numbers: " +m2); 
 } 
public static void main(String[] args) 
{ 
   MethodOverloadingTest3 m = new MethodOverloadingTest3(); 
   m.multiply(10, 20.5); 
   m.multiply(10.5, 30); 
  } 
}