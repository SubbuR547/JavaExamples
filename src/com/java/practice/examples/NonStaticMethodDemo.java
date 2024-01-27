package com.java.practice.examples;

public class NonStaticMethodDemo {
	public int add(int a, int b)  
	{  
	int s = a+b;  
	return s;  
	}  

	public static void main(String[] args) {
		NonStaticMethodDemo obj =new NonStaticMethodDemo();
		System.out.println("The sum is: "+obj.add(12, 13));  

	}

}
