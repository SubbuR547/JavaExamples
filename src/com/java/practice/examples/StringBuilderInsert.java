package com.java.practice.examples;

public class StringBuilderInsert {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("My name subhash.");
		sb.insert(8, "is ");
		System.out.println(sb);
	}

}
