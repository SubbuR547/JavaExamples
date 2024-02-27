package com.java.practice.examples;

public class StringBufferToGetChars {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Subhash Royal");
		System.out.println(sb);
		char[] c=new char[9];
		sb.getChars(0, 8, c, 0);
		System.out.println("After usage of getChars methods");
		for (char arc : c) {
			System.out.print(arc);
		}
		
		

	}

}
