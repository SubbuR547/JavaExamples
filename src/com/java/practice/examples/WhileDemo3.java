package com.java.practice.examples;

public class WhileDemo3 {

	public static void main(String[] args) {
		WhileDemo3 whiledemo3 = new WhileDemo3();
		whiledemo3.star();

		}
	
	public void star()
	{
		for(int i=0;i<6;i++)
		{
			for(int j=6;j>i;j--)
		{
	        System.out.print("*");
		}
			System.out.println();
		}
		for(int i=1;i<6;i++)
		{
			for(int j=0;j<=i;j++)
		{
	        System.out.print("*");
		}
			System.out.println();
		}
		
	}
	}

