package chap01;

import java.util.Scanner;

public class StarPira_01_16 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;

		System.out.println("�� �Ƕ�̵带 ����մϴ�.");

		do {
			System.out.print("�� �� �Ƕ�̵��Դϱ�? : ");
			n = stdIn.nextInt();
		} while (n <= 0);

		spira(n);
	}
	static void spira(int n) {
		for (int i = 1; i <= n; i++) { 					// i�� (i = 1, 2, �� ,n)
			for (int j = 1; j <= n - i + 1; j++) 		// n-i+1���� ' '�� ��Ÿ��
				System.out.print(' ');
			for (int j = 1; j <= (i - 1) * 2 + 1; j++) 	// (i-1)*2+1���� '*'�� ��Ÿ��
				System.out.print('*');
			System.out.println(); 						// ����(�ٺ�ȯ)
		}
	}
}
