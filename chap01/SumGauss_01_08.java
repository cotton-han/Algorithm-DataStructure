package chap01;
import java.util.Scanner;
// 1, 2, ��, n�� ���� ���մϴ�.

class SumGauss_01_08 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1���� n������ �������մϴ�.");
		System.out.print("n�� ����");
		int n = stdIn.nextInt();

		// �� : ¦���� ���� Ȧ���� ���� ���� �ٸ��� ������ 3�� �������̿�(���콺�� ����)
		int sum = n % 2 == 0? 
				(1+n)*(n/2) : (1+n)*(n/2)+(n/2+1);					

		System.out.println("1���� " + n + "������ ���� " + sum + "�Դϴ�.");
	}
}
