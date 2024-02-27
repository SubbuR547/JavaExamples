package com.java.practice.examples;

public class StringBuildertoStringSubString {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Subhash Royal");
		   String str = sb.toString();
		   System.out.println("String form of StringBuilder: " +str);
		   String s1 = sb.substring(0, 7);
		   System.out.println("Substring: " +s1);
	}

}
