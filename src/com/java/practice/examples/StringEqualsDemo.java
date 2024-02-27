package com.java.practice.examples;

public class StringEqualsDemo {

	public static void main(String[] args) {
		String s="SUBHASH";
		String s1="SUBHASH"; 
		System.out.println(s.equals(s1));
		System.out.println(s.equals("subhash"));
		System.out.println(s.equalsIgnoreCase("subhash"));
	}

}
