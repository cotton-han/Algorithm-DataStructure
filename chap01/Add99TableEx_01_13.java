package chap01;

public class Add99TableEx_01_13 {

	public static void main(String[] args) {
		System.out.println("----- 덧셈표 -----");

		System.out.print("   |");
		for (int i = 1; i <= 9; i++)
			System.out.printf("%3d", i);
		System.out.println("\n---+---------------------------");


		for (int i = 1; i <= 9; i++) { //내가한대로하려면 i=0부터 시작해야함
			System.out.printf("%3d|", i);
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%3d", i + j);
			}
			System.out.println();
		}
	}
}
