package com.java.practice.examples;

public class StringTrimDemo {

	public static void main(String[] args) {
		String s ="  subhash   ";
		System.out.println(s+"\n"+"Lenght of a string :"+s.length());
		System.out.println(s.trim()+"\n"+"Length of a string after using of trim method:"+s.trim().length());
		String t = "subhash Royal";
		System.out.println(t+"\n"+"Lenght of a string :"+t.length());
		System.out.println(t.trim()+"\n"+"Length of a string after using of trim method:"+t.trim().length());
		System.out.println("(So,based on the above examples we conclude that the trim method is "+"\n"+"only use to remove blank spaces in begining of the string and "+"\n"+"end of the string  not able to remove in middle of the string)");
		
	}

}
