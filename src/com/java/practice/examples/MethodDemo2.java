package com.java.practice.examples;

public class MethodDemo2 {
	void add(int a, int b)
	{
		int c = a + b;
		System.out.println("Addition:"+c);
	}

	public static void main(String[] args) {
		MethodDemo2 m = new MethodDemo2();
		m.add(10,20);

	}

}
