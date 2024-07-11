package w3resouce;

public class BasicPart1_173 {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3, 4, 5, 6, 7, 8, 8 };
		int input = 4;

		for (int i = 0; i < num.length; i++) {
			if (i <= num.length - input) {
				for (int j = i; j < i + input; j++) {
					if ((j != i) && (j != i + input - 1)) {
						System.out.print(num[j]);
					}
				}
			}
			System.out.println();
		}
	}
}