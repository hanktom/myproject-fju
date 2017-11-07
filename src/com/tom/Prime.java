package com.tom;

public class Prime {

	public static void main(String[] args) {
		for (int i=2; i<1000; i++){
			boolean prime = true;
			for (int j=2; j<i; j++){
				if (i % j ==0){
					prime = false;
					break;
				}
			}
			if (prime) {
				System.out.print(i+" ");
			}
		}
	}

}
