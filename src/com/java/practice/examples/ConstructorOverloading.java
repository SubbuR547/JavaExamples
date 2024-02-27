package com.java.practice.examples;
class A1{
	int i,j,k;
	A1()
	{
		
	}
	A1(int i1)
	{
		i=i1;

	}
	A1(int i1,int j1)
	{
		i=i1;
		j=j1;
	}
	A1(int i1,int j1,int k1)
	{
		i=i1;
		j=j1;
		k=k1;
	}
	void add() {
		System.out.println("Addition:"+(i+j+k));
	}
}
public class ConstructorOverloading {
	

	public static void main(String[] args) {
		A1 a1=new A1(); 
	    a1.add(); 
		A1 a2=new A1(10); 
		 a2.add(); 
		A1 a3=new A1(10,20); 
		 a3.add(); 
		A1 a4=new A1(10,20,30); 
		 a4.add();

	}

}
