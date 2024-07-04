package prog1;

public class Mind1 {

	public static void main(String[] args) {
		String str = "good morning";
		String[] strArr = str.split("m");

		for (int i = 1; i < strArr[0].length(); i++) {
			for (int j = 0; j < i; j++) {
				if (str.charAt(j) != ' ') {
					str = str.replace('g', 'G');
					System.out.print(str.charAt(j));
				}
			}
			System.out.println();
		}

		for (int k = strArr[0].length(); k < str.length(); k++) {
			for (int l = 0; l < k; l++) {
				if (str.charAt(l) != ' ') {
					str = str.replace('G', 'g');
					System.out.print(str.charAt(l));
				}
			}
			System.out.println();
		}
	}
}