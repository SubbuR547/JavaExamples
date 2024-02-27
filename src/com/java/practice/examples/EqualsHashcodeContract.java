package com.java.practice.examples;

public class EqualsHashcodeContract {
	String name;
	int rollno;
	EqualsHashcodeContract(String name,int rollno )
	{
		this.name=name;
		this.rollno=rollno;
	}
public boolean equals(Object obj)
{
	if(obj instanceof EqualsHashcodeContract)
	{
		EqualsHashcodeContract ehc = (EqualsHashcodeContract)obj;
		if(name.equals(ehc.name)&&rollno==ehc.rollno)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	return false;
}
public int hashcode()
{

	return name.hashCode()+rollno;
}
	public static void main(String[] args) {
		
		EqualsHashcodeContract e1 =new EqualsHashcodeContract("Subhash",547);
		EqualsHashcodeContract e2 =new EqualsHashcodeContract("harsha",531);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashcode());
		System.out.println(e2.hashcode());
		
	}

}
