package com.tom;

public class ScoreArray {

	public static void main(String[] args) {
		int scores[][] = new int[5][3];
		scores[0][0] = 55;
		scores[0][1] = 66;
		scores[0][2] = 77;
		scores[1][0] = 11;
		scores[1][1] = 22;
		scores[1][2] = 33;
		scores[2][0] = 77;
		scores[2][1] = 88;
		scores[2][2] = 99;
		scores[3][0] = 55;
		scores[3][1] = 66;
		scores[3][2] = 77;
		scores[4][0] = 55;
		scores[4][1] = 66;
		scores[4][2] = 77;
		
		for (int i=0; i<5; i++){
			System.out.print(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2] +
					 "\t" );
			int average = (scores[i][0]+scores[i][1]+scores[i][2])/3;
			if (average < 60){
				System.out.println(average+"*");
			}else{
				System.out.println(average);
			}
		}
		
	}

}
