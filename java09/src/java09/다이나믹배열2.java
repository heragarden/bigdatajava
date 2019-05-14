package java09;

import java.util.Scanner;

public class 다이나믹배열2 {

	public static void main(String[] args) {
		int[][] classAB = new int[2][];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < classAB.length; i++) {
			System.out.print(i+1 + "반 인원을 넣으세요.");
			int count = sc.nextInt();
			classAB[i] = new int[count];
		}
		
		classAB[0][1] = 100;
		classAB[1][1] = 99;
		
		System.out.println(classAB[0][1]);
		System.out.println(classAB[1][1]);
	}

}
