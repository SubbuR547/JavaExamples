package com.java.practice.examples;

public class StringBufferDelete {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("My name is subhash");
		   System.out.println("Original StringBuffer: " + sb);
		   sb.delete(0, 9);
		  
		   System.out.println("After delete: " + sb);
		   sb.deleteCharAt(0);
		   System.out.println("After deleteCharAt: " + sb);
	}

}
