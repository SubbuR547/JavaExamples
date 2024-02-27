package com.java.practice.examples;

public class StringBuffer2ndway {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Subhash");
		int length=sb.length();
		int capacity=sb.capacity();
		System.out.println("length of String:"+length+"\n"+"Capacity of string:"+capacity);
	}

}
