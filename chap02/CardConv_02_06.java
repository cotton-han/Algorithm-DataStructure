package chap02;

import java.util.Scanner;

public class CardConv_02_06 {
	// ������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ�մϴ�.
		static int cardConvR(int x, int r, char[] d) {
			int digits = 0;						// ��ȯ ���� �ڸ���
			String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			do {
				d[digits++] = dchar.charAt(x % r);	// r�� ���� �������� ����
				x /= r;
			} while (x != 0);
			return digits;
		}

		static int cardConv(int x, int r, char[] d) {
			int digits = 0;						// ��ȯ ���� �ڸ���
			String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

			do {
				d[digits++] = dchar.charAt(x % r);	// r�� ���� �������� ����
				x /= r;
			} while (x != 0);
			
			for(int i=0; i<digits/2; i++) {
				char t = d[i];
				d[i] = d[digits-i-1]; ;
				d[digits-i-1]=t;
			}
			
			return digits;
		}
		
		public static void main(String[] args) {
			Scanner stdIn = new Scanner(System.in);
			int no;							// ��ȯ�ϴ� ����
			int cd;							// ���
			int dno;						// ��ȯ ���� �ڸ���
			int retry;						// �ٽ� �� ��?
			char[] cno = new char[32];		// ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭

			System.out.println("10������ ��� ��ȯ�մϴ�.");
			do {
				do {
					System.out.print("��ȯ�ϴ� ���� �ƴ� ������");
					no = stdIn.nextInt();
				} while (no < 0);

				do {
					System.out.print("� ������ ��ȯ�ұ��? (2~36)��");
					cd = stdIn.nextInt();
				} while (cd < 2 || cd > 36);

				dno = cardConv(no, cd, cno);
				//dno = cardConvR(no, cd, cno);		// no�� cd������ ��ȯ
				/*
				System.out.print(cd + "�����δ� ");
				for (int i = dno - 1; i >= 0; i--)	// ���ڸ����� ���ʷ� ��Ÿ��
					System.out.print(cno[i]);
				System.out.println("�Դϴ�.");
				*/
				for (int i = 0; i < dno; i++)	
					System.out.print(cno[i]);
				System.out.println("�Դϴ�.");
				
				System.out.print("�� �� �� �ұ��? (1.����0.�ƴϿ�)��");
				retry = stdIn.nextInt();
			} while (retry == 1);
		}
}
