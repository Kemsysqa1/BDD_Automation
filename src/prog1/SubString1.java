package prog1;

public class SubString1 {

	public static void main(String[] args) {
		String str = "good morning";
		String newStr = str.substring(0, 1).toUpperCase() + str.substring(1, str.length());

		for (int i = 0; i < newStr.length(); i++) {
			if (newStr.charAt(i) == ' ') {
				continue;
			}

			for (int j = 0; j <= i; j++) {

				if (newStr.charAt(j) == 'm') {
					newStr = str;
				}
				System.out.print(newStr.charAt(j));
			}

			System.out.println();
		}
	}
}