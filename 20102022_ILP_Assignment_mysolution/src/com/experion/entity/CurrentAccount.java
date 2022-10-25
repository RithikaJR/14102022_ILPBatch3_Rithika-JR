package com.experion.entity;

import com.experion.service.CurrentAccountService;
import com.experion.service.DepositWithdraw;
import com.experion.service.Display;
import com.experion.service.SavingsCurrentServices;

public class CurrentAccount extends Account implements SavingsCurrentServices , CurrentAccountService,DepositWithdraw,Display {
	
	private double currentAccountBalance;

	public CurrentAccount(String accountName,  double accountBalance,
			double currentAccountBalance) {
		super(accountName,  accountBalance);
		this.currentAccountBalance = currentAccountBalance;
	}

	public double getCurrentAccountBalance() {
		return currentAccountBalance;
	}

	public void setCurrentAccountBalance(double currentAccountBalance) {
		this.currentAccountBalance = currentAccountBalance;
	}

	@Override
	public void mobileBanking() {
		// TODO Auto-generated method stub
		
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
		super.setAccountBalance(super.getAccountBalance()+currentAccountBalance);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void withdrawMoney() {
		super.setAccountBalance(super.getAccountBalance()-currentAccountBalance);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}
	

}
