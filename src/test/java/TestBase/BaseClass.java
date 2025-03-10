package TestBase;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class BaseClass {

    public static WebDriver driver;
    public Logger logger;
    public Properties p;

    @BeforeClass(groups= {"Sanity","Regression","Master"})
    public void setup() {
        // Initialize Logger
        logger = LogManager.getLogger(this.getClass());

        // Load config.properties file
        try {
            FileReader file = new FileReader("src/test/resources/config.properties");
            p = new Properties();
            p.load(file);
            logger.info("Config properties loaded successfully.");
        } catch (IOException e) {
            logger.error("Failed to load config.properties: " + e.getMessage());
        }

        // Initialize Chrome WebDriver
        driver = new ChromeDriver();
        logger.info("Chrome browser launched.");

        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(p.getProperty("appURL", "https://tutorialsninja.com/demo/index.php?route=common/home"));
        driver.manage().window().maximize();
        logger.info("Browser launched and navigated to the site.");
    }

    @AfterClass(groups= {"Sanity","Regression","Master"})
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            logger.info("Browser closed.");
        }
    }

    public String randomString() {
        return RandomStringUtils.randomAlphabetic(5);
    }

    public String randomNumber() {
        return RandomStringUtils.randomNumeric(10);
    }

    public String randomAlphaNumeric() {
    	
    	String generatedstring = RandomStringUtils.randomAlphabetic(3);
    	String generatednumber = RandomStringUtils.randomNumeric(3);
        return (generatedstring+ "@" + generatednumber);
    }
    // screenshot
    
    
   public String captureScreen(String tname) throws IOException {
	    
	   String timeStamp = new SimpleDateFormat("yyyyMMddmmss").format(new Date());
	   
	   TakesScreenshot takesScreenshot = (TakesScreenshot)driver;
	   File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
	   
	   String targetFilePath=System.getProperty("user.dir")+ "\\screenshots\\"+ tname + "_" + timeStamp+ ".png" ;
	   File targetFile = new File(targetFilePath);
	   
	   sourceFile.renameTo(targetFile);
	   return targetFilePath;
	   
	   
   }
   
  
    
}
