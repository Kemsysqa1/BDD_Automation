package Trail;

public class ArrayLastIndexValue {

	public static void main(String[] args) {
		int[] num = { 1, 2, 3 };
		array(num);
	}

	public static void array(int[] num) {
		int count = 0;
		int lastValue = num[num.length - 1] + 1;

		int counter = lastValue;
		while (counter != 0) {
			counter = counter / 10;
			count++;
		}

		int[] no = new int[count + num.length - 1];
		int index = 0;

		while (lastValue != 0) {
			no[index] = lastValue % 10;
			lastValue = lastValue / 10;
			index++;
		}

		for (int i = num.length - 2; i >= 0; i--) {
			no[index] = num[i];
			index++;
		}

		for (int j = no.length - 1; j >= 0; j--) {
			System.out.println(no[j]);
		}
	}
}