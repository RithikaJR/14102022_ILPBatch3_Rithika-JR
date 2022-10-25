package com.experion.basicprogramming;

import java.util.Scanner;

public class VowelValuation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char inputCharacter;
		System.out.println("Enter character:");
		inputCharacter = scanner.next().charAt(0);
		inputCharacter = Character.toLowerCase(inputCharacter);
		switch (inputCharacter) {
		case 'a':

		case 'e':

		case 'i':

		case 'o':

		case 'u':
			System.out.println("Entered character is vowel");
			break;
		default:
			System.out.println("Entered character is not vowel");
		}

		// TODO Auto-generated method stub

	}

}
