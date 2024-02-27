package com.java.practice.examples;

public class ArrayDemo2 {

	public static void main(String[] args) {
		int i[]= {2,5,3,9,6};
		int sum = 0;
		int average;
	    for(int j=0;j<i.length;j++)
	    {
	    	sum=sum+i[j];
	    }
	    average=sum/i.length;
      System.out.println("average:"+average);
	}

}
