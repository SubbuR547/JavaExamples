package com.java.practice.examples;

class SuperClass 
{ 
  void msg(int x, int y) 
  { 
    System.out.println(x+y); 
  } 
 } 
class Subclass extends SuperClass 
{ 
  void msg(double x, double y) 
  { 
    System.out.println(x+y); 
  } 
} 
public class MethodOverloadingTest4 
{ 
  public static void main(String[] args) 
  { 
    Subclass sc = new Subclass(); 
     sc.msg(10, 20); 
     sc.msg(2.5, 3); 
   } 
 }