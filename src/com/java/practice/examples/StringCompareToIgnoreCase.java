package com.java.practice.examples;

public class StringCompareToIgnoreCase {

	public static void main(String[] args) {
		String str = "Subhash";
		 String s = "subhash";
		 int x = str.compareTo(s);
		 System.out.println("str.compareTo(s): " +x);
		 int y = str.compareToIgnoreCase(s);
		 System.out.println("str.compareToIgnoreCase(s): " +y);
	}

}
