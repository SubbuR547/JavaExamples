package com.java.practice.examples;

public class logicalOperators {

	public static void main(String[] args) {
		int x=47;
		System.out.println(x<5&&x>10);
		System.out.println(x>5&&x<10);
		System.out.println(x>5&&x>10);
		System.out.println(x<5||x>10);
		System.out.println(x>5||x<10);
		System.out.println(x>5||x>10);
		System.out.println(!(x<5&&x>10));
		System.out.println(!(x>5&&x<10));
		System.out.println(!(x>5&&x>10));

	}

}
