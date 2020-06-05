package AddCustomerPage;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class AddCustomerTest {

	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mc56370\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		AddCustomerPage ACPage = new AddCustomerPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		ACPage.setUserName("admin@yourstore.com");
		ACPage.setPassword("admin");
		ACPage.clickLogin();
		ACPage.clickCustomerLink();
		ACPage.clickCustomerList();
		ACPage.clickAddNewCustomer();
		ACPage.setUserName("admin1@yourstore.com");
		ACPage.setPassword("admin123");
		ACPage.setFirstName("Azelena");
		ACPage.setLastName("Vandre");
		ACPage.chooseGender();
		ACPage.setBirthOfDate("5/12/1978");
		ACPage.setCompanyName("No Company Name");
		ACPage.checkIsTaxExempt();
//		ACPage.chooseNewsletter("Your store name");
		ACPage.chooseCustomerRole("Administrators");
//		ACPage.chooseManagerOfVendor("Vendor 1");
		ACPage.setAdminComment("No comment");

	}

}
