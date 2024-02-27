package com.java.practice.examples;

public class ArraysDemo4 {
	public static void main(String[] args) {
		String i[] = {"coffe","war","chai","dietcoke"};
	      String min =i[0];
	      int j;
	      int index = 0;
		for(j=0;j<i.length;j++)
	    {
	    	if(i[j].length()<min.length())
	    	{
	    		min=i[j];
	    		index = j;
	    	}
	    
	    }

         System.out.println("Minword:"+min);
         System.out.println("index:"+ index);
	}

}
