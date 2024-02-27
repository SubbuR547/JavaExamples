package com.java.practice.examples;

public class StringSplitIntoArray {

	public static void main(String[] args) {
		String str = "virat scores 254 runs against England.";
		 String[ ] s;
		       s = str.split(" ");
		 for (String str1 : s) {
			System.out.println(str1);
		}
	}

}
