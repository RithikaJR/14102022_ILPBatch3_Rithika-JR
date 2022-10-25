package com.bank.service;

import java.util.ArrayList;

import usecasesolcom.bank.entity.Product;
import usecasesolcom.bank.entity.Service;

public class BankService {

	public ArrayList<Service> createServices() {
		ArrayList<Service> allServiceList = new ArrayList<Service>();
		allServiceList.add(new Service("Mobile Banking"));
		return allServiceList;

	}

	public static ArrayList<Product> createProducts(ArrayList<Service> allServiceList) {
		ArrayList<Product> productList = new ArrayList<Product>();

		createSavingsMaxAccount(allServiceList);
		createCurrentAccount(allServiceList);
		createLoanAccount(allServiceList);

		return productList;

	}

	private static void createLoanAccount(ArrayList<Service> allServiceList) {

		ArrayList<Service> loanServiceList = new ArrayList<Service>();
		for (Service service : allServiceList) {
			if (service.getServiceName().compareTo("CashDeposit") == 0
					|| service.getServiceName().compareTo("ChequeDeposit") == 0)

			{
				loanServiceList.add(service);
			}
		}
		// TODO Auto-generated method stub

	}

	private static void createCurrentAccount(ArrayList<Service> allServiceList) {
		// TODO Auto-generated method stub

	}

	private static void createSavingsMaxAccount(ArrayList<Service> allServiceList) {
		// TODO Auto-generated method stub

	}
}
