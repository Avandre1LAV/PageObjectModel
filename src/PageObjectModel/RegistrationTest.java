package PageObjectModel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationTest {

		
	public static void main(String[] args) {
		
			
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mc56370\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		RegistrationPage2 RGPage = new RegistrationPage2(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://newtours.demoaut.com/");
		
		RGPage.clickReg();
		RGPage.setFirstName("Azelena");
		RGPage.setLastName("Vandre");
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
