package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Chatbot {

	public static void main(String[] args) {
		Random random = new Random();
		String[] responses = {"呵","哦", "哈", "是哦", "呵呵", "哈哈"};
		System.out.print("BOT: 安安");
		System.out.print("Hank:");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		while(!line.equals("quit")){
			int r = random.nextInt(responses.length);
			System.out.println("BOT: "+ responses[r] );
			System.out.println("Hank:");
			line = scanner.nextLine();
		}
	}

}
