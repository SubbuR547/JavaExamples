package com.java.practice.examples;

public class ConstructorsDemo {
	int a=1000;
	int b=2000;
	void m1(int a,char ch) {
	System.out.println(a);
	System.out.println(ch);
	}
	void m2(int a,int b,int c) {
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	}
	ConstructorsDemo(char ch,boolean b) {
	System.out.println(ch);
	System.out.println(b);
	}
	ConstructorsDemo(int a) {
	System.out.println(a);
	}


	public static void main(String[] args) {
		ConstructorsDemo cd1 =new ConstructorsDemo('s',true);
		ConstructorsDemo cd2 =new ConstructorsDemo(10);
		System.out.println(cd1.a);
		System.out.println(cd2.b);
		cd1.m1(100,'s');
		cd2.m2(100,200,300);

	}

}
