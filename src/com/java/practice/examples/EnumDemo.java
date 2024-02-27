package com.java.practice.examples;

enum Level {
	LOW, MEDIUM, HIGH
}

public class EnumDemo {
	public static void main(String[] args) {
		Level myVar = Level.LOW;

		switch (myVar) {
		case LOW:
			System.out.println("Low level");
			break;
		case MEDIUM:
			System.out.println("Medium level");
			break;
		case HIGH:
			System.out.println("High level");
			break;
		}
	}

}
