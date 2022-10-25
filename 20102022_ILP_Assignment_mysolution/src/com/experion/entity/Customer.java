package com.experion.entity;

import java.util.ArrayList;

import com.experion.service.Display;

public class Customer implements Display{
	
	private String customerId;
	private String customerName;
	ArrayList<Account>accountList	=new ArrayList<Account>();
	public Customer(String customerId, String customerName, ArrayList<Account> accountList) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.accountList = accountList;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public ArrayList<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(ArrayList<Account> accountList) {
		this.accountList = accountList;
	}
	@Override
	public void displayDetails() {
		
		System.out.println("Customer Id\tCustomer Name\tAccount Type\tAccount Balance");
		for(Account account:accountList)
		{
			System.out.println(customerId+"\t"+customerName+"\t"+account);
		}
		// TODO Auto-generated method stub
		
	}
	

}
