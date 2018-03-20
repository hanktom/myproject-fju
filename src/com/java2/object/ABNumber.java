package com.java2.object;

public class ABNumber {
	String number;
	public ABNumber(String number){
		this.number = number;
	}
	public int validate(String secret){
		int result = 0;
		int length = secret.length();
		for (int i = 0; i < number.length(); i++) {
			char c = number.charAt(i);
			for (int j = 0; j < length; j++) {
				if (c == secret.charAt(j)) {
					if (i == j) {
						result = result + 10;
					} else {
						result += 1;
					}
					break;
				}
			}
		}
		return result;
	}
}
