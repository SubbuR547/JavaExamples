package com.java.practice.examples;

 class A2 
{ 
   void m11()
   { 
      System.out.println("A-m1"); 
   } 
   void m22()
   { 
      System.out.println("A-m2"); 
   } 
 } 
class B2 extends A2 
{ 
    void m22()
    { 
       System.out.println("B-m2"); 
    } 
    void m33()
    { 
       System.out.println("B-m3"); 
    } 
 } 
 public class MethodOveriddingTest { 
 public static void main(String[] args) 
 { 
    /*A2 a = new A2(); 
    a.m11(); 
    a.m22(); */
  
    B2 b = new B2(); 
    b.m11(); 
    b.m22(); 
    b.m33();
  
    /*A2 a1 = new B2(); 
    a1.m22(); 
    a1.m11();*/
  } 
 }