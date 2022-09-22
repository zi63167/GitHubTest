package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class config {
	
	public static String getConfig(String value) throws IOException {
		File file = new File("C:\\Users\\Zahidul Islam\\eclipse-workspace\\GitHubTest\\config.properties");
		FileInputStream fis = new FileInputStream(file);
		Properties p = new Properties();
		p.load(fis);
		return p.getProperty(value);
	}
	
	public static void main(String[] args) throws IOException {
		System.out.println(config.getConfig("URL"));
	}

}
