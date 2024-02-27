package com.java.practice.examples;

public class TestDemo2 {
	public static void main(String[] args)
	{ 
	   Employee em = new Employee("Vinod", 23435, "TCS");

	   String name = em.getName(); 
	   int id = em.getId(); 
	   String nCompany = em.getNCompany(); 
	  
	   System.out.println("Employee's name: " +name); 
	   System.out.println("Employee's id: " +id);
	   System.out.println("Company's name: " +nCompany);
	 } 

}
