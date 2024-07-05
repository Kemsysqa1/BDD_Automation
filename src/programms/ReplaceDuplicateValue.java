package programms;

public class ReplaceDuplicateValue {
	public static void main(String[] args) {
		String str = "Haappppy Biirrtth Daay";
		int count = 1;

		StringBuffer strBuff = new StringBuffer();
		for (int i = 0; i < str.length(); i++) {
			int lastLength = i + 1;

			if (str.length() != lastLength) {
				if (str.charAt(i) == str.charAt(i + 1)) {
					count++;
					if (count > 2) {
						int temp = count / 2;
						if (temp / 2 == 0) {
							strBuff.append(str.charAt(i));
						}
					}
				} else {
					strBuff.append(str.charAt(i));
					count = 1;
				}
			} else {
				strBuff.append(str.charAt(i));
			}
		}
		System.out.println(strBuff);
	}
}