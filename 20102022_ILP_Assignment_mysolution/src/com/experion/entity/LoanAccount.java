package com.experion.entity;

import com.experion.service.Display;
import com.experion.service.LoanService;

public class LoanAccount extends Account implements LoanService,Display{

	private String loanNumber;
	private double loanAmount;
	public LoanAccount(String accountName,  double accountBalance, String loanNumber,
			double loanAmount) {
		super(accountName,  accountBalance);
		this.loanNumber = loanNumber;
		this.loanAmount = loanAmount;
	}
	public String getLoanNumber() {
		return loanNumber;
	}
	public void setLoanNumber(String loanNumber) {
		this.loanNumber = loanNumber;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	@Override
	public void cashDeposit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void chequeDeposit() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void displayDetails() {
		// TODO Auto-generated method stub
		
	}

	

}
