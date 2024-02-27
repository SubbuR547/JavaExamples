package com.java.practice.examples;

final class OwnImmutablityDemo {
	private int i;
	OwnImmutablityDemo(int i)
	{
		this.i=i;
	}
	public OwnImmutablityDemo modify(int i)
	{
		if(this.i==i)
		{
			return this;
		}
		else
		{
			return new OwnImmutablityDemo(i);
		}
	}
	public static void main(String[ ] args)
	{
		OwnImmutablityDemo o1= new OwnImmutablityDemo(10);
		OwnImmutablityDemo o2 = o1.modify(100);
		OwnImmutablityDemo o3 = o1.modify(10);
		System.out.println(o1==o2);
		System.out.println(o1==o3);
	}

}
