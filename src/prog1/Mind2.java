package prog1;

public class Mind2 {

	public static void main(String[] args) {
		String str = "a1b2c3d4";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isAlphabetic(ch)) {
				System.out.println("Alpha: " + ch);
			} else if (Character.isDigit(ch)) {
				//System.out.println("Numeric: " + ch);	
			}

		}

	}

}
