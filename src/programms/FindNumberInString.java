package programms;

public class FindNumberInString {
	public static void main(String[] args) {
		String str = "Sap1ent";
		char[] charAray = str.toCharArray();
		StringBuffer strBuff = new StringBuffer();

		for (int i = 0; i < charAray.length; i++) {
			if ((charAray[i] >= '0') && (charAray[i] <= '9')) {

			} else {
				strBuff.append(charAray[i]);
			}
		}
		System.out.println(strBuff);

	}

}
