package programms;

public class ReplaceDuplicateValue {
	public static void main(String[] args) {
		String str = "Haappppy Biirrtth Daay";
		StringBuffer strBuff = new StringBuffer();

		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) > 2) {
				if (str.charAt(i) != str.charAt(i + 1)) {
					strBuff.append(str.charAt(i));
				}
			}
		}

		// Append the last character since it wasn't checked in the loop
		strBuff.append(str.charAt(str.length() - 1));

		System.out.println(strBuff.toString());
	}
}