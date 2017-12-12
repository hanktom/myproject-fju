package com.tom.oo;

public class KnightRider {

	public static void main(String[] args) {
		int pos = 0;
		int a = 1;
		for (int i=0; i<100; i++){
			
			if (pos == 10){
				a = -1;
			}
			if (pos == 0){
				a = 1;
			}
			pos = pos + a;
			System.out.print(pos);
		}
	}

}
