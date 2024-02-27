package com.java.practice.examples;

public class MethodDemo3 {
	int add()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;
				
	}

	public static void main(String[] args) {
		MethodDemo3 m =new MethodDemo3();
		int sum = m.add();
		System.out.println("Addition:"+sum);

	}

}
