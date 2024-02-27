package com.java.practice.examples;

public class MethodOverloadingTest2
{ 
   int sub( int x, int y) 
   { 
      int a = x - y; 
      System.out.println("Subtraction of two numbers: " +a); 
      return a; 
   } 
   double sub(double x, double y) 
   { 
     double b = x - y; 
     System.out.println("Subtraction of two numbers: " +b); 
     return b; 
   } 
public static void main(String[] args) 
{ 
   MethodOverloadingTest2 s = new MethodOverloadingTest2(); 
    s.sub(6, 5); 
    s.sub(20.8, 10.9); 
  } 
}
