package starPatterns;

public class Number1 {

	public static void main(String[] args) {
		int n = 7;

		for (int i = 1; i < n; i++) {
			int count = i;

			for (int j = 1; j <= count; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
}