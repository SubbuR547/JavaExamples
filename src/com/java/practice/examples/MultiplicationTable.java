package com.java.practice.examples;

import java.util.*;

public class MultiplicationTable {
	public void multiplication(int tablenumber) {
		int result;
		for (int i = 1; i <= 10; i++) {
			result = table * i;
			System.out.println(table + "*" + i + "=" + result);

		}
	}

	static int table;

	public static void main(String[] args) {
		System.out.println("enter the number :");
		Scanner s = new Scanner(System.in);
		table = s.nextInt();
		MultiplicationTable MT = new MultiplicationTable();
		MT.multiplication(table);

		s.close();
	}

}
