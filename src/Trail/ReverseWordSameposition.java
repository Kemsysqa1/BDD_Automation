package Trail;

public class ReverseWordSameposition {

	public static void main(String[] args) {
		String str = "Vinod Narwade";
		String[] strArr = str.split(" ");
		String rev = "";
		for (int i = 0; i < strArr.length; i++) {
			for (int j = strArr[i].length() - 1; j >= 0; j--) {
				rev += strArr[i].charAt(j);
			}
			rev += " ";
		}
		System.out.println(rev.trim());
	}
}