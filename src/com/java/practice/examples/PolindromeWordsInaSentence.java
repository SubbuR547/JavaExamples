package com.java.practice.examples;

import java.util.Scanner;

public class PolindromeWordsInaSentence {
	public static void isPalindrome(String str) {
		String word = "", rev = "";
		char ch;
		int len = str.length();
		for (int i = 0; i < len; i++) {
			ch = str.charAt(i);
			if (ch != ' ') {
				word = word + ch;
				rev = ch + rev;
			} else {
				if (word.equalsIgnoreCase(rev))
					System.out.println("Palindrome word: " + word);
				word = "";
				rev = "";
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a sentence: ");
		String s = sc.nextLine();
		isPalindrome(s);
		sc.close();
	}

}
