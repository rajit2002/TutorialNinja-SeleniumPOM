package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{

	
	
		
		public HomePage(WebDriver driver) {
			super(driver);
		}
		
		@FindBy(xpath="//span[normalize-space()='My Account']")
		WebElement lnkMyaccount;
		
		@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
		WebElement lnkRigister;
		
		@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']")  //Login lik adde in steps
		WebElement lnkLogin;
		
		
		
		
		public void clickMyAccount() {
			lnkMyaccount.click();
		}
		
		
public void clickRegister() {
			
	 lnkRigister.click();

	
		}

public void clickLogin() {
	
	 lnkLogin.click();

	
		}




}
