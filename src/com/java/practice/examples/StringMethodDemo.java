package com.java.practice.examples;

import java.util.Scanner;

public class StringMethodDemo {

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the city Name");
		String name = sc.nextLine().toLowerCase().trim();
		if(name.equals("hyderabad"))
		{
			System.out.println("Hello Hyderabadi!!!!!....");
		}
		else if(name.equals("vizag"))
		{
			System.out.println("Hello Andhrawala!!!.....");
		}
		else if(name.equals("bangalore"))
		{
			System.out.println("Hello Kannadiga!!!1....");
		}
		else
		{
			System.out.println("Enter valid city name");
		}
		sc.close();

	}
	

}
