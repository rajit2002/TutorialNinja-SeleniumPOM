package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	
	
	public void setEmail(String email) {
		txtEmailAddress.sendKeys("rajitgautam2002@gmail.com");
			
	}
	
public void setPassword(String pwd ) {
	txtPassword.sendKeys("rajit@4966");
	
	}

public void clickLogin() {
	btnLogin.click();
	
}

}
