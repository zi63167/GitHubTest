package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class testPageFactory {
	
	public testPageFactory(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath= "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement SignInButton;
	
	public WebElement getSignInButton() {
		return SignInButton;
	}

	public WebElement getUsername() {
		return Username;
	}

	public WebElement getPassword() {
		return Password;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	@FindBy (xpath= "//*[@id=\"email\"]")
	private WebElement Username;
	
	@FindBy (xpath= "//*[@id=\"passwd\"]")
	private WebElement Password;
	
	@FindBy (xpath= "//*[@id=\"SubmitLogin\"]/span")
	private WebElement Submit;


}
