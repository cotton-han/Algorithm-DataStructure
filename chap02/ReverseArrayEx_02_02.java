package chap02;

import java.util.Random;

public class ReverseArrayEx_02_02 {
	// �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲ�
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];  a[idx1] = a[idx2];  a[idx2] = t;
	}

	// �迭 a�� ��Ҹ� �������� ����
	static void reverse(int[] a) {
		printArray(a);
		for (int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
			System.out.println("a["+i+"]��(��) a["+(a.length-i-1)+"]�� ��ȯ�մϴ�.");
			printArray(a);
		}
	}
	
	//�迭�� ����ϴ� �Լ�
	static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Random rand = new Random();

		int num = rand.nextInt(10)+5;		// ��ڼ�
		System.out.println("��ڼ� ��"+num);

		int[] x = new int[num];			// ��ڼ��� num�� �迭

		for (int i = 0; i < num; i++) {
			x[i] = rand.nextInt(50)+1;
		}
		
		reverse(x);		// �迭 a�� ��Ҹ� �������� ����
		
		System.out.println("���� ������ ���ƽ��ϴ�.");
	}
}
