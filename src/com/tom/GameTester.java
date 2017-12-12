package com.tom;

import java.util.Scanner;

/* 有一個遊戲使用鍵盤右方數字鍵移動角色，上下左右分別是 8,2,4,6
 * 程式一執行就持續接受使用者輸入，輸入4印出"向左"，輸入2印出"向下"
 * 以此類推，當使用者輸入0時，立即結束程式。
 * 
 * 
 */
public class GameTester {

	public static void main(String[] args) {
		int pos = 0;
		int hp = 100;
		int row = 3;
		int col = 5;
		Scanner scanner = new Scanner(System.in);
		int d = -1;
		while( d != 0 ){
			System.out.println("目前位置:" + pos + " HP:" + hp);
			System.out.print("請輸入方向:");
			String dir = scanner.nextLine();
			d = Integer.parseInt(dir);
			switch(d){
			case 2: 
				System.out.println("向下");
				if (pos/col < row-1){
					pos = pos + col;
					hp = hp - 5;
				}else{
					hp = hp -30;
				}
				break;
			case 4: 
				System.out.println("向左");
				if (pos%col != 0){
					pos = pos - 1;
					hp = hp - 5;
				}else{
					hp = hp -30;
				}
				break;
			case 6: 
				System.out.println("向右");
				if (pos%col != col-1){
					pos = pos + 1;
					hp = hp - 5;
				}else{
					hp = hp -30;
				}
				break;
			case 8: 
				System.out.println("向上");
				if (pos/col > 0){
					pos = pos - col;
					hp = hp - 5;
				}else{
					hp = hp -30;
				}
				break;
			case 0: 
				System.out.println("Bye");
				break;
			}
		}
	}

}
