package com.techelevator;

public class KataNumbersToWords {

	public String numberConverter(int number) {

		String[] strOnes = { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven",
				"twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", };

		String[] strTens = { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety"};
		
		String[] srHundreds = { "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
				"six hundred", "seven hundred", "eight hundred", "nine hundred",};

		String hundredThousandsPlaceWord, tenThousandsPlaceWord, oneThousandsPlaceWord, hundredsPlaceWord, tensPlaceWord, onesPlaceWord;
		int hundredThousands, tenThousands, oneThousands, hundreds, tens, ones;
		

		if(number >100000){

			hundredThousands = number / 100000;
				hundredThousandsPlaceWord = srHundreds[hundredThousands - 1];
			
			tenThousands = (number - (hundredThousands * 100000))/10000;	
				tenThousandsPlaceWord = strTens[tenThousands - 1];
				
			oneThousands = ((number - (hundredThousands * 100000) - (tenThousands * 10000))/1000);
				oneThousandsPlaceWord = strOnes[oneThousands - 1];	
			
			hundreds = ((number - (hundredThousands * 100000) - (tenThousands * 10000) - (oneThousands * 1000)) / 100);
				hundredsPlaceWord = srHundreds[hundreds - 1];
			
			tens = ((number - (hundredThousands * 100000) - (tenThousands * 10000) - (oneThousands * 1000) - (hundreds * 100))/10);	
				tensPlaceWord = strTens[tens - 1];
			
			ones = (number - (hundredThousands * 100000) - (tenThousands * 10000) - (oneThousands * 1000) - (hundreds * 100) - (tens * 10));
				onesPlaceWord = strOnes[ones - 1];
			
			return hundredThousandsPlaceWord + " " + tenThousandsPlaceWord + " " + oneThousandsPlaceWord + " thousand " + hundredsPlaceWord + " " + tensPlaceWord + " " + onesPlaceWord;

		}else if(number > 20000){
			
			tenThousands = number /10000;	
				tenThousandsPlaceWord = strTens[tenThousands - 1];
				
			oneThousands = (number - (tenThousands * 10000))/1000;
				oneThousandsPlaceWord = strOnes[oneThousands - 1];	
			
			hundreds = (number - (tenThousands * 10000) - (oneThousands * 1000)) / 100;
				hundredsPlaceWord = srHundreds[hundreds - 1];
			
			tens = (number - (tenThousands * 10000) - (oneThousands * 1000)- (hundreds * 100))/10;	
				tensPlaceWord = strTens[tens - 1];
			
			ones = (number - (tenThousands * 10000) - (oneThousands * 1000)- (hundreds * 100) - (tens * 10));
				onesPlaceWord = strOnes[ones - 1];
			
			return tenThousandsPlaceWord + " " + oneThousandsPlaceWord + " thousand " + hundredsPlaceWord + " " + tensPlaceWord + " " + onesPlaceWord;


		}else if (number > 1000) {
			
			oneThousands = number / 1000;
				oneThousandsPlaceWord = strOnes[oneThousands - 1];	
			
			hundreds = (number - (oneThousands*1000)) / 100;
				hundredsPlaceWord = srHundreds[hundreds - 1];
			
			tens = (number - (oneThousands*1000) - (hundreds * 100))/10;	
				tensPlaceWord = strTens[tens - 1];
			
			ones = (number - (oneThousands*1000) - (hundreds * 100) - (tens * 10));
				onesPlaceWord = strOnes[ones - 1];
			
			return oneThousandsPlaceWord + " thousand "  + hundredsPlaceWord + " " + tensPlaceWord + " " + onesPlaceWord;

		}else if (number > 100){

			hundreds = number / 100;
				hundredsPlaceWord = srHundreds[hundreds - 1];
			
			tens = (number - (hundreds * 100))/10;	
				tensPlaceWord = strTens[tens - 1];
			
			ones = (number - (hundreds * 100)) - (tens * 10);
				onesPlaceWord = strOnes[ones - 1];
			
			return hundredsPlaceWord + " " + tensPlaceWord + " " + onesPlaceWord;

		}else if(number > 19){
			
			tens = number / 10;	
				tensPlaceWord = strTens[tens - 1];
			
			ones = number - (tens * 10);
				onesPlaceWord = strOnes[ones - 1];
			
			return tensPlaceWord + " " + onesPlaceWord;


		}else if (number > 0) {

			onesPlaceWord = strOnes[number - 1];
			return onesPlaceWord;
		} else {
			
			return "zero";
		}
	}

	public int textConverter(String text) {

		return 0;
	}

}
