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
		
		assertEquals("one hundred thirty two thousand five hundred thirty six", sut.numberConverter(132536));
		
	}
	
	@Test
	public void testSpellZero(){
		
		assertEquals("zero", sut.numberConverter(0));
		
	}
	
	@Test
	public void testSpellThirtyFive(){
		
		assertEquals("thirty five", sut.numberConverter(35));
		
	}
	
	@Test
	public void testSpellTwoHundredSixtySeven(){
		
		assertEquals("two hundred sixty seven", sut.numberConverter(267));
		
	}
	
	@Test
	public void testSpellThirtyFourThousandThreeHundredSeventyEight(){
		
		assertEquals("thirty four thousand three hundred seventy eight", sut.numberConverter(34378));
		
	}
	
	@Test
	public void testSpellFiveThousand(){
		
		assertEquals("five thousand", sut.numberConverter(5000));
		
	}
	
	@Test
	public void testConvertTextToNumber(){
		
		assertEquals(0, sut.textConverter("zero"));
		
	}
	

}
