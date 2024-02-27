package com.java.practice.examples;

public class ArrayDemo4 {
	public static void main(String[] args) {
		int arr1[][] = {
				{1,8,4},
				{9,7,2},
				{7,6,4}
				};
		System.out.println("First array:");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Transposing array:");
		int arr2[][]= new  int[3][3];
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				arr2[i][j]=arr1[j][i];
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}

		
	}

}
