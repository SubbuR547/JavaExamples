package com.java.practice.examples;
interface IDemo
{
	int x= 20;
	void m1();
	void m2();
	void m3();
}
class ImpleClass implements IDemo
{
	public void m1()
	{
		System.out.println("method 1");
	}
	public void m2()
	{
		System.out.println("method 2");
	}
	public void m3()
	{
		System.out.println("method 3");
	}
	void m4()
	{
		System.out.println("method 4");
	}
}
public class InterfaceClassDemo {

	public static void main(String[] args) {
		IDemo i =new ImpleClass();
		System.out.println(i.x);
		System.out.println(IDemo.x);
		i.m1();
		i.m2();
		i.m3();
		ImpleClass ic =new ImpleClass();
		System.out.println( ImpleClass.x);
		System.out.println(ic.x);
		ic.m1();
		ic.m2();
		ic.m3();
		ic.m4();

	}

}
