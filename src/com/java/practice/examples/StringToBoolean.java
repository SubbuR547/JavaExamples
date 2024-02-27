package com.java.practice.examples;

public class StringToBoolean {

	public static void main(String[] args) {
		String str1 = "true";
		String str2 = "TRUE";
		String str3 = "Yes";
		boolean b1 = Boolean.parseBoolean(str1);
		Boolean b2 = Boolean.valueOf(str2);
		boolean b3 = Boolean.parseBoolean(str3);
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
	}

}
