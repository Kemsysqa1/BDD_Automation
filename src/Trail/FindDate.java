package Trail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindDate {
	public static void main(String[] args) {
		String str = "lyuuuuuyu2022jhh2022-10-22ghghh";
		// output = 2022-10-22
		String regex = "\\d{4}-\\d{2}-\\d{2}";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str);

		if (matcher.find()) {
			System.out.println(matcher.group());
		} else {
			System.out.println("Not Found...!");
		}

	}
}