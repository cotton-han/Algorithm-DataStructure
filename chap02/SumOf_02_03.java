package chap02;

import java.util.Random;

public class SumOf_02_03 {
	public static void main(String[] args) {
		Random rand = new Random();

		int num = rand.nextInt(10)+5;		// ��ڼ�
		System.out.println("��ڼ� ��"+num);

		int[] x = new int[num];			// ��ڼ��� num�� �迭

		for (int i = 0; i < num; i++) {
			x[i] = rand.nextInt(50)+1;
		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		System.out.println("�迭�� ��� ����� �� :"+sumOf(x));
	}

	private static int sumOf(int[] x) {
		// TODO Auto-generated method stub
		int sum=0;
		
		for (int i = 0; i < x.length; i++) {
			sum+=x[i];
		}
		
		return sum;
	}
}
