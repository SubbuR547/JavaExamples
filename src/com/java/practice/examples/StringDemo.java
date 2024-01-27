package com.java.practice.examples;
import java.util.Scanner;
public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter first number");
         String i= sc.next();
         System.out.println("Enter second number");
         String j= sc.next();
         String sum=i+j;
         System.out.println("Result: "+ sum);
         sc.close();
	}

}
