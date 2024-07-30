package Trail;

public class DuplicateValueOfTwoArray {

	public static void main(String[] args) {
		int[][] no = { { 1, 2 }, { 1, 9, 2 } };

		for (int i = 0; i < no[0].length; i++) {
			for (int j = 0; j < no[1].length; j++) {

				if (no[0][i] == no[1][j]) {
					System.out.print(no[0][1]);
				}

			}
			System.out.println();
		}
	}
}