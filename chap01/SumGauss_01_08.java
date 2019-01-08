package chap01;
import java.util.Scanner;
// 1, 2, …, n의 합을 구합니다.

class SumGauss_01_08 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("1부터 n까지의 합을구합니다.");
		System.out.print("n의 값：");
		int n = stdIn.nextInt();

		// 합 : 짝수일 때와 홀수일 때의 식이 다르기 때문에 3항 연산자이용(가우스의 덧셈)
		int sum = n % 2 == 0? 
				(1+n)*(n/2) : (1+n)*(n/2)+(n/2+1);					

		System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
	}
}
