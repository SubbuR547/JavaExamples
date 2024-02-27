package com.java.practice.examples;

public class StringToDouble {

	public static void main(String[] args) {
		 String str = "50699.60";  
		   double num = Double.parseDouble(str); 
		   Double d1 = Double.valueOf(str);
		   System.out.println(num);
		   System.out.println(d1);
	}

}
