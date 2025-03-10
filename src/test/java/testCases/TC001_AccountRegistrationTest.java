package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import TestBase.BaseClass;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass {

    @Test(groups={"Regression","Master"})
    public void verify_account_registration() {
        logger.info("***** Starting TC001_AccountRegistrationTest *****");

        try {
            HomePage hp = new HomePage(driver);
            hp.clickMyAccount();
            logger.info("Clicked on 'My Account' Link");

            hp.clickRegister();
            logger.info("Clicked on 'Register' Link");

            AccountRegistrationPage regPage = new AccountRegistrationPage(driver);

            logger.info("Providing customer details...");
            
            regPage.setFirstName(randomString().toUpperCase());
            regPage.setLastName(randomString().toUpperCase());
            regPage.setEmail(randomString() + "@gmail.com");
            regPage.setTeliphone(randomNumber());

            String password = randomAlphaNumeric();
            
            regPage.setPassword(password);
            regPage.setConfirmPass(password);
            
            regPage.setpolicybtn();
            regPage.Countinuebtn();

            logger.info("Validating expected confirmation message...");
            
            String confmsg = regPage.getConfirmationMsg();

            Assert.assertEquals(confmsg, "Your Account Has Been Created!", "Account creation message mismatch.");
            logger.info("Account registration test passed successfully.");

        } catch (Exception e) {
            logger.error("Test Failed due to Exception: " + e.getMessage());
            logger.debug("Stack Trace: ", e);
            Assert.fail("Test case failed due to exception.");
        }

        logger.info("***** Finished TC001_AccountRegistrationTest *****");
    }
}
