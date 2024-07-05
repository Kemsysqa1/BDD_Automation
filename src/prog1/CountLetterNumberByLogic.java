package prog1;

public class CountLetterNumberByLogic {

	public static void main(String[] args) {
		withCharacterClass();
	}

	public static void withCharacterClass() {

		String str = "ab@123 3998Bsdfaskldjf";
		int numbers = 0;
		int capitalChar = 0;
		int smallChar = 0;
		int specialChar = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				numbers++;
			} else if (Character.isUpperCase(str.charAt(i))) {
				capitalChar++;
			} else if (Character.isLowerCase(str.charAt(i))) {
				smallChar++;
			} else {
				specialChar++;
			}
		}

		System.out.println("Numbers Count: " + numbers);
		System.out.println("Capital Char Count: " + capitalChar);
		System.out.println("Small Char Count: " + smallChar);

	}

	public static void withLogic() {

		String str = "ab@123 3998Bsdfaskldjf";
		int numbers = 0;
		int capitalChar = 0;
		int smallChar = 0;
		int specialChar = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				numbers++;
			} else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				capitalChar++;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				smallChar++;
			} else {
				specialChar++;
			}
		}

		System.out.println("Numbers Count: " + numbers);
		System.out.println("Capital Char Count: " + capitalChar);
		System.out.println("Small Char Count: " + smallChar);

	}

}
