package com.java2.io;

public class Sales {
	int type;
	int amount;
	public Sales(){
		
	}
	public Sales(int type, int amount) {
		super();
		this.type = type;
		this.amount = amount;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
