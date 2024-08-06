package prog1;

public class MidValueOfArray {

	public static void main(String[] args) {
		int[] no = { 2, 4, 6, 8, 10, 12 };
		double output = 0;

		for (int i = 0; i <= no.length; i++) {
			int mid = no.length / 2;

			if (i % 2 == 0) {
				output = no[mid] + no[mid - 1];
				output = output / 2;
			} else {
				output = no[mid];
			}
		}
		System.out.println(output);

	}

}
