package com.techelevator;

import org.junit.*;
import static org.junit.Assert.*;

public class KataNumbersToWordsTest {
	
	KataNumbersToWords sut;
	
	@Before
	public void setUp(){
		
		sut = new KataNumbersToWords();
		
	}
	
	@Test
	public void testConvertNumbersToText(){
		
		assertEquals("zero", sut.numberConverter(0));
		
	}
	
	@Test
	public void testConvertTextToNumber(){
		
		assertEquals(0, sut.textConverter("zero"));
		
	}
	

}
