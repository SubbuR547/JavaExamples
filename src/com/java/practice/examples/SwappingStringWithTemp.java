package com.java.practice.examples;

public class SwappingStringWithTemp {

	public static void main(String[] args) {
		String s1 = "Subhash";
		  String s2 = "Royal";
		  System.out.println("Before swapping, s1 = " +s1+ ", s2 = "+s2 ); 
		  String temp = s1;
		   s1 = s2;
		   s2 = temp;
		   System.out.println("After swapping, s1 = " +s1+ ", s2 = "+s2 );
	}

}
