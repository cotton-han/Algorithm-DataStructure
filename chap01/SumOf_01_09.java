package chap01;

public class SumOf_01_09 {
	public static void main(String[] args) {
		
		System.out.println("sumof(3,5): " + sumof(3,5) + "입니다.");
		System.out.println("sumof(6,4): " + sumof(6,4) + "입니다.");
	}
	
	static int sumof(int a, int b) {
		int sum = 0;
		/*내 방법
		if(a<=b)
			for (int i = a; i <= b; i++)
				sum += i;					// sum에 i를 더합니다.
		else
			for (int i = b; i <= a; i++)
				sum += i;
		*/
		
		int min; // a, b의 작은 쪽의 값
		int max; // a, b의 큰 쪽의 값

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
