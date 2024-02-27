package com.java.practice.examples;

 class Marry 
{ 
   void engagementDate() 
   { 
      System.out.println("Engagement will be done on 23 Dec."); 
   } 
   void marryDate() 
   { 
      System.out.println("Marry will be on 25 Dec"); 
   } 
}
 class Change 
{ 
   void marryDate() 
   { 
     System.out.println("Marry will be on 27 Dec"); 
   } 
 } 
public class MyClass3 { 
public static void main(String[] args) 
{ 
     Change obj = new Change(); 
    // obj.engagementDate(); 
     obj.marryDate(); 
 } 
}
