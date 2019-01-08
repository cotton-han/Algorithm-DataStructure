package chap01;

public class SumOf_01_09 {
	public static void main(String[] args) {
		
		System.out.println("sumof(3,5): " + sumof(3,5) + "�Դϴ�.");
		System.out.println("sumof(6,4): " + sumof(6,4) + "�Դϴ�.");
	}
	
	static int sumof(int a, int b) {
		int sum = 0;
		/*�� ���
		if(a<=b)
			for (int i = a; i <= b; i++)
				sum += i;					// sum�� i�� ���մϴ�.
		else
			for (int i = b; i <= a; i++)
				sum += i;
		*/
		
		int min; // a, b�� ���� ���� ��
		int max; // a, b�� ū ���� ��

		if (a < b) {
			min = a;
			max = b;
		} else {
			min = b;
			max = a;
		}

		for (int i = min; i <= max; i++)
			sum += i;
		
		return sum;
	}
}
