package com.java.practice.examples;
import java.util.Scanner;
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number");
         int i= sc.nextInt();
         System.out.println("Enter second number");
         int j= sc.nextInt();
         int sum=i+j;
         System.out.println("Result: "+ sum);
         sc.close();
	}

}
