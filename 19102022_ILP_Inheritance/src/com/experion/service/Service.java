package com.experion.service;

import java.util.ArrayList;

import com.experion.entity.Account;
import com.experion.entity.BankServices;
import com.experion.entity.Card;
import com.experion.entity.Product;

public class Service {

	public static Product createProduct(String productType) {

		ArrayList<BankServices>bankservices = new ArrayList<BankServices>();
		bankservices.add(new BankServices("SOB100", "Online Banking"));
		bankservices.add(new BankServices("SOB200", "Mobile Banking"));
		bankservices.add(new BankServices("SOB300", "Cash Deposit"));
		Product product = null;
		if (productType.compareTo("Cards") == 0) {
			product = new Card("PRDMC100", "Master Card", "Card", "Master");
		}

		else if (productType.compareTo("Accounts") == 0) {
			product = new Account("PRDWSA100", "Women Saving Account", "Accounts", "Savings", bankservices);
		}

		return product;
		// TODO Auto-generated method stub

	}

	public static void displayProductDetails(ArrayList<Product> productList) {

		Card card = null;
		Account account = null;
		System.out.println("Product Code" + "\t" + "Product Name" + "\t" + "Product Type" + "\t" + "Account/Card"+"\t"+"Services");
		for (Product product : productList) {
			if (product instanceof Card) {
				card = (Card) product;
				System.out.println(card.getProductCode() + "\t" + card.getProductName() + "\t" + card.getProductType()
						+ "\t" + card.getCardType());
			} else if (product instanceof Account) {
				account = (Account) product;
				System.out.println(
						account.getProductCode() + "\t" + account.getProductName() + "\t" + account.getProductType()
								+ "\t" + account.getAccountType() + "\t");
				System.out.println("Services are:");
				for(BankServices bankservices:account.getBankServices())
				{
					System.out.println(bankservices.getServiceName());
				}
			}
		}
		// TODO Auto-generated method stub

	}
}
