package com.java.practice.examples;

public class BreakCondition {

	public static void main(String[] args) {
		int x=20;
		while(x<30)
		{
			if(x==25)
			{
				break;
			}
			System.out.println("value of x:"+x);
			x++;
		}

	}

}
