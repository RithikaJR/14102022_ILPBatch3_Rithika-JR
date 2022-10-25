package com.experion.entity;

import com.experion.service.AccountCardService;

public class Card extends Product implements AccountCardService  {

	private String cardNumber;
	private double cardBalance;
	public Card(String productName, String cardNumber, double cardBalance) {
		super(productName);
		this.cardNumber = cardNumber;
		this.cardBalance = cardBalance;
	}
	public String getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}
	public double getCardBalance() {
		return cardBalance;
	}
	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}
	@Override                                                                               //annotation
	public void checkProductValidity() {
		
		System.out.println("Valididty check of card class");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void checkBalance() {
		
		System.out.println("Check Balance");
		// TODO Auto-generated method stub
		
	}
	@Override
	public void cashWithdraw() {
		
		
		System.out.println("Withdraw Cash");
		// TODO Auto-generated method stub
		
	}
	
	
	




	

	

}
