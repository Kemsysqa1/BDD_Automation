package starPatterns;

public class Number1 {

	public static void main(String[] args) {
		int num = 7;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			count = i;
			for (int j = i; j >= num; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
