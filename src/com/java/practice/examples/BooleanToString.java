package com.java.practice.examples;

public class BooleanToString {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		String str1 = String.valueOf(b1);
		String str2 = Boolean.toString(b2);
		System.out.println("String representation of boolean value: " + str1);
		System.out.println("String representation of boolean value: " + str2);
	}

}
