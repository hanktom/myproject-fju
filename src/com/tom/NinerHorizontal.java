package com.tom;

public class NinerHorizontal {

	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++){
			for (int j = 2; j <= 5; j++){
				System.out.print(j+"x"+i+"="+(i*j)+"\t");
			}
			System.out.println();
		}
	}

}
