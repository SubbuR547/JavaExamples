package com.java.practice.examples;

public class DoubleToString {

	public static void main(String[] args) {
		double num = 589.999;
		String str = String.valueOf(num);
		String s1 = Double.toString(num);
		System.out.println(str);
		System.out.println(s1);
	}

}
