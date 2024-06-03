package programms;

public class FindMissValue {

	public static void main(String[] args) {
		char[] charArr = { '1', '2', '3', '5' };
		char expectedChar = charArr[0];
		char missingChar = 0;
		
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] != expectedChar) {
				missingChar = expectedChar;
				break;
			}
			expectedChar++;
		}
		System.out.println("Missing Value Is: " + missingChar);
	}
}