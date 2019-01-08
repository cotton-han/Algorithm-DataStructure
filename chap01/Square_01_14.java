package chap01;

import java.util.Scanner;

public class Square_01_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("사각형을 출력합니다.");
		
		do {
			System.out.print("단수는：");
			n = s.nextInt();
		} while (n <= 0);
		
		for(int i=0; i<n ; i++) {
			for(int j=0; j<n; j++)
				System.out.print("*");
			System.out.println();
		}
	}

}
