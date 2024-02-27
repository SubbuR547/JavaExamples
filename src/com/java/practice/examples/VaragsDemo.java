package com.java.practice.examples;

public class VaragsDemo {
	static void fun(int... a) {
		System.out.println("Number of arguments: " + a.length);

		for (int i : a)
			System.out.print(i + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		fun(100);

		fun(1, 2, 3, 4);

		fun();
		fun(1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3);

	}

}
