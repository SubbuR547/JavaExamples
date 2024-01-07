package com.java.practice.examples;

public class AdditionMultiplicationSubstraction {
	public static void main(String[] args) {
		AdditionMultiplicationSubstraction calculator = new AdditionMultiplicationSubstraction();
		calculator.addition(1,1);
		calculator.substraction(1,1);
		calculator.multiplication(1, 1);
	}

    public int addition(int a, int b) {
    	int sum = a+b;
     System.out.println("sum:"+sum);
     return sum;
    }

    public int substraction(int a, int b) {
    	int diff= a-b;
       System.out.println("diff="+ diff);
       return diff;
    }

    public int multiplication(int a, int b) {
    	int product =a*b;
    	System.out.println("Product:"+product);
    	return product;
       
    }
}
