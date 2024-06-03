package programms;

public class StringPalindrom {

	public static void main(String[] args) {
		String name = "TeT";
		String temp = name;
		String revStr = "";
		
		for (int i = name.length() - 1; i >= 0; i--) {
			char ch = name.charAt(i);
			revStr += ch;
		}
		if (temp.equals(revStr)) {
			System.out.println("Stirng is palindrome: " + revStr);
		} else {
			System.out.println("String is not palindrome: " + revStr);
		}
	}

}
