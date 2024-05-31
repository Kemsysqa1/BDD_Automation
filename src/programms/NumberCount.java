package programms;

public class NumberCount {

	public static void main(String[] args) {
		int no = 1235;
		int count = 0;

		while (no != 0) {
			int temp = no % 10;
			count++;
			no = no / 10;

		}
		System.out.println("Number Count: " + count);
	}

}
