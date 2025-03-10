package testCases;

import org.testng.Assert;

import org.testng.annotations.Test;

import TestBase.BaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;
import utilities.DataProviders;

//Data is valid - login success- test pass- logout
//Data is valid -- login failed-test fail
//data is invalid--login success-test fail - logout
//data is invalid-- login failed - test pass

public class TC003_LoginDDT  extends BaseClass{
	@Test(dataProvider="LoginData",dataProviderClass = DataProviders.class,groups="Datadriven")        //getting data provider from the different class
public void  verify_loginDDT( String email , String pwd, String exp ) {
		
        logger.info("**** Stating TC_003_loginDDT ***");
        
        
        try {
        		
		//HomePage 
          
		HomePage hp = new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		
		
		//Login 
		LoginPage lp= new LoginPage(driver);
		lp.setEmail(email);
		lp.setPassword(pwd);
		lp.clickLogin();
		
		
		
		//MyAcount
		MyAccountPage macc = new MyAccountPage(driver);
		boolean targetPage = macc.isMyAccountPageExists();
		
//		Data is valid - login success - test pass - logout
//		             login failed - test fail
		
//		Data is invalid - login success - test fail - logout
//		login failed  test pass
		
		
		if(exp.equalsIgnoreCase("Valid")) {
			
			if(targetPage==true) {
				macc.clicklogout();
				Assert.assertTrue(true);
				
			}
			
			else {
				
          		Assert.assertTrue(false);
			 }  
			
		
		}
		if(exp.equalsIgnoreCase("Valid"))
		{
			
			if(targetPage==true) {
				macc.clicklogout();
				Assert.assertTrue(true);
			}else {
				Assert.assertTrue(false);
			}
		}
		if(exp.equalsIgnoreCase("Invalid")) {
			
			if(targetPage==true) {
				macc.clicklogout();
				Assert.assertTrue(false);
			}
			else {
				Assert.assertTrue(true);
			}
		}
		
		
        } catch (Exception e) {
        	Assert.fail();
        }
				
				
		   logger.info("**** finished TC_003_loginDDT ***");		
				
				
				
				
				
	}
}
