package com.java.practice.examples;

public class NestedIf {

	public static void main(String[] args) {
		int x,y,z;
		x= 10;
				y = 20;
				z = 30;
		if(x >= y)
		{
			if(x >= z)
			{
				System.out.println("x is the largest");
			}
			else
			{
				System.out.println("z is the largest");
			}
		} else {
			if(y >= z)
			{
				System.out.println("y is the largest");
			}
			else
			{
				System.out.println("z is the largest");
			}
		}

	}

}
