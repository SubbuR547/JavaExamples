package com.java.practice.examples;

public class StringToLong {

	public static void main(String[] args) {
		String text = "9848583622";
		long num = Long.parseLong(text);
		Long l1 = Long.valueOf(text);
		System.out.println(num);
		System.out.println(l1);
	}

}
