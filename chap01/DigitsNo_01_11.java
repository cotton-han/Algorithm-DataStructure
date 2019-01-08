package chap01;

import java.util.Scanner;

public class DigitsNo_01_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.println("양의 정수값의 자릿수를 구합니다.");

		int n;
		do {
			System.out.print("정수값：");
			n = s.nextInt();
		} while (n <= 0);
		
		System.out.println("그 수는 "+digitsNo(n)+"자리입니다.");
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
