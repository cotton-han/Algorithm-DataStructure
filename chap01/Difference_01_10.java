package chap01;

import java.util.Scanner;

public class Difference_01_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		
		System.out.print("a�� ��:");
		a = s.nextInt();
		
		while(true) {
			System.out.print("b�� ��: ");
			b = s.nextInt();
			if(b>a)
				break;
			System.out.println("a���� ū ���� �Է��ϼ���!");
		}
		/*System.out.print("b�� ��:");
		b = s.nextInt();
		
		while(a>=b) {
			System.out.println("a���� ū ���� �Է��ϼ���!");
			System.out.print("b�� ��: ");
			b = s.nextInt();
		}
		*/
		System.out.println("b-a�� "+(b-a)+"�Դϴ�.");
	}
}
