package chap01;

import java.util.Scanner;

public class StarPira_01_16 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("별 피라미드를 출력합니다.");

		do {
			System.out.print("몇 단 피라미드입니까? : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		spira(n);
	}
	static void spira(int n) {
		for (int i = 1; i <= n; i++) { 					// i행 (i = 1, 2, … ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1개의 ' '를 나타냄
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1개의 '*'를 나타냄
				System.out.print('*');
			System.out.println(); 						// 개행(줄변환)
		}
	}
}
