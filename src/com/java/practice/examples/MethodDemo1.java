package com.java.practice.examples;

public class MethodDemo1 {
	void add()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Addition:"+c);
	}
	int add(int a,int b) {
		int c = a + b;
		System.out.println("Addition:"+c);
		return c;
	}
	
	public static void main(String[] args) {
		MethodDemo1 M1 = new MethodDemo1();
				M1.add();
                M1.add(40,50);
	}

}
