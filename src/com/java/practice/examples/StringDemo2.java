package com.java.practice.examples;
import java.util.Scanner;
public class StringDemo2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first name");
        String fname= sc.next();
        System.out.println("Enter second name");
        String lname= sc.next();
        String fullname=fname+lname;
        System.out.println(fullname);
        sc.close();

	}

}
