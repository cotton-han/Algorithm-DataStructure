package chap01;
import java.util.Scanner;
// 1, 2, ��, n�� ���� ���մϴ�.

class SumForEx_01_07 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1���� n������ �������մϴ�.");
		System.out.print("n�� ����");
		int n = stdIn.nextInt();

		int sum = 0;					// ��

		for (int i = 1; i <= n; i++) {
			sum += i;					// sum�� i�� ���մϴ�.
			if(i==n)
				System.out.println(i+" = "+sum);
			else
				System.out.print(i+" + ");
		}
	}
}