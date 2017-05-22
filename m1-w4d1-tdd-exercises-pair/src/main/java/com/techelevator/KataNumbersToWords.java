package com.techelevator;

public class KataNumbersToWords {
	
	public String numberConverter(int number) {
		
		String zero = "zero";
		String one = "one";
		String two = "two";
		String three = "three";
		String four = "four";
		String five = "five";
		
		if(number == 0){
			return zero;
		}else if(number == 1){
			return one;
		}else if(number == 2){
			return two;
		}else if(number == 3){
			return three;
		}else if(number == 4){
			return four;
		}else if(number == 5){
			return five;
		}else {
			return "I can't count that far.";
		}
		
	}
	public int textConverter(String text){
		
		
		
		return 0;
	}

	
}
