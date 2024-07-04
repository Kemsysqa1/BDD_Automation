package prog1;

public class PrimeNumber {

	public static void main(String[] args) {
		for (int i = 2; i <= 100; i++) {
			if (primeNumber(i)) {
				System.out.println(i);
			}
		}
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
