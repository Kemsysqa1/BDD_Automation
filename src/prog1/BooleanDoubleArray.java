package prog1;

public class BooleanDoubleArray {

	public static void main(String[] args) {
		boolean[][] array = { { true, false, true }, { false, true, false } };

		for (int i = 0; i <= array.length - 1; i++) {

			for (int j = 0; j <= array.length; j++) {
				System.out.println(array[i][j]);
			}
		}
	}

}
