package com.global;

public class ArithmeticOperations {
	
	int i = 4, j = 5, k;
	
	public void add() {
		
		k = i + j;
	}
	
	public void add(ArithmeticOperations operations) {
		
		k = operations.i + j;
	}

}
