package chap01;

import java.util.Scanner;

public class NumPira_01_17 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("���� �Ƕ�̵带 ����մϴ�.");

		do {
			System.out.print("�� �� �Ƕ�̵��Դϱ�? : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		npira(n);
	}
	static void npira(int n) {
		for (int i = 1; i <= n; i++) { 					
			for (int j = 1; j <= n - i + 1; j++) 		
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	
				System.out.print(i%10);
			System.out.println(); 						
		}
	}
}
