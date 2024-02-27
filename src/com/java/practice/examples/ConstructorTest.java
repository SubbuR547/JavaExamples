package com.java.practice.examples;


class Employe
	{ 
	String eid; 
	String ename; 
	float esal; 
	 String eaddr; 
	
	Employe() 
	{ 
	eid="18701A0547"; 
	ename="Krishna Subhash"; 
	esal=50000.0f; 
    eaddr="Hyd"; 
	 }

	public void getEmpDetails() 
	 { 
	 System.out.println("Employee Details:"); 
	 System.out.println("Employee Id :"+eid); 
	 System.out.println("Employee Name :"+ename); 
     System.out.println("Employee Salary :"+esal); 
	 System.out.println("Employee Address :"+eaddr); 
	} 
} 
	public class ConstructorTest {
	public static void main(String[] args) {
		Employe emp=new Employe(); 
		emp.getEmpDetails(); 

	}

}
