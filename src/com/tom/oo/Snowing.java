package com.tom.oo;

import java.util.ArrayList;
import java.util.Random;

public class Snowing {

	public static void main(String[] args) {
		Random random = new Random();
		ArrayList<Integer> snows = new ArrayList<>();
		int numberOfSnow = 5;
		for (int i=0; i<numberOfSnow; i++){
			snows.add(8);
		}
		for (int a=0; a<30; a++){
			for (int i=0 ;i <snows.size(); i++){
				
				for (int j=0; j<snows.get(i);j++){
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.print("\t");
				int n = snows.get(i);
				int r = random.nextInt(3)-1;
				snows.set(i, n + r);
				
			}
			System.out.println();
			try{
				Thread.sleep(500);
			}catch(Exception e){
				
			}
		}

	}

}
