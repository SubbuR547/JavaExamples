package com.java.practice.examples;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {
		String[] countries = { "USA", "South-Africa", "India", " Australia", "Denmark", "France", "Italy", "Germany" };
		int size = countries.length;

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				if (countries[i].compareTo(countries[j]) > 0) {
					String temp = countries[i];
					countries[i] = countries[j];
					countries[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(countries));
	}

}
