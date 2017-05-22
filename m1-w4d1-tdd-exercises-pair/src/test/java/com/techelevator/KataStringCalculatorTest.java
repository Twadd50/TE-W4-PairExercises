package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataStringCalculatorTest {
	
	KataStringCalculator sut;
	
	@Before
	public void setUp(){
		sut = new KataStringCalculator();
	}
	
	@Test
	public void testAddStringWithoutNumbers() {
		
		assertEquals(0, sut.add(""));
		
	}
	
	@Test
	public void testAddStringWithOneNumber() {
		
		assertEquals(1, sut.add("1"));
		
	}
	
	@Test
	public void testAddStringWithTwoNumbers() {
		
		assertEquals(3, sut.add("1,2"));
		
	}
	
	@Test
	public void testAddStringWithThreeNumbers() {
		
		assertEquals(8, sut.add("1,2,5"));
		
	}
	
	@Test
	public void testAddStringWithTenCharacters() {
		
		assertEquals(28, sut.add("1,2,4,7,59"));
		
	}
	
	@Test
	public void testAddStringWithCharactersOnNewLine() {
		
		assertEquals(28, sut.add("1\n2\n4\n7\n59"));
		
	}

}
