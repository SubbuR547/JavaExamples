package com.java.practice.examples;

public class ArraysDemo3 {

	
	public static void main(String[] args) {

		int i[] = {26666,5,1,9,655};
		int max =i[0];
		int index = 0;
	
		for( int j=0;j<i.length;j++)
	    {
	    	if(max<i[j])
	    	{
	    		max=i[j];
	    		index = j;
	    	}
	    }
		System.out.println("Maxvalue:"+max);
		System.out.println("index:"+index);
		
	}

}
