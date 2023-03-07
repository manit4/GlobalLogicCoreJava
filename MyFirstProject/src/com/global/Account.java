package com.global;

public class Account {
	
	private int amount = 50;
	
	public int withDrawl(int withDrawlAmount) {
		
		amount  = amount - withDrawlAmount;
		
		return amount;
	}

	public int getAmount() {
		return amount;
	}
}
