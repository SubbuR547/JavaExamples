package com.java.practice.examples;

public class StringBufferIndex {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("My name is subhash");
	    System.out.println("Original StringBuffer: " + sb);
	    int i;
	    i = sb.indexOf("is");
	    System.out.println("First index: " + i);
	    i = sb.lastIndexOf("dub");
	    System.out.println("Last index: " + i);
	}

}
