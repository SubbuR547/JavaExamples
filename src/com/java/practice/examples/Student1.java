package com.java.practice.examples;

public class Student1 {
	private String name; 
	  private int phyMarks; 
	  private int chemMarks; 
	  private int bioMarks; 

	public void setName(String name)
	{ 
	  this.name = name; 
	}
	public void setPhyMarks(int phyMarks)
	{ 
	  this.phyMarks = phyMarks; 
	} 
	public void setChemMarks(int chemMarks)
	{ 
	  this.chemMarks = chemMarks; 
	} 
	public void setBioMarks(int bioMarks)
	{ 
	  this.bioMarks = bioMarks; 
	} 
	void marksRead() 
	{ 
	   System.out.println("Student's Name: " +name); 
	   System.out.println("Marks in Physics: " +phyMarks); 
	   System.out.println("Marks in Chemistry: " +chemMarks); 
	   System.out.println("Marks in Biology: " +bioMarks); 

	   int Totalmarks = phyMarks + chemMarks + bioMarks; 
	   float percentage = (Totalmarks * 100)/300; 
	   System.out.println("Percentage of PCB: " +percentage); 
	 } 

	
}
