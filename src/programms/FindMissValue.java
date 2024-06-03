package programms;

public class FindMissValue {

	public static void main(String[] args) {
		char[] charArr = { '1', '2', '3', '5' };
		int index = charArr[0];
		char ch = 0;
		char output = 0;
		for (int i = 0; i < charArr.length; i++) {
			ch = (char) index;

			if (charArr[i] != index) {
				output = ch;
				break;
			}

			index++;
		}
		System.out.println("Missing Value Is: " + output);
	}

}
