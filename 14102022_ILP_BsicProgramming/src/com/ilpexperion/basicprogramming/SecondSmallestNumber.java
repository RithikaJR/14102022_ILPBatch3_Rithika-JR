package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstNumber;
		int secondNumber;
		int thirdNumber;

		System.out.println("Enter first number");
		firstNumber = scanner.nextInt();
		System.out.println("Enter second number");
		secondNumber = scanner.nextInt();
		System.out.println("Enter third number");
		thirdNumber = scanner.nextInt();

		int temperoryVariable = firstNumber;

		if ((secondNumber < temperoryVariable && secondNumber > thirdNumber)
				|| (secondNumber > temperoryVariable && secondNumber < thirdNumber))
			temperoryVariable = secondNumber;

		if ((thirdNumber < temperoryVariable && thirdNumber > secondNumber)
				|| (thirdNumber > temperoryVariable && thirdNumber < secondNumber))
			temperoryVariable = thirdNumber;

		System.out.println("Second smallest number:" + temperoryVariable);

		// TODO Auto-generated method stub

	}

}
