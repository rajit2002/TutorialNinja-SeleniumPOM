package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	
	public AccountRegistrationPage(WebDriver driver) {
		
		super (driver);
	}
	
	
	
	@FindBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstName;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	WebElement txtlastName;
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	WebElement txtTeliphone;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	
	
	@FindBy(xpath="//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement chkPolicy;

	@FindBy(xpath="//input[@value='Continue']")
	WebElement continuebtn;
	
	@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement confirmMsg;

//	======action======
	
	public void setFirstName(String fname) {
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastName(String Lname) {
		txtlastName.sendKeys(Lname);
	}

	
	public void setEmail(String email) {
		txtEmail.sendKeys(email);
	}

	
	public void setTeliphone(String Teliphone) {
		txtTeliphone.sendKeys(Teliphone);
	}

	public void setPassword(String Pwd) {
		txtPassword.sendKeys(Pwd);
	}

	public void setConfirmPass(String Pwd) {
		txtConfirmPassword.sendKeys(Pwd);
	}

	public void setpolicybtn() {
		chkPolicy.click();
		System.out.println("checkbox clicked");
		
	}
	
	public void Countinuebtn() {
		//solo1
		continuebtn.click();
		
		//solo2
	//	continuebtn.submit();
		
		//solo3 
	//	Actions act = new Actions(driver);
	// 	act.moveToElement(continuebtn).click().perform();
		
	}
	
	public String getConfirmationMsg() {
		
		try {
			return (confirmMsg.getText());
			
		}catch(Exception e) {
			return(e.getMessage());
		}
	
		
	}


}
