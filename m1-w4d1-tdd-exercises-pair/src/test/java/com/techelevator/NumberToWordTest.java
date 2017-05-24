package com.techelevator;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class NumberToWordTest {
	
	NumberToWord sut;
	
	@Before
	public void setUp(){
		sut = new NumberToWord();
	}
	
	@Test
	public void testConvertNumbersToText(){
		assertEquals("five", sut.numberText(5));
	}
	
	@Test
	public void testConvertTextToNumber(){
		//assertEquals(0, sut.textConverter("zero"));
	}
	

}
