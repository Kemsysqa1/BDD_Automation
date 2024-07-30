package prog1;

public class SubString2 {

	public static void main(String[] args) {
		String str = "premprep";
		// prem,remp, empr

		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)) {
					String output = str.substring(i, j);
					System.out.println(output);
					break;
				}
			}
		}
	}
}