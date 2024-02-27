package com.java.practice.examples;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		int length=sb.length();
		int capacity=sb.capacity();
		System.out.println("before adding:\n"+"lenghth:"+length+"\n"+"capacity:"+capacity);
		sb.append("0123456789123456");
		
		System.out.println("after adding:\n"+"lenghth:"+sb.length()+"\n"+"capacity:"+sb.capacity());
		sb.append("7");
		System.out.println("after adding:\n"+"lenghth:"+sb.length()+"\n"+"capacity:"+sb.capacity());
		sb.append("80123456789123456");
		System.out.println("after adding:\n"+"lenghth:"+sb.length()+"\n"+"capacity:"+sb.capacity());
		sb.append("9");
		System.out.println("after adding:\n"+"lenghth:"+sb.length()+"\n"+"capacity:"+sb.capacity());

	}
}
