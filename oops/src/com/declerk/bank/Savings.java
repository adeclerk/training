package com.declerk.bank;

import java.io.IOException;


public class Savings extends Account {

        private static double MIN_BAL = 50;

	public Savings() {
		// TODO Auto-generated constructor stub
	}

	public Savings(String holderName) {
		super(holderName, MIN_BAL);
		// TODO Auto-generated constructor stub
	}


	public void withdraw(double amount) throws BalanceException {
		if( (balance-amount) > MIN_BAL) {
            balance -= amount;
            txns.add(new Transaction("withdraw",amount,balance));
            try {
				logger.log(acntNo, "withdraw", amount);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			  throw new BalanceException("Error: Insufficient Funds");
		}
	}
	
}
