package com.bank.engine.accounts;

public class SavingsAccount extends Account {

	public SavingsAccount(String username, String password)  {
		super(username, password);
	}

	@Override
	public AccountType dataBaseGetAccountType() {
		return AccountType.SAVINGS;
	}
}
