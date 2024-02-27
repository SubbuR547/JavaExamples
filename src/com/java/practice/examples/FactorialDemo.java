package com.java.practice.examples;

import java.util.Scanner;

public class FactorialDemo {

	public static void main(String[] args) {
		int i;
		int fact=1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int number=sc.nextInt();
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println(fact+" is a factorial of "+ number);
		System.out.println("Fibnosi series");
int n1=0,n2=1,n3,j,count=8;
System.out.println(n1);
System.out.println(n2);
for(j=2;j<count;++j)
{
	n3=n1+n2;
	System.out.println(n3);

n1=n2;
n2=n3;
}
	}

}
