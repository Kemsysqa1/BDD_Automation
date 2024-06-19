package programms;

public class ConvertingCharToAnd {

	public static void main(String[] args) {
		String str = "Tomorrow";
		int count = 0;
		StringBuffer strBuffer = new StringBuffer();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == 'o') {
				for (int j = 0; j <= count; j++) {
					ch = '&';
					strBuffer.append(ch);
				}
				count++;
			} else {
				strBuffer.append(ch);
			}
		}
		System.out.println(strBuffer);
	}

}
