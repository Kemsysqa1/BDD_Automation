package Trail;

public class Fibonnaci {

	public static void main(String[] args) {
		fibo();
	}

	public static void fibo() {
		int a = 1;
		int b = 0;
		int c = 0;

		for (int i = 1; i < 10; i++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

}
