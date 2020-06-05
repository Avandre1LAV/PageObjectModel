package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Log4jDemo {

	public static void main(String[] args) {
		
	//Here we need to create logger instance so we need to pass class name 
	Logger logger = Logger.getLogger("Log4jDemo");
	//If you use xml file use below
//	DOMConfigurator.configure("Log4j.xml");
	
	//If you use properties file do below
	PropertyConfigurator.configure("Log4j.properties");
			
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\mc56370\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	logger.info("browser opend");
	
	Log4jPageModel RGPage = new Log4jPageModel(driver);
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://newtours.demoaut.com/");

	
	logger.info("Click on Register");
	RGPage.clickReg();
	
	logger.info("Entering contact information");
	RGPage.setFirstName("Azelena");
	RGPage.setLastName("Vandre");
	
	logger.info("Entering Phone Number");
	RGPage.setPhone("222331010");
	RGPage.setEmail("Lena@mailinator.com");
	RGPage.setAddress1("101 Main Street");
	RGPage.setAddress2("1010 Center St");
	RGPage.setCity("Dundee");
	RGPage.setState("Illinois");
	RGPage.setCountry("USA");
	RGPage.setUsername("mercury");
	RGPage.setPassword("mercury");
	RGPage.setConfirmpassword("mercury");
	RGPage.clickRegisterBtn();
	
	
	}

}

