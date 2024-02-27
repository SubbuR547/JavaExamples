package com.java.practice.examples;

public class ForEach1 {
public static void main(String[] args) {
	int arr[]= {2,5,1,9,6};
	int sum = 0;
	for (int i : arr) 
	{
		System.out.println(i);
		sum+=i;
	}
	System.out.println(sum);
}
}
