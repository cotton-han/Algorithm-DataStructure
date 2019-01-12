package chap02;

import java.util.Random;

public class Rcopy_02_05 {
	public static void main(String[] args) {
		Random rand = new Random();

		int numa,numb;
		
		numa = rand.nextInt(10)+5;		// 요솟수
		numb = rand.nextInt(10)+5;		// 요솟수
		
		System.out.println("a의 요솟수 ："+numa);

		int[] a = new int[numa];			// 요솟수가 num인 배열
		int[] b = new int[numb];
		
		for (int i = 0; i < numa; i++) {
			a[i] = rand.nextInt(50)+1;
		}
		for (int i = 0; i < numb; i++) {
			b[i] = rand.nextInt(50)+1;
		}
		
		System.out.print("a 배열: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("b의 요솟수 ："+numb);
		System.out.print("b 배열: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println("배열 b의 모든 요소를 배열 a에 복사");
		rcopy(a,b);
		System.out.print("a 배열: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
	static void rcopy(int[] a, int[] b) {
		int num = a.length<=b.length?a.length:b.length;
		
		for(int i=0; i<num; i++) {
			a[i]=b[b.length-i-1];
		}
	}
}
