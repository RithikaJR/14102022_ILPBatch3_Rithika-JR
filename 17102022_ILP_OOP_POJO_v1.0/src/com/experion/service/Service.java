package com.experion.service;

import com.experiopn.entity.*;

import java.util.Scanner;

public class Service {
	static Product product = new Product();

	public static void inputProductDetails() {

		Scanner scanner = new Scanner(System.in);

		System.out.println("enter first product code");
		String productCode = scanner.nextLine();
		product.setProductCode(productCode);

		System.out.println("enter first product name");
		String productName = scanner.nextLine();
		product.setProductName(productName);

		System.out.println("enter first product description");
		String productDescription = scanner.nextLine();
		product.setProductDescription(productDescription);

		System.out.println("enter first product open date");
		String openDate = scanner.nextLine();
		product.setOpenDate(openDate);

		System.out.println("enter first product validity date");
		String validityDate = scanner.nextLine();
		product.setValidityDate(validityDate);

		System.out.println("enter first product expiry date");
		String expiryDate = scanner.nextLine();
		product.setExpiryDate(expiryDate);

		System.out.println("enter first product price");
		double productPrice = scanner.nextDouble();
		product.setProductPrice(productPrice);

		System.out.println("enter first product state");
		boolean active = scanner.nextBoolean();
		product.setActive(active);

	}

	public static void displayProductDetails() {

		System.out.println("product code:" + "  " + product.getProductCode());
		System.out.println("product name:" + "  " + product.getProductName());
		System.out.println("product description:" + "  " + product.getProductDescription());
		System.out.println("product open date:" + "  " + product.getOpenDate());
		System.out.println("product validity date:" + "  " + product.getValidityDate());
		System.out.println("product expiry date:" + "  " + product.getExpiryDate());
		System.out.println("product price:" + "  " + product.getProductPrice());
		System.out.println("product state:" + "  " + product.isActive());

	}

}
