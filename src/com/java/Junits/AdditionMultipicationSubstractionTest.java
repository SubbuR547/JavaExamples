package com.java.Junits;

import static org.junit.Assert.*;

import org.junit.Test;

import com.java.practice.examples.AdditionMultiplicationSubstraction;

public class AdditionMultipicationSubstractionTest {

    @Test
    public void testAddition() {
    	AdditionMultiplicationSubstraction calculator = new AdditionMultiplicationSubstraction();
        assertEquals(8, calculator.addition(5, 3));
        assertNotEquals(9, calculator.addition(5, 3));
        assertEquals(-1, calculator.addition(-2, 1));
        assertEquals(0, calculator.addition(0, 0));
        
    }

    @Test
    public void testSubtraction() {
    	AdditionMultiplicationSubstraction calculator = new AdditionMultiplicationSubstraction();
        assertEquals(5, calculator.substraction(8, 3));
        assertEquals(-3, calculator.substraction(2, 5));
        assertEquals(0, calculator.substraction(0, 0));
    }

    @Test
    public void testMultiplication() {
    	AdditionMultiplicationSubstraction calculator = new AdditionMultiplicationSubstraction();
        assertEquals(15, calculator.multiplication(5, 3));
        assertEquals(-6, calculator.multiplication(2, -3));
        assertEquals(0, calculator.multiplication(0, 0));
    }
}
