package com.java.practice.examples;

public class ReverseString {

	public static void main(String[] args) {
		/*
		 * StringBuffer s = new StringBuffer("madam"); StringBuffer s1 = s.reverse();
		 * if(s.equals(s1)) { System.out.println(s+"is apolindrom"); } else {
		 * System.out.println("is not apolindrom"); }
		 */
		/*
		 * String s ="Subhash";
		 * 
		 * char[] c = s.toCharArray();
		 * 
		 * //System.out.println(s.charAt(6));
		 * 
		 * for (int i =c.length-1 ; i >= 0; i--) { System.out.print(c[i]); }
		 */
		String str= "Geeks", nstr="";
        char ch;
       
      System.out.print("Original word: ");
      System.out.println("Geeks"); //Example word
       
      for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
      }
      System.out.println("Reversed word: "+ nstr);
      if(str.equals(nstr))
      {
    	  System.out.println("polindrom");
      }
      else
      {
    	  System.out.println("Not polindrom");
      }
	}

}
