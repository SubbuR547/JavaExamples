package com.java.practice.examples;

public class StringBuilderCapacityLength {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("My name is subhash.his best friend name is sasi.");
		int length = sb.length();
		System.out.println("Length: " + length);

		int capacity = sb.capacity();
		System.out.println("Capacity: " + capacity);
		sb.ensureCapacity(50);
		System.out.println("New capacity: " + sb.capacity());

		sb.setLength(20);
		System.out.println("After setLength, New StringBuilder: " + sb);
	}

}
