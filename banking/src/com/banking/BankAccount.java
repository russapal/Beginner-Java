package com.banking;

import java.text.SimpleDateFormat;
import java.util.Date;

import custom_exceptions.BankingException;

import static utils.BankValidations.validateBalance;


public class BankAccount 
{
	private int accountNo;
	private String customerName;
	private AcType acctType;
	private Date creationDate;
	private double balance;
	// SDF
	public static SimpleDateFormat sdf;
	static {
		sdf = new SimpleDateFormat("dd-MM-yyyy");
	}

	// for opening a/c : use ctor
	public BankAccount(int accountNo, String customerName, AcType acctType, Date creationDate, double balance) {
		super();
		this.accountNo = accountNo;
		this.customerName = customerName;
		this.acctType = acctType;
		this.creationDate = creationDate;
		this.balance = balance;
	}

	// to return a/c summary : toString
	@Override
	public String toString() {
		return "BankAccount [accountNo=" + accountNo + ", customerName=" + customerName + ", acctType=" + acctType
				+ ", creationDate=" + sdf.format(creationDate) + ", balance=" + balance + "]";
	}

	// deposit funds
	public void deposit(double amount) {
		this.balance += amount;
	}

	// withdraw funds
	public void withdraw(double amount) throws BankingException {
		validateBalance(balance-amount);
		this.balance -= amount;
	}
	//transfer funds from src ("this") --> dest a/c
	public void transferFunds(BankAccount destAcRef,double amount) throws BankingException
	{
		//withdraw from src
		this.withdraw(amount);
		//=> src a/c has suff funds n withdraw : success
		destAcRef.deposit(amount);
	}

}


