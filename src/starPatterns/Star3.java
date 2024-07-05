package starPatterns;

public class Star3 {

	public static void main(String[] args) {

		int no = 9;
		for (int i = 0; i <= no; i++) {
			for (int j = 0; j <= i; j++) {
				if (i >= 2 && i != no) {
					if (j == i || j == 0) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}