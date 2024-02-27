package com.java.practice.examples;
class Rbi
{
     public void withdraw() {
    	
     }
}
class SbiAtm extends Rbi
{
	public void withdraw() {
		System.out.println("In SBI-ATM the withdraw limit is only 10000.");
	}
}
class IciciAtm extends Rbi
{
	public void withdraw()
	{
		System.out.println("In ICICI-ATM the withdraw limit is only 20000.");
	}
}
public class MethodOveridding  {

	public static void main(String[] args) {
		IciciAtm ic = new IciciAtm();
		ic.withdraw();
		SbiAtm sb =new SbiAtm();
		sb.withdraw();

	}

}
