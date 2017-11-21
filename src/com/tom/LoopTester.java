package com.tom;

import java.util.Scanner;

public class LoopTester {

	public static void main(String[] args) {
		System.out.print("Please enter a number:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		int n = Integer.parseInt(line);
		int i = 1;
		while(i<=n){
			
			System.out.println(i);
			i = i + 1;
			if (i > 10){
				break;
			}
		}
		System.out.println("外");
	}
}
