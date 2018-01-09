package com.tom.sogo;

public class GoldenCustomer extends SilverCustomer {
	int returnMoney;
	public GoldenCustomer(int amount) {
		super(amount);
	}
	
	@Override
	public void print(){
		int total = (int)(amount*(1-discount));
		returnMoney = (int)(amount*(discount));
		System.out.println(amount+"\t"+total + "\t" +returnMoney );
	}

}
