package com.techelevator;

public class KataStringCalculator {
	public int add(String number){
		int sumOfNumbers = 0;
		for(int ix = 0; ix < number.length(); ix++){
			if(number.charAt(ix) == ',' || number.charAt(ix) == '\n'){
				continue;
			}else {
				int newNumber = Integer.parseInt(String.valueOf(number.charAt(ix)));
				sumOfNumbers += newNumber;
			}
		}
		
		return sumOfNumbers;
	}
	
}
