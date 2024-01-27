package com.java.practice.examples;

public class SwitchCase {

	public static void main(String[] args) {
		char grade = 'C';
		switch(grade) {
		case 'A' :
			System.out.println("EXCELLENT!");
			break;
		case 'B' :
			System.out.println("GREAT!");
			break;
		case 'C' :
			System.out.println("WELL DONE!");
			break;
		case 'D' :
			System.out.println("YOU PASSED!");
			break;
		case 'E' :
			System.out.println("better try again!");
			break;
		default :
			System.out.println("invalid grade!");
		}
		System.out.println("Your grade is"+ grade);

	}

}
