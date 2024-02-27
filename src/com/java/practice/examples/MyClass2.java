package com.java.practice.examples;

 abstract class MyTest
{ 
   abstract void calculate(int a, int b); 
} 
 class Addition1 extends MyTest
{ 
   void calculate(int a, int b)
   { 
      int x = a + b; 
      System.out.println("sum: " +x);
   } 
} 
 class Subtraction extends MyTest 
{ 
   void calculate(int a, int b)
   { 
      int y = a - b; 
      System.out.println("substract: " +y); 
   } 
} 
 class Multiplication extends MyTest
{ 
   void calculate(int a, int b)
   { 
      int z = a * b; 
      System.out.println("multiply: " +z); 
   } 
} 
public class MyClass2 { 
public static void main(String[] args) 
{ 
    Addition1 a = new Addition1(); 
    Subtraction s = new Subtraction(); 
    Multiplication m = new Multiplication(); 
    a.calculate(20, 30); 
    s.calculate(10, 5); 
    m.calculate(10, 20); 

 } 
}
