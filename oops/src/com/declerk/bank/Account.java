package com.declerk.bank;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;


/**
 * This is a class representing a bank account.
 * @author adeclerk
 *
 */
public abstract class Account implements Banking {
	protected int acntNo;
	private String holderName;
	protected double balance;
	protected ArrayList<Transaction> txns;
	protected BankingLogger logger = null;
	
	private static int autogen = 0;
	public Account() {
		this("no name",-1);
	}

	/**
	 * Parameterized constructor.
	 * @param holderName String representing account holder's name.
	 * @param balance Double representing the balance of the account.
	 */
	public Account(String holderName, double balance) {
		super();
		this.txns = new ArrayList<Transaction>();
		this.acntNo = Account.autogen++;
		this.holderName = holderName;
		this.balance = balance;
		txns.add(new Transaction("open acct",balance,balance));
		logger = BankingLogger.getInstance();
	}
	
	public void deposit(double amount) {
		balance += amount;
		txns.add(new Transaction("deposit",amount,balance));
        try {
			logger.log(acntNo, "deposit", amount);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public abstract void withdraw(double amount) throws BalanceException;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void summary() {
        System.out.println("Account------------");
        System.out.println("Act No: " + this.acntNo);
        System.out.println("Holder: " + this.holderName);
        System.out.println("Balance: $" + this.balance);
        System.out.println("-------------------");
}
	
	public void statement() {
		Iterator itr = txns.iterator();
		while(itr.hasNext()) {
			Transaction t = (Transaction) itr.next();
			t.print();	
		}
	}
	
}
