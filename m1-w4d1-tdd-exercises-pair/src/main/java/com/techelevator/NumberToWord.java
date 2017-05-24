package com.techelevator;

public class NumberToWord {

	String[] ones = new String[] { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
			"Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen", };

	String[] tens = new String[] { "Ten", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety",
			"Hundred" };

	String[] hundreds = new String[] { "one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
			"six hundred", "seven hundred", "eight hundred", "nine hundred", "thousand", };

	String[] thousands = new String[] { "one thousand", "two thousand", "three thousand", "four thousand",
			"five thousand", "six thousand", "seven thousand", "eight thousand", "nine thousand" };

	String[] tenThousands = new String[] { "ten thousand", "twenty thousand", "thirty thousand", "forty thousand",
			"fifty thousand", "sixty thousand", "seventy thousand", "eighty thousand", "ninety thousand" };

	String[] hundredThousands = new String[] { "one hundred thousand", "two hundred thousand", "three hundred thousand",
			"four hundred thousand", "five hundred thousand", "six hundred thousand", "seven hundred thousand",
			"eight hundred thousand", "nine hundred thousand" };

	public String numberText(int number) {
		String numberText = "";

		numberText += hundredThousands[number / 100000 - 1];
		if (number % 100000 == 0) {
			return numberText + " thousand ";
		}
		number %= 100000;

		numberText += tenThousands[number / 10000 - 1];
		if (number % 10000 == 0) {
			return numberText + " thousand ";
		}
		number %= 10000;

		numberText += thousands[number / 1000 - 1];
		if (number % 1000 == 0) {
			return numberText;
		}
		number %= 1000;

		numberText += hundreds[number / 100 - 1];
		if (number % 100 == 0) {
			return numberText;
		}
		number %= 100;

		numberText += tens[number / 10 - 1];
		if (number % 10 == 0) {
			return numberText;
		}
		number %= 10;
		numberText += ones[number / 1 - 1];
		if (number % 1 == 0) {
			return numberText;
		}
		return numberText;
	}
}
