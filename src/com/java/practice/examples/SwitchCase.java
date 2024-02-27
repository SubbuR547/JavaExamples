package com.java.practice.examples;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the Grade:");
		char grade = sc.next().charAt(0);
		
		switch(grade) {
		case 'A' :
			System.out.println("EXCELLENT!");
			System.out.println("Your grade is :"+ grade);

			break;
		case 'B' :
			System.out.println("GREAT!");		
			System.out.println("Your grade is :"+ grade);

			break;
		case 'C' :
			System.out.println("WELL DONE!");
			System.out.println("Your grade is :"+ grade);

			break;
		case 'D' :
			System.out.println("YOU PASSED!");
			System.out.println("Your grade is :"+ grade);

			break;
		case 'E' :
			System.out.println("better try again!");
			System.out.println("Your grade is :"+ grade);

			break;
		default :
			System.out.println("invalid grade!");

		}
		sc.close();
		//gSystem.out.println("Your grade is"+ grade);

	}

}
