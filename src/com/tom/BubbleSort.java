package com.tom;

public class BubbleSort {

	public static void main(String[] args) {
		int n[] = { 55,  6, 31, 77, 13};
		//           0   1   2   3   4 
		for (int i=0; i<n.length-1; i++){
			for (int j=i+1; j<n.length; j++){
				System.out.println(i+","+j);
				if (n[i] > n[j]){
					int tmp = n[i];
					n[i] = n[j];
					n[j] = tmp;
				}
			}
		}
		for (int num: n){
			System.out.print(num + " ");
		}
	}

}
