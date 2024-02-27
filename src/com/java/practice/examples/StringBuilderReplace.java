package com.java.practice.examples;

public class StringBuilderReplace {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("My name are Subhash.");
		System.out.println(sb);
		sb.replace(8, 11, "is");
		System.out.println(sb);
	}

}
