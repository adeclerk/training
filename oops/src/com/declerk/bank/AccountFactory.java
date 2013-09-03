package com.declerk.bank;


public final class AccountFactory {
	private AccountFactory() {
		
	}
	
	public static Banking createAccount(String holder,
											String acType) {
		Banking acnt = null;
		if(acType.equalsIgnoreCase("savings") )
			acnt = new Savings(holder);
		else
			acnt = new Checking(holder);
		return acnt;
		
	}
}