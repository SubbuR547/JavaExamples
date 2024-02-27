package com.java.practice.examples;

import java.util.Scanner;

public class MethodOverloading {
public void area(int a) {
	int areaSqaure=a*a;
	System.out.println("area of sqaure:"+areaSqaure);
	
}
public void area(int l,int b) {
	int areaRectangle=l*b;
	System.out.println("area of rectangle:"+areaRectangle);
	
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length value:");
		int length=sc.nextInt();
		System.out.println("Enter breadth value:");
		int breadth=sc.nextInt();
		System.out.println("Enter side value:");
		int side=sc.nextInt();
		MethodOverloading mo =new MethodOverloading();
		mo.area(side);
		mo.area(length, breadth);
sc.close();
	}

}
