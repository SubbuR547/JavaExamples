package com.java.practice.examples;

public class ArrayDemo5 {

	public static void main(String[] args) {
		int arr[][] = {{1,8,4},{9,7,2},{7,6,4}};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				sum+=arr[i][j];
			}
		}
		System.out.println("sum:"+sum);

	}

}
