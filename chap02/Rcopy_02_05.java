package chap02;

import java.util.Random;

public class Rcopy_02_05 {
	public static void main(String[] args) {
		Random rand = new Random();

		int numa,numb;
		
		numa = rand.nextInt(10)+5;		// ��ڼ�
		numb = rand.nextInt(10)+5;		// ��ڼ�
		
		System.out.println("a�� ��ڼ� ��"+numa);

		int[] a = new int[numa];			// ��ڼ��� num�� �迭
		int[] b = new int[numb];
		
		for (int i = 0; i < numa; i++) {
			a[i] = rand.nextInt(50)+1;
		}
		for (int i = 0; i < numb; i++) {
			b[i] = rand.nextInt(50)+1;
		}
		
		System.out.print("a �迭: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("b�� ��ڼ� ��"+numb);
		System.out.print("b �迭: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		System.out.println("�迭 b�� ��� ��Ҹ� �迭 a�� ����");
		rcopy(a,b);
		System.out.print("a �迭: ");
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
