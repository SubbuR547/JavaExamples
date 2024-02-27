package com.java.practice.examples;

public class ArraysDemo {

	public static void main(String[] args) {
		String s1[] = {"chai","coffee"};
		String s2[] = {"milk","water","cake"};
		String s3[] = {s1[0],s1[1],s2[0],s2[1],s2[2]};
		for(int i=0;i<s3.length;i++)
		{
			System.out.print(s3[i]+" ");
		}
	}

}
