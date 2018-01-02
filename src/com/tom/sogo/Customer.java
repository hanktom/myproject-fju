package com.tom.sogo;

public class Customer {
	int amount;
	float discount = 0.05f;
	public Customer(int amount){
		this.amount = amount;
	}
	
	public void print(){
		int total = (int)(amount*(1-discount));
		System.out.println(amount+"\t"+total);
	}
}
