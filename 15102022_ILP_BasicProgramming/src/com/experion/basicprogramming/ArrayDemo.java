package com.experion.basicprogramming;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String productNames[] = new String[5];
		for (int i = 0; i < productNames.length; i++) {

			System.out.println("Enter name of product:");
			productNames[i] = scanner.nextLine();
		}
		System.out.println("Entered product names:");
		for (int i = 0; i < productNames.length; i++) {

			System.out.print(productNames[i] + "  ");

		}

		// TODO Auto-generated method stub

	}

}
