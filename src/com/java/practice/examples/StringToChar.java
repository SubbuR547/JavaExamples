package com.java.practice.examples;

public class StringToChar {

	public static void main(String[] args) {
		String str = "SubhashRoyal";
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			System.out.println("char at index " + i + ": " + ch[i]);
		}
	}

}
