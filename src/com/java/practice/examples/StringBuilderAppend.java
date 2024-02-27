package com.java.practice.examples;

public class StringBuilderAppend {

	public static void main(String[] args) {
		String s;
		StringBuilder sb = new StringBuilder("Subhash ");
		StringBuilder sb2 = sb.append("Royal");
		System.out.println("New string: " + sb2);

		int rollno = 547;
		s = sb.append(" ").append(rollno).append("!").toString();
		System.out.println(s);
	}

}
