package Trail;

public class ArrayLastIndexValue {

	public static void main(String[] args) {
		int[] num = { 505 };
		array(num);
	}

	public static void array(int[] num) {

		int count = 0;
		int lastValue = 0;
		for (int i = num.length - 1; i >= 0; i--) {
			if (num.length - 1 == i) {
				lastValue = num[i];
				lastValue++;
			}
			int counter = lastValue;
			while (counter != 0) {
				counter = counter / 10;
				count++;
			}
		}

		int[] no = new int[count];
		for (int i = 0; i < no.length; i++) {
			if (num.length == 1) {
				int rem = lastValue % 10;
				no[i] = rem;
				lastValue = lastValue / 10;
			} else {
				if (num.length - 1 == i) {
					lastValue = num[i];
					lastValue++;
					no[i] = lastValue;
				} else {
					no[i] = num[i];
				}
			}
		}

		for (int j = no.length - 1; j >= 0; j--) {
			System.out.println(no[j]);
		}

	}
}