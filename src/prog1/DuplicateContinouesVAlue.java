package prog1;

public class DuplicateContinouesVAlue {

	public static void main(String[] args) {
		int[] no = { 1, 2, 2, 3, 4, 4, 5 };

		for (int i = 0; i < no.length; i++) {
			if (i == 0 || no[i] != no[i - 1]) {
				if (i == no.length - 1 || no[i] != no[i + 1]) {
					System.out.println(no[i]);
				}
			}
		}
	}
}