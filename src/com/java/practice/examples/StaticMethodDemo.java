package com.java.practice.examples;

public class StaticMethodDemo {
	static int a = 40; 
	  
    int b = 50; 
  
    void simpleDisplay() 
    { 
        System.out.println(a); 
        System.out.println(b); 
    } 
  
    static void staticDisplay() 
    {  
      System.out.println(a);  
    } 

	public static void main(String[] args) {
		StaticMethodDemo obj =new StaticMethodDemo();
		obj.simpleDisplay(); 
        staticDisplay(); 

	}

}
