package com.experion.entity;

import com.experion.service.DepositWithdraw;
import com.experion.service.Display;
import com.experion.service.SavingsCurrentServices;

public class SavingsMaxAccount extends Account implements SavingsCurrentServices,DepositWithdraw,Display  {

	private double savingsMaxAmount;

	public SavingsMaxAccount(String accountName, double accountBalance,
			double savingsMaxAmount) {
		super(accountName,  accountBalance);
		this.savingsMaxAmount = savingsMaxAmount;
	}

	
	public double getSavingsMaxAmount() {
		return savingsMaxAmount;
	}


	public void setSavingsMaxAmount(double savingsMaxAmount) {
		this.savingsMaxAmount = savingsMaxAmount;
	}


	@Override
	public void cashDeposit() {
		
		
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atmWithdrawal() {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onlineBanking() {
		
		// TODO Auto-generated method stub
		
	}


	@Override
	public void depositMoney() {
		super.setAccountBalance(super.getAccountBalance()+savingsMaxAmount);
		// TODO Auto-generated method stub
		
	}


	@Override
	public void withdrawMoney() {
		
		super.setAccountBalance(super.getAccountBalance()-savingsMaxAmount);
		// TODO Auto-generated method stub
		
	}


	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}
	
	




	

	

}
