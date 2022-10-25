package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class SwapNumber2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int firstNumber;
		int secondNumber;

		System.out.println("Enter first number");
		firstNumber = scanner.nextInt();
		System.out.println("Enter second number");
		secondNumber = scanner.nextInt();

		System.out.println("The numbers before swapping");
		System.out.println("First number:" + firstNumber + "\n" + "Second number:" + secondNumber);
		firstNumber = firstNumber + secondNumber;
		secondNumber = firstNumber - secondNumber;
		firstNumber = firstNumber - secondNumber;

		System.out.println("The numbers after swapping");
		System.out.println("First number:" + firstNumber + "\n" + "Second Number:" + secondNumber);

		// TODO Auto-generated method stub

	}

}
