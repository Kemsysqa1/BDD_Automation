package programms;

import java.nio.file.Path;
import java.nio.file.Paths;

public class SystemProperty {

	public static void main(String[] args) {
		String fileName = "dataprovider.xlsx";
		// System.out.println(System.getProperty("user.dir") + "\\ExcelData" +
		// "\\".concat(fileName));

		Path path = Paths.get(System.getProperty("user.dir"), "ExcelData", fileName);

		System.out.println(path.toString());
	}

}
