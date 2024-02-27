package com.java.practice.examples;

public class TestDemo1 {
	public static void main(String[] args) {
	Mensuration mens; // Creating reference. 
    mens = new Mensuration(); // Creating object.
 
// Set the values of the variables. 
   mens.setL(20.5); 
   mens.setB(30.5); 
   mens.setR(12.5); 

// Call getter methods.  
   double areaRec = mens.areaRec(); 
   double perRec = mens.perRec(); 
   double areaCircle = mens.areaCircle(); 
   double circumCircle = mens.circumCircle(); 

   System.out.println("Area of rectangle: " +areaRec); 
   System.out.println("Perimeter of rectangle: " +perRec); 
   System.out.println("Area of circle: " +areaCircle); 
   System.out.println("Circumference of circle: " +circumCircle); 
 } 
}