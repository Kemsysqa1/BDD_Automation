package programms;

public class StringFormat {

	public static void main(String[] args) {
		String[] names = { "prem", "prakash", "prahlad" };
		String prefix = names[0];

		for (int i = 1; i < names.length; i++) {
			String name = names[i];
			prefix = commanPrefix(prefix, name);
		}
		System.out.println(prefix);
	}

	private static String commanPrefix(String str1, String str2) {
		int minLength = Math.min(str1.length(), str2.length());

		for (int i = 0; i < minLength; i++) {
			if (str1.charAt(i) != str2.charAt(i)) {
				return str1.substring(0, i);
			}
		}
		return str1;

	}
}
