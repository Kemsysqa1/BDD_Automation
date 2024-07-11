package w3resouce;

public class BasicPart2_178 {

	public static void main(String[] args) {
		int count = 1;
		int[] num = { 10, 11, 12, 13, 14, 7, 8, 9, 10, 11, 12, 1, 2, 3 };
		int max = 0;

		for (int i = 0; i < num.length; i++) {
			if (i != num.length - 1) {
				int inc = ++num[i];
				if (inc == num[i + 1]) {
					count++;
				} else {
					count = 1;
				}
			}
			if (max < count) {
				max = count;
			}
		}
		System.out.println(max);
	}
}