package com.java.practice.examples;

public class StringBuilderDelete {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("My name is subhash Royal.");
		sb.delete(10, 18);
		System.out.println(sb);
		sb.deleteCharAt(16);
		System.out.println(sb);
	}

}
