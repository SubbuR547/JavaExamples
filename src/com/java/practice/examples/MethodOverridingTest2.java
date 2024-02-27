package com.java.practice.examples;

class College 
{ 
   public void collegeName()
   { 
      System.out.println("Name of my college is PIET "); 
   } 

   void estYear()
   { 
      System.out.println("It was established in 1999"); 
   } 
 } 
class MyCollege extends College 
{ 
   protected void estYear()
   { 
      System.out.println("It was established in 2001"); 
   } 
 } 
public class MethodOverridingTest2 { 
public static void main(String[] args) 
{ 
    MyCollege mc = new MyCollege(); 
    mc.collegeName(); 
    mc.estYear(); 
  
    College c = new MyCollege(); 
    c.estYear(); 
  } 
}

