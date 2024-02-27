package com.java.practice.examples;

interface Printable 
{ 
 
    void print(); 
} 
interface Showable 
{ 
   void show();
} 

public class MultipleInherTest implements Printable, Showable 
{ 

   public void print() 
   { 
     System.out.println("VIRAT KOHLI"); 
   } 
  public void show() 
  { 
     System.out.println("M S DHONI"); 
  } 

public static void main(String[] args) 
{ 
    MultipleInherTest obj = new MultipleInherTest(); 
    obj.print(); 
    obj.show(); 
  } 
} 
