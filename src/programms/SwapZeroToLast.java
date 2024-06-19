package programms;

public class SwapZeroToLast {

	public static void main(String[] args) {
		int[] num = { 0, 4, 0, 1, 0, 4, 7 };

		for (int i = 0; i < num.length; i++) {
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] == 0) {
					if (num[i] < num[j]) {
						int temp = num[j];
						num[j] = num[i];
						num[i] = temp;
					}
				}
			}
			System.out.println(num[i]);
		}
	}
}