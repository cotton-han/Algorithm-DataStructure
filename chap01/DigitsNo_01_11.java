package chap01;

import java.util.Scanner;

public class DigitsNo_01_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� �������� �ڸ����� ���մϴ�.");

		int n;
		do {
			System.out.print("��������");
			n = s.nextInt();
		} while (n <= 0);
		
		System.out.println("�� ���� "+digitsNo(n)+"�ڸ��Դϴ�.");
	}

	private static int digitsNo(int n) {
		// TODO Auto-generated method stub
		int i=0;
		
		while(true) {
			n=n/10;
			i++;
			if(n==0)
				break;
		}
		return i;
	}

}
