package com.java.practice.examples;
public class MethodOverloadingTest 
{ 
   void sum(int a, int b) 
   { 
     int s = a + b; 
     System.out.println("Sum of two numbers: " +s); 
   }


   void sum(int a, int b, int c) 
   { 
     int t = a + b + c; 
     System.out.println("Sum of three numbers: " +t); 
   } 
public static void main(String[] args) 
{ 
   MethodOverloadingTest a = new MethodOverloadingTest(); 
    a.sum(10, 20); 
    a.sum(50, 100, 20); 
  } 
 }
