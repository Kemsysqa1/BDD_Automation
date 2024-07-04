package starPatterns;

public class Star4 {

	public static void main(String[] args) {
		int no = 7;

		for (int i = 0; i <= no * 2; i++) {
			int count = i < no ? no - i : i - no;

			for (int j = 0; j < count; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < (no - count) * 2 - 1; j++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
