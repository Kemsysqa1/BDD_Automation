package prog1;

public  class PrimeNumber {

	public static void main(String[] args) {
		int count = 0;
		int counter = 0;
		int i = 2;
		while (counter < 100) {
			if (primeNumber(i)) {
				count += i;
				counter++;

			}
			i++;
		}
		System.out.println(count);
	}

	public static boolean primeNumber(int no) {
		for (int i = 2; i < no; i++) {
			if (no % i == 0) {
				return false;
			}
		}
		return true;
	}
}