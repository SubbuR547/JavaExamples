package com.java.practice.examples;

public class StringBufferInsert {

	public static void main(String[] args) {
		 StringBuffer sb = new StringBuffer("My Name Subhash");
		    System.out.println("Original StringBuffer: " + sb);
		    sb.insert(2, " is");
		    System.out.println("New StringBuffer: " +sb);
	}

}
