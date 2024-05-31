package Trail;

public class SwapNumber {

	public static void main(String[] args) {
		int a = 12, b = 25;

		a = a+ b;
		b = a - b;
		a = a - b;

		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}

}
