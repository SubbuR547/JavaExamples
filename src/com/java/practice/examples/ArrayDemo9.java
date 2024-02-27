package com.java.practice.examples;

public class ArrayDemo9 {

	public static void main(String[] args) {
		int arr1[][] = {
				{1,2,1},
				{9,7,2},
				{7,6,4}
				};
		int arr2[][] = {
				{2,6,8,6},
				{0,1,3,9,7},
				{7,2,0},
				{8,3}
				};
		int result = 0;
		System.out.println("First array:");
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Second array:");
		for(int i=0;i<arr2.length;i++)
		{
			for(int j=0;j<arr2[i].length;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Common Elements:");
		boolean isfound=false;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr1[i].length;j++)
			{
		       result=arr1[i][j];
		       for(int k=0;k<arr1.length;k++)
				{
		    	   isfound=false;
					for(int l=0;l<arr1[k].length;l++)
					{
				       if(result==arr2[k][l])
				       {
				    	 System.out.println(result);
				    	 isfound=true;
				    	 break;
				       }
					}
					   if(isfound)
							break;
					
				}
		       
			}
		}
	}

}
