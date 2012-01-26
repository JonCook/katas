package com.katas.fibonacci;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;


/**
 * Kata One - Fibonacci Sequence Generator (Recursive)
 * Give me the sequence of fibonacci numbers for a given sequence number between 8 and 50 e.g. for 8 - 0,1,1,2,3,5,8,13
 * 
 * Following strict TDD
 * 1. Add a litle test
 * 2. Run all the tests and fail
 * 3. Make a little change
 * 4. Run the tests and succeed
 * 5. Refactor to remove duplication
 * 
 */
public class FibonacciSequenceTests {
	
	@Test
	public void firstFibonacciNumberIsZero() throws Exception {
		assertEquals("First fibonacci number should be 0", 0, getNumberAtPosition(0));
	}
	
	@Test
	public void secondFibonacciNumberIsOne() throws Exception {
		assertEquals("Second fibonacci number should be 1", 1, getNumberAtPosition(1));
	}
	
	@Test
	public void thirdFibonacciNumberIsOne() throws Exception {
		assertEquals("Third fibonacci number should be 1", 1, getNumberAtPosition(2));
	}
	
	@Test
	public void fourthFibonacciNumberIsTwo() throws Exception {
		assertEquals("Fourth fibonacci number should be 2", 2, getNumberAtPosition(3));
	}
	
	@Test
	public void eigthFibonacciNumberIsThirteen() throws Exception {
		assertEquals("Eigth fibonacci number should be 13", 13, getNumberAtPosition(7));
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void sequenceNumberLessThanEightThrowsIllegalArgumentException() throws Exception {
		createFibonacciSequence().generate(0);
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void sequenceNumberGreaterThanFiftyThrowsIllegalArgumentException() throws Exception {
		createFibonacciSequence().generate(51);
	}
	
	@Test
	public void sequenceNumberEightReturnsFirstEightFibonacciNumbers() throws Exception {
		assertArrayEquals("Sequence number of eight should return first 8 fibonacci numbers", 
				createFibonacciSequence().generate(8), new int[]{0,1,1,2,3,5,8,13});
	}
	
	private int getNumberAtPosition(int position) {
		return createFibonacciSequence().getNumberAtPosition(position);
	}
	
	private FibonacciSequence createFibonacciSequence(){
		return new FibonacciSequence();
	}

}
