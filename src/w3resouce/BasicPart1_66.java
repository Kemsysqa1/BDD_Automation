package w3resouce;

public class BasicPart1_66 {

	public static void main(String[] args) {
		int count = 0;
		int i = 2;
		int result = 0;

		while (count < 100) {

			if (primeNumber(i)) {
				result = result + i;
				count++;
			}
			i++;
		}
		System.out.println(result);
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