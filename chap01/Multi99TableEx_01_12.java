package chap01;

public class Multi99TableEx_01_12 {

	public static void main(String[] args) {
		System.out.println("----- 곱셈표 -----");

		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");

		
		for (int i = 1; i <= 9; i++) { //내가한대로하려면 i=0부터 시작해야함
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
