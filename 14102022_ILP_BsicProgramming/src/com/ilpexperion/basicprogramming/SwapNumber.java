package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstNumber;
		int secondNumber;
		int temperoryVariable;

		System.out.println("Enter first number");
		firstNumber = scanner.nextInt();
		System.out.println("Enter second number");
		secondNumber = scanner.nextInt();

		System.out.println("The numbers before swapping");
		System.out.println(firstNumber + "\n" + secondNumber);

		temperoryVariable = firstNumber;
		firstNumber = secondNumber;
		secondNumber = temperoryVariable;

		System.out.println("The numbers after swapping");
		System.out.println(firstNumber + "\n" + secondNumber);

		// TODO Auto-generated method stub

	}

}
