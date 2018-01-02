package com.tom.sogo;

public class SilverCustomer extends Customer{
	
	public SilverCustomer(int amount){
		super(amount);
		super.discount = 0.1f;
	}
	
	
}
