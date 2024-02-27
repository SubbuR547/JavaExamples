package com.java.practice.examples;

public class RepeatedWords {

	public static void main(String[] args) {
		String string = "My name is lakshmi narasimha my brother name is nanda my daughter name is hoshitha";
		int count;
		string = string.toLowerCase();
		String words[] = string.split(" ");
		System.out.println("Duplicate words in a given string : ");
		for(int i=0;i<=words.length;i++)
		{
			count=0;
			for(int j=i+1;j<=words.length;i++)
			{
				if(words[i].equals(words[j]))
				{
					
				}
			}
			
			
		}
	}
}
