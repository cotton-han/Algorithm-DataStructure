package chap02;

import java.util.Scanner;

public class DayOfYearWhile_02_08 {
	// �� ���� �� ��
		static int[][] mdays = {
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// ���
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},	// ����
		};

		// ���� year���� �����ΰ�? (���⣺1����⣺0)
		static int isLeap(int year) {
			return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
		}

		// ���� y�� m�� d���� �� �� ��� �ϼ��� ����
		static int dayOfYear(int y, int m, int d) {
			m=m-1;
			while(m!=0) {		// 1��~(m-1)���� �� ���� ����
				d += mdays[isLeap(y)][m--];
			}
			return d;
		}

		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			int retry;							// �ٽ� �� ��?

			System.out.println("�� �� ��� �� ���� ���մϴ�.");

			do {
				System.out.print("�⣺");  int year  = stdIn.nextInt();	// ��
				System.out.print("����");  int month = stdIn.nextInt();	// ��
				System.out.print("�ϣ�");  int day   = stdIn.nextInt();	// ��

				System.out.printf("�� �� %d��°�Դϴ�.\n", dayOfYear(year, month, day));

				System.out.print("�ѹ� �� �ұ��? (1.����0.�ƴϿ�����");
				retry = stdIn.nextInt();
			} while (retry == 1);
		}
}
