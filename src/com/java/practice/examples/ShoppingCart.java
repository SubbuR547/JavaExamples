package com.java.practice.examples;

public class ShoppingCart {

	   public void addItem(String itemName) 
	   {
	       System.out.println(itemName + " added to the cart.");
	   }

	   public void addItem(String itemName, int quantity) 
	   {
	       System.out.println(quantity + " " + itemName + "s added to the cart.");
	   }

	   public void addItem(String itemName, int quantity, double price) 
	   {
	       double totalCost = quantity * price;
	       System.out.println(quantity + " " + itemName + "s added to the cart. Total cost: $" + totalCost);
	   }

	public static void main(String[] args) 
	{
	    ShoppingCart cart = new ShoppingCart();

	     cart.addItem("T-shirt");
	     cart.addItem("Shoes", 2);
	     cart.addItem("Sunglasses", 3, 25.99);
	  }
	}
