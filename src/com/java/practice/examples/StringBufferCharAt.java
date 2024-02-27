package com.java.practice.examples;

public class StringBufferCharAt {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("subbu");
		   System.out.println("Buffer before: " + sb);
		   System.out.println("charAt(1) before: " + sb.charAt(1));
		   
		   sb.setCharAt(4, 'i');
		   
		   System.out.println("Buffer after setting charAt: " + sb);
		   System.out.println("charAt(1) after = " + sb.charAt(1));
	}

}
