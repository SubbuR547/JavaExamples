package com.java.practice.examples;

public class StringBufferReplace {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("My name is kishore");
	    System.out.println("Original StringBuffer: " + sb);
	    sb.replace(11,18, "subhash");
	    System.out.println("After replace: " +sb);
	    
	}

}
