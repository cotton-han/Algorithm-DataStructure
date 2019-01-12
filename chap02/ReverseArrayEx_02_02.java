package chap02;

import java.util.Random;

public class ReverseArrayEx_02_02 {
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿈
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
	}

	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		printArray(a);
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
			System.out.println("a["+i+"]과(와) a["+(a.length-i-1)+"]를 교환합니다.");
			printArray(a);
		}
	}
	
	//배열을 출력하는 함수
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Random rand = new Random();

		int num = rand.nextInt(10)+5;		// 요솟수
		System.out.println("요솟수 ："+num);

		int[] x = new int[num];			// 요솟수가 num인 배열

		for (int i = 0; i < num; i++) {
			x[i] = rand.nextInt(50)+1;
		}
		
		reverse(x);		// 배열 a의 요소를 역순으로 정렬
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}
}
