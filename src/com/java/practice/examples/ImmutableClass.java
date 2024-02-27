package com.java.practice.examples;
 final class StudentsDetails
{
   private final String name;
   private final int rollNo;
   public StudentsDetails(String name, int id)
   {
      this.name = name;
      this.rollNo = id;
   }
   public String getName() {
	return name; 
    }
   public int getRollNo() {
	return rollNo; 
    }
}
public class ImmutableClass {

	public static void main(String[] args) {
		StudentsDetails st = new StudentsDetails("Subhash Royal", 547);
	    String name = st.getName();
	    int rollNo = st.getRollNo();
	    System.out.println("Name: " +name);
	    System.out.println("Roll no: " +rollNo);
	}

}
