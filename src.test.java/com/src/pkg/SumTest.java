package com.src.pkg;

import junit.framework.TestCase;

public class SumTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	public void testAddTwoPositiveIntegers() {
		int expected = 11;
		int actual = new Sum().add(4, 7);
		assertEquals(expected, actual);
	}


	public void testAddTwoNegativeIntegers() {
		int expected = -11;
		int actual = new Sum().add(-4, -7);
		assertEquals(expected, actual);
	}

	
	public void testAddNegativeIntegerToPositiveInteger() {
		int expected = -3;
		int actual = new Sum().add(4, -7);
		assertEquals(expected, actual);
	}

}
