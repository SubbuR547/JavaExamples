package com.java.practice.examples;

public class StringToFloat {

	public static void main(String[] args) {
		String str = "50.60";
		float num = Float.parseFloat(str);
		Float f1 = Float.valueOf(str);
		System.out.println(num);
		System.out.println(f1);
	}

}
