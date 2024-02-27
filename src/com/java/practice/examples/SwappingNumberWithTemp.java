package com.java.practice.examples;

import java.util.Scanner;

public class SwappingNumberWithTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, temp;
		System.out.println("Enter your first number: ");
		x = sc.nextInt();
		System.out.println("Enter your second number: ");
		y = sc.nextInt();
		System.out.println("Before swapping, x = " + x + ", y = " + y);
		temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping, x = " + x + ", y = " + y);
		sc.close();
	}

}
