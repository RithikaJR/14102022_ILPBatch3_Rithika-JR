package com.ilpexperion.basicprogramming;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number;
		int lastDigit;
		System.out.println("Enter number");
		number = scanner.nextInt();
		lastDigit = number % 10;
		if (lastDigit % 2 == 0) {
			System.out.println("Last digit is even");

		} else {
			System.out.println("Last digit is odd");
		}
		// TODO Auto-generated method stub

	}

}
