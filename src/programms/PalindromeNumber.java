package programms;

public class PalindromeNumber {
	public static void main(String[] args) {
		palindromeWithForLoop(151);
	}

	public static void palindromeWithForLoop(int num) {
		int temp = 0;
		int rev = 0;

		for (int i = num; i > 0; i = i / 10) {
			temp = i % 10;
			rev = rev * 10 + temp;

		}
		System.out.println(rev);
	}

}
