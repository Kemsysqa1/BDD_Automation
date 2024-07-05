package programms;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertiesFile {
	public static void main(String[] args) throws Exception {
		String path = "D:\\QA Automation\\Git\\BDD_Automation\\src\\File\\Data";
		FileInputStream input = new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(input);

		System.out.println(prop.getProperty("Key"));
	}
}