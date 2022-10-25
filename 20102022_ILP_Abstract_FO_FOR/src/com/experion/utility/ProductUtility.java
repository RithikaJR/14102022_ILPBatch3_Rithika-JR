package com.experion.utility;

import java.util.Scanner;

import com.experion.entity.Account;
import com.experion.entity.Card;
import com.experion.entity.Loan;
import com.experion.entity.Product;

public class ProductUtility {

	public static void main(String[] args) {
		/*
		 * Account account = new Account("Women Savings Bank", "ACC1987761", 10000);
		 * AccountService accountService = new AccountService();
		 * accountService.depositCash(account, 10000);
		 * accountService.depositCash(account, 10000, "rty5776");
		 * accountService.depositCash(account, "rty.com", 10000);
		 */
		Product product = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.Account    2.Card      3.Loan");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			product = new Account("Women Savings Account", "ACE1234", 1000);
			Account account=(Account)product;
			account.checkBalance();
			account.cashWithdraw();
			break;
		case 2:
			product = new Card("Master Card", "MCE1234", 10000);
			Card card=(Card)product;
			card.checkBalance();
			card.cashWithdraw();
			break;
		case 3:
			product = new Loan("Home Loan", "HLE1234", 100000);
			Loan loan=(Loan)product;
			loan.checkDueDate();
			loan.loanApproval();
			break;

		}
		product.checkProductValidity();

	}
}