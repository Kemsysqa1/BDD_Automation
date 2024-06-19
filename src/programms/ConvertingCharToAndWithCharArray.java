package programms;

public class ConvertingCharToAndWithCharArray {
	public static void main(String[] args) {
		String str = "Tomorrow";
		int count = 0;
		char[] charArray = str.toCharArray();
		StringBuffer strBuffer = new StringBuffer();

		for (int i = 0; i < charArray.length; i++) {
			if (charArray[i] == 'o') {
				for (int j = 0; j <= count; j++) {
					charArray[i] = '&';
					strBuffer.append(charArray[i]);
				}
				count++;
			} else {
				strBuffer.append(charArray[i]);
			}
		}
		System.out.println(strBuffer);
	}

}
