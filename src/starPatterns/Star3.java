package starPatterns;

public class Star3 {

	public static void main(String[] args) {
		int n = 5;

		for (int i = 0; i < n * 2; i++) {
			int row = i < n ? i : n;
			for (int j = 0; j <= row; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}