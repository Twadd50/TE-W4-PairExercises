package com.techelevator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {

	public static void main(String[] args) throws IOException {

		BufferedReader docReader     = new BufferedReader(new FileReader("alices_adventures_in_wonderland.txt"));
		File     file 			     = new File("alices_adventures_in_wonderland.txt");
		int      wordCount 		     = 0;
		int      sentenceCount		 = 0;
		String   sentenceDelimeters	 = "[?!\\.]";
		String   wordDelimeters 	 = " +";
		String   lineReader 	     = docReader.readLine();

		try (Scanner sc = new Scanner(new FileInputStream(file))) {
			while (sc.hasNext()) {
				lineReader = sc.nextLine();
					//sc.next();
					wordCount += lineReader.split(wordDelimeters).length;
					
				
				
			}

		} catch (FileNotFoundException missingFile) {
			System.out.println(missingFile.getMessage());

		}

		try (Scanner sc = new Scanner(new FileInputStream(file))) {
			while (sc.hasNext()) {
				lineReader = sc.nextLine();
					sentenceCount += lineReader.split(sentenceDelimeters).length;
					sentenceCount--;
				
			
			}

		} catch (FileNotFoundException missingFile) {
			System.out.println(missingFile.getMessage());

		}
		docReader.close();
		System.out.println("Number of words: " + wordCount);
		System.out.println("Number of sentences:" + sentenceCount);

	}

}
