package com.java.practice.examples;
abstract class AbClass{
	void m1()
	{
		System.out.println("method 1");
	}
	abstract void m2();
	abstract void m3();
}
class NormalClass extends AbClass
{
	void m2()
	{
		System.out.println("method 2");
	}
	void m3()
	{
		System.out.println("method 3");
	}
	void m4()
	{
		System.out.println("method 4");
	}
}
public class AbstractClassDemo {

	public static void main(String[] args) {
		AbClass ab =new NormalClass();
		ab.m1();
		ab.m2();
		ab.m3();
		NormalClass nc =new NormalClass();
		nc.m1();
		nc.m2();
		nc.m3();
		nc.m4();

	}

}
