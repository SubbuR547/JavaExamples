package com.java.practice.examples;

public class ContinueCondition {

	public static void main(String[] args) {
		int x=10;
		while(x<20)
		{
			x++;
			if(x==15)
			{
				continue;
			}
			System.out.println("value of x:"+x);
		}

	}

}
