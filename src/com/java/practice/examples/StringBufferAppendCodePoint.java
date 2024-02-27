package com.java.practice.examples;

public class StringBufferAppendCodePoint {

	public static void main(String[] args) {

	    StringBuffer sb1 = new StringBuffer("Subhash");
	    StringBuffer sb2 = sb1.append(" Royal");
	    StringBuffer sb3 = sb2.appendCodePoint(65);
	    System.out.println(sb3);
	}

}
