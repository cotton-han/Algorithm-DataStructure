package chap01;

public class Multi99TableEx_01_12 {

	public static void main(String[] args) {
		System.out.println("----- ����ǥ -----");

		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");

		
		for (int i = 1; i <= 9; i++) { //�����Ѵ���Ϸ��� i=0���� �����ؾ���
			//if(i!=0)
				System.out.printf("%3d|", i);
			//else
			//	System.out.print("   |");
			for (int j = 1; j <= 9; j++) {
				//if(i!=0)
					System.out.printf("%3d", i * j);
				//else
				//	System.out.printf("%3d", j);
			}
			System.out.println();
			//if(i==0)
			//	System.out.println("---+---------------------------");
		}
	}
}
