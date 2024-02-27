package com.java.practice.examples;

public class ArrayDemo8 {

	public static void main(String[] args) {
		int arr1[][] = {
				{1,2,1},
				{9,7,2},
				{7,6,4}
				};
		int arr2[][] = {
				{1,6,1},
				{0,7,3},
				{1,6,4}
				};
		System.out.println("First array:");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]);
			}
			System.out.println();
		}
		System.out.println("Second array:");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]);
			}
			System.out.println();
		}
		System.out.println("Final Array:");
		int arr3[][]= new  int[3][3];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				if(arr1[i][j]==arr2[i][j])
				{
					arr3[i][j]=1;
				}
				else
				{
					arr3[i][j]=0;
				}
				System.out.print(arr3[i][j]);
			}
			System.out.println();
		}


	}

}
