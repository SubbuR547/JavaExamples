package com.java.practice.examples;

import java.util.Scanner;

public class StringConcatDemo {

	public static void main(String[] args) {
		/*String s="Subhash";
		s=s.concat("Royal");
		System.out.println(s);*/
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first name");
        String s1= sc.next();
        System.out.println("Enter second name");
        String s2= sc.next();
        String s3=s1.concat(s2);
        System.out.println("concatenation of string:"+s3);
		sc.close();
	}

}
