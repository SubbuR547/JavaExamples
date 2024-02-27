package com.java.practice.examples;

public class PlayerTest {
	public static void main(String[] args) { 
		  Player ply = new Player("Virat Kohli", 35 , "Cricket"); 
		  String plyName = ply.getPName(); 
		  int plyAge = ply.getPAge(); 
		  String plyGameType = ply.getGameType(); 

		  System.out.println("Player's Name: " +plyName); 
		  System.out.println("Player's Age: " +plyAge); 
		  System.out.println("Player's Gametype: " +plyGameType); 
		 } 

}
