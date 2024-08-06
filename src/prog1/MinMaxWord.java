package prog1;

public class MinMaxWord {

	public static void main(String[] args) {
		String str = "My name i paresh rawal";
		String[] strArr = str.split(" ");
		int min = strArr[0].length();
		int max = 0;
		int i = 1;
		do {
			if (strArr[i].length() < min) {
				min = strArr[i].length();
			}
			if (strArr[i].length() > max) {
				max = strArr[i].length();
			}
			i++;
		} while (strArr.length != i);

		System.out.println("Min Length: " + min);
		System.out.println("Max Length: " + max);

	}
}