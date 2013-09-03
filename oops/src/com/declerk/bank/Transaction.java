package com.declerk.bank;

public class Transaction {
	private String txnType;
	private double txnAmt;
	private double balance;
	
	
	
	public Transaction() {
		this("unknown",0,0);
	}



	public Transaction(String txnType, double txnAmt, double balance) {
		super();
		this.txnType = txnType;
		this.txnAmt = txnAmt;
		this.balance = balance;
	}



	public void print() {
		System.out.println("Transaction--------");
		System.out.println("Type: " + this.txnType);
		System.out.println("Amt: $" + this.txnAmt);
		System.out.println("Balance: $" + this.balance);
		System.out.println("-------------------");
	}
	
}
