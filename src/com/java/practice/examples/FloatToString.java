package com.java.practice.examples;

public class FloatToString {

	public static void main(String[] args) {
		float num = 59.89f;
		String str = String.valueOf(num);
		String s1 = Float.toString(num);
		System.out.println(str);
		System.out.println(s1);
	}

}
