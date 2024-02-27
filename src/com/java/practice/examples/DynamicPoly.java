package com.java.practice.examples;

 class Base 
{ 
  void m1() 
  { 
    System.out.println("m1-Base"); 
  } 
} 
class Derived extends Base 
{ 
  void m1() 
  { 
    System.out.println("m1-Derived"); 
  } 
} 
public class DynamicPoly 
{ 
  public static void main(String [] args) 
  { 
     Derived d = new Derived(); 
      d.m1(); 
    
    Base b = new Base(); 
       b.m1(); 
   } 
 }
