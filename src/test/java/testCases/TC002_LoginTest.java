package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
//import org.testng.annotations.Parameters;
import TestBase.BaseClass;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC002_LoginTest extends BaseClass {

    @Test(groups={"Sanity","Master"})
    public void verify_login() {
        logger.info("***** Starting Tc_002_LoginTest *****");

        try {
            // Home page
            HomePage hp = new HomePage(driver);
            hp.clickMyAccount(); // Clicking only once
            hp.clickLogin();

            // Login Page
            LoginPage lp = new LoginPage(driver);
            lp.setEmail(p.getProperty("email"));
            lp.setPassword(p.getProperty("password"));
            lp.clickLogin();

            // My Account Page
            MyAccountPage macc = new MyAccountPage(driver);
            boolean targetPage = macc.isMyAccountPageExists();
            Assert.assertTrue(targetPage, "Login failed");

        } catch (Exception e) {
            logger.error("Test failed due to exception: " + e.getMessage());
            Assert.fail(e.getMessage());
        }

        logger.info("***** Finished Tc_002_LoginTest *****");
    }
}
