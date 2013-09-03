package com.declerk.bank;

public interface Banking {

	void deposit(double amount);
	void withdraw(double amount) throws BalanceException;
	void summary();
	void statement();
}
