package com.techelevator;

public class KataNumbersToWords {

	public String numberConverter(int number) {

		String[] strOnes = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", };

		String[] strTens = { "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety",
				"Hundred" };
		String[] srHundreds = { "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
				"six hundred", "seven hundred", "eight hundred", "nine hundred", "thousand", };

		String hundredThousandsPlace = null;
		String tenThousandsPlace = null;
		String oneThousandsPlace = null;
		String hundredsPlace = null;
		String tensPlace = null;
		String onesPlace = null;

		if (number > 1000) {
			int thousands = number / 1000;
			int result1 = number - (number * 1000);
			if (thousands > 100) {
				int hundredThousands = thousands / 100;

				if (hundredThousands <= srHundreds.length) {
					hundredThousandsPlace = srHundreds[hundredThousands - 1];
				}
				int result2 = thousands - (hundredThousands * 100);
				if (result2 > 10) {
					int tenThousands = result2 / 10;
					if (tenThousands <= strTens.length) {
						tenThousandsPlace = strTens[tenThousands - 1];
					}
					int result3 = result2 - (tenThousands * 10);
					int oneThousands = result3;
					if (oneThousands <= strOnes.length) {
						oneThousandsPlace = strOnes[oneThousands - 1];
					}

				}
			}
			if (result1 > 100) {
				int hundreds = result1 / 100;
				if (hundreds <= srHundreds.length) {
					hundredsPlace = srHundreds[hundreds - 1];
				}
				int result4 = result1 - (hundreds * 100);
				if (result4 > 10) {
					int tens = result4 / 10;
					if (tens <= strTens.length) {
						tensPlace = strTens[tens - 1];
					}
					int ones = result4 - (tens * 10);
					if (ones <= strOnes.length) {
						onesPlace = strOnes[ones - 1];
					}
				}
			}

		}

		return hundredThousandsPlace + " " + tenThousandsPlace + " " + oneThousandsPlace + " " + hundredsPlace + " "
				+ tensPlace + " " + onesPlace;
	}

	public int textConverter(String text) {

		return 0;
	}

}
