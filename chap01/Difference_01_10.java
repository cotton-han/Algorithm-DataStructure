package chap01;

import java.util.Scanner;

public class Difference_01_10 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		
		System.out.print("a의 값:");
		a = s.nextInt();
		
		while(true) {
			System.out.print("b의 값: ");
			b = s.nextInt();
			if(b>a)
				break;
			System.out.println("a보다 큰 값을 입력하세요!");
		}
		/*System.out.print("b의 값:");
		b = s.nextInt();
		
		while(a>=b) {
			System.out.println("a보다 큰 값을 입력하세요!");
			System.out.print("b의 값: ");
			b = s.nextInt();
		}
		*/
		System.out.println("b-a는 "+(b-a)+"입니다.");
	}
}
