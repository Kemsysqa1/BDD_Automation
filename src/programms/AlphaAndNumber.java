package programms;

public class AlphaAndNumber {

	public static void main(String[] args) {
		char ch = 'A';
		int count = 1;

		do {
			System.out.print(ch + "" + count);
			ch++;
			count++;

		} while (ch <= 'Z');

	}
}
