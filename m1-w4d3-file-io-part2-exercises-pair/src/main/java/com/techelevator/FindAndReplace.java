package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FindAndReplace {

	public static void main(String[] args) {

		try (Scanner userInput = new Scanner(System.in)) {
			// Get the search word
			System.out.println("What is the search word?");
			String searchWord = userInput.nextLine();
			if ((searchWord) == null || (searchWord.isEmpty())) {
				System.out.println("The word to search is empty");
				System.exit(1);
			}

			System.out.println("What is the replace word?");
			String replaceWord = userInput.nextLine();
			if ((replaceWord) == null || (replaceWord.isEmpty())) {
				System.out.println("The word to replace is empty.");
				System.exit(1);
			}
			// Get the location of the source file

			System.out.println("What is the source file?");
			String fileLocation = userInput.nextLine();
			File sourceFile = new File(fileLocation);

			if (sourceFile.exists()) {
				if (sourceFile.isDirectory()) {
					System.out.println("This is not a file. This is a directory.");
					System.exit(1);
				}

			} else {
				System.out.println("This file does not exist.");
				System.exit(1);
			}

			System.out.println("What is the destination file?");
			String destinationLocation = userInput.nextLine();
			File destinationFile = new File(destinationLocation);

			PrintWriter destinationWriter = new PrintWriter(destinationFile.getAbsoluteFile()); {
				while (userInput.hasNextLine()) {
					String line = userInput.nextLine();
					destinationWriter.println(line.replaceAll(searchWord, replaceWord));
				}
				destinationWriter.close();
				userInput.close();
			}

		} catch (FileNotFoundException missingFile) {
			System.out.println(missingFile.getMessage());
		}

	}

}
