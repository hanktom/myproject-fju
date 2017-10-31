package com.tom;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		System.out.println("請輸入一個數字:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		if (n % 2 == 1){
			System.out.println("是奇數");
		}else{
			System.out.println("是偶數");
		}
	}

}
