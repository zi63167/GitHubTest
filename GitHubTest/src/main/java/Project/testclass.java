package Project;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.config;
import Utilities.testPageFactory;

public class testclass {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Zahidul Islam\\eclipse-workspace\\GitHubTest\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		testPageFactory pf = new testPageFactory(driver);
		driver.manage().window().maximize();
		driver.get(config.getConfig("URL"));
		pf.getSignInButton().click();
		pf.getUsername().sendKeys(config.getConfig("Username"));
		pf.getPassword().sendKeys(config.getConfig("Password"));
		pf.getSubmit().click();
		driver.close();
		
	}

}
