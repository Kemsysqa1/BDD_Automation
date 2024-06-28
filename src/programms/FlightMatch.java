package programms;

public class FlightMatch {

	public static void main(String[] args) {
		int[] source = { 1, 2, 3, 4 };
		int[] destination = { 1, 2, 3, 4 };

		for (int i = 0; i < source.length; i++) {
			for (int j = i; j < destination.length; j++) {
				System.out.println(source[i] + "" + destination[j]);
			}
		}
	}
}