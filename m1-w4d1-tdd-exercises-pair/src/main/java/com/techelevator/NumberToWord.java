package com.techelevator;

public class NumberToWord {

	String[] ones 			   = new String[] { "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
												"eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

	String[] tens 			   = new String[] { "ten", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety",
												"hundred" };

	String[] hundreds 		   = new String[] { "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
												"six hundred", "seven hundred", "eight hundred", "nine hundred", "thousand" };

	String[] thousands 		   = new String[] { "one thousand", "two thousand", "three thousand", "four thousand",
												"five thousand", "six thousand", "seven thousand", "eight thousand", "nine thousand" };

	String[] tenThousands 	   = new String[] { "ten", "twenty", "thirty", "forty",
												"fifty", "sixty", "seventy", "eighty", "ninety" };

	String[] hundredThousands  = new String[] { "one hundred", "two hundred", "three hundred", "four hundred", "five hundred", "six hundred", "seven hundred",
												"eight hundred", "nine hundred" };

	public String numberText(int number) {
		   String numberText = "";
	
	if(number > 100000) {
		numberText += hundredThousands[number / 100000 - 1];
		if (number % 100000 == 0) {
			return numberText + " thousand ";
		}
		number %= 100000;
	}
	if(number > 10000) {
		numberText += tenThousands[number / 10000 - 1];
		if (number % 10000 == 0) {
			return numberText + " thousand ";
		}
		number %= 10000;
	}
	if(number > 1000) {
		numberText += thousands[number / 1000 - 1];
		if (number % 1000 == 0) {
			return numberText;
		}
		number %= 1000;
	}
	if(number > 100) {
		numberText += hundreds[number / 100 - 1];
		if (number % 100 == 0) {
			return numberText;
		}
		number %= 100;
	}
	if(number > 10) {
		numberText += tens[number / 10 - 1];
		if (number % 10 == 0) {
			return numberText;
		}
		number %= 10;
	}
	if(number > 1) {
		numberText += ones[number / 1 - 1];
		if (number % 1 == 0) {
			return numberText;
		}
	}
	return numberText;
	}
}
