package com.java.practice.examples;

public class Pattern13 {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) 
	    { 
			 for(int j = 0; j < (9-i); j++) 
			{ 
			 System.out.print(" ");
			} 
		    for(int k = 0; k <=i; k++) 
		    { 
		      System.out.print("*"+" "); 
			} 
	        System.out.println(); 
		}
		for(int i = 0; i < 9; i++) 
	    { 
			 for(int j = 0; j <= i; j++) 
			{ 
			 System.out.print(" ");
			} 
		    for(int k = 0; k <(9-i); k++) 
		    { 
		      System.out.print("*"+" "); 
			} 
	        System.out.println(); 
		}


	}
}
