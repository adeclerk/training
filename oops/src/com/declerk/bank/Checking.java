package com.declerk.bank;

import java.io.IOException;


public class Checking extends Account {
	private double overdraft = 50;
	public Checking() {
		// TODO Auto-generated constructor stub
	}

	public Checking(String holderName) {
		super(holderName, 100);
		// TODO Auto-generated constructor stub
	}

        @Override 
        public void deposit(double amount) {
            if(overdraft < 50){
                overdraft += amount;
                if(overdraft > 50) {
                    double remainder = overdraft-50;
                    balance += remainder;
                } else {
                    overdraft += amount;
                }
            } else {
                balance += amount;
            }
            txns.add(new Transaction("deposit",amount,balance));
            
        }
	
	public void withdraw(double amount) throws BalanceException {
		if(amount < (balance + overdraft)) {
			if(balance == 0) 
				overdraft -= amount;
			else {
				
				if(amount > balance) {
				amount -= balance;
				balance = 0;
				overdraft -= amount;
				}
				else {
					balance -= amount;	
				}
			}
			txns.add(new Transaction("withdraw",amount,balance));
            try {
				logger.log(acntNo, "withdraw", amount);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
            try {
				logger.log(acntNo, "insuffucient funds", amount);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Error, insufficient funds!");
		}
	}
}