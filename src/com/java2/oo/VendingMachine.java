package com.java2.oo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VendingMachine {
	int total = 0;
	List<Drink> drinks = new ArrayList<>();
	
	public void on(){
		System.out.println("Please insert coins...");
		for (int i=0; i<drinks.size(); i++){
			Drink drink = drinks.get(i);
			System.out.println(drink.getId() + "\t" + drink.getName() + "\t" + drink.getPrice());
		}
		Scanner scanner = new Scanner(System.in);
		int data = -1;
		while (data != 0){
			data = scanner.nextInt();
			switch(data){
			case 0:
				break;
			}
		}
	}
}
