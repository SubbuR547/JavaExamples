package com.java.practice.examples;

public class StringContains {

	public static void main(String[] args) {
		 String str = new String("virat and M.S.Dhoni are best Friends");
		  boolean str2 = str.contains("virat");
		  boolean str3 = str.contains("M.S.Dhoni");
		  boolean str4 = str.contains("VIRAT");
		   System.out.println("str2: " +str2);
		   System.out.println("str3: " +str3);
		   System.out.println("str4: " +str4);
	}

}
