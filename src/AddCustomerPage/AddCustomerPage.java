package AddCustomerPage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class AddCustomerPage {
	 WebDriver driver;
		By txtEmail=By.name("Email");
		By txtPassword=By.name("Password");
		By btnLogin=By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/input");
		By lnkCustomer=By.xpath("/html/body/div[3]/div[2]/div/ul/li[4]/a/span");
		By lstCustomer=By.xpath("/html/body/div[3]/div[2]/div/ul/li[4]/ul/li[1]/a/span");
		By btnAddNewCustomer=By.xpath("/html/body/div[3]/div[3]/div/form[1]/div[1]/div/a");
		By txtFirstName=By.name("FirstName");
		By txtLastName=By.name("LastName");
		By rdGender=By.name("Gender");
		By dtBODy=By.name("DateOfBirth");
		By txtComapnyName=By.name("Company");
		By ckIsTaxExempt=By.name("IsTaxExempt");
		By chooseNewsLetter=By.xpath("//*[@id=\"customer-info\"]/div[2]/div[1]/div[9]/div[2]/div/div[1]/div");
		
		By chooseCustomerRole=By.xpath("//div[10]//div[2]//div[1]//div[1]//div[1]");
		By lstitemAdministrator=By.xpath("//li[contains(text(),'Administrators')]");
		By lstitemRegistered=By.xpath("//li[contains(text(),'Registered')]");
		By lstitemGuests=By.xpath("//li[contains(text(),'Guests')]");
		By lstitemVendor=By.xpath("//li[contains(text(),'Vendors')]");
		By lstitemForumModerator=By.xpath("//li[contains(text(),'Forum Moderators')]");
		By lstiemPremiumMembership=By.xpath("//li[contains(text(),'With premium membership')]");
		
		
		
		By chooseManagerOfVendor=By.name("VendorId");
		By txtAdminComment=By.name("AdminComment");
		
		By lnkLogout=By.linkText("Logout");
		
		AddCustomerPage(WebDriver d) {
			driver=d;
		}	
		public void setUserName(String uname) {
			driver.findElement(txtEmail).clear();
			driver.findElement(txtEmail).sendKeys(uname);
			}
		
		public void setPassword(String pwd) {
			driver.findElement(txtPassword).clear();
			driver.findElement(txtPassword).sendKeys(pwd);

			}
		public void clickLogin() {
			driver.findElement(btnLogin).click();
		}
		
		public void clickCustomerLink() {
			driver.findElement(lnkCustomer).click();
		}
		public void clickCustomerList() {
			driver.findElement(lstCustomer).click();
		}
		public void clickAddNewCustomer() {
			driver.findElement(btnAddNewCustomer).click();
		}
		public void setFirstName(String firstname) {
			driver.findElement(txtFirstName).sendKeys(firstname);
		}
		public void setLastName(String lastname) {
			driver.findElement(txtLastName).sendKeys(lastname);
		}
		public void chooseGender() {
			driver.findElement(rdGender).click();
		}
		public void setBirthOfDate(String bod) {
			driver.findElement(dtBODy).sendKeys(bod);
		}
		public void setCompanyName(String company) {
			driver.findElement(txtComapnyName).sendKeys(company);
		}
		public void checkIsTaxExempt() {
			driver.findElement(ckIsTaxExempt).click();
		}
		public void chooseNewsletter(String nletter) throws AWTException {
			driver.findElement(chooseNewsLetter).click();
			Robot robot = new Robot();
			if (nletter.equals("Your store name")) {
				robot.keyPress(KeyEvent.VK_DOWN);
				driver.findElement(chooseNewsLetter).click();
			} else {
				robot.keyPress(KeyEvent.VK_DOWN);
				robot.keyPress(KeyEvent.VK_DOWN);
			}
			
			
			
		}
		public void chooseCustomerRole(String role) throws InterruptedException {
			Select dropdown = new Select(driver.findElement(chooseCustomerRole));
			
			WebElement listItem = null;
			Thread.sleep(3000);
			
			if (role.equals("Administrator")) {
				listItem=driver.findElement(lstitemAdministrator);
				JavascriptExecutor js = (JavascriptExecutor)driver;
				js.executeScript("arguments[0].click();", listItem);
				
			}
			
//			else if (role.equals("Guests")) {
//				listItem=driver.findElement(lstitemGuests);
//				
//			}
//			else if (role.equals("Registered")) {
//				listItem=driver.findElement(lstitemRegistered);
//				
//			}
//			else if (role.equals("Vendors")) {
//				listItem=driver.findElement(lstitemVendor);
//				
//			}
//			else {
//				listItem=driver.findElement(lstitemForumModerator);
//			}
//			listItem.click();
//			JavascriptExecutor js = (JavascriptExecutor)driver;
//			js.executeScript("arguments[0].click();", listItem);
		}	
		
		
		public void chooseManagerOfVendor(String mov) {
			Select drpmov=new Select(driver.findElement(chooseManagerOfVendor));
			drpmov.selectByVisibleText(mov);
		}
		
		public void setAdminComment(String comment) {
			driver.findElement(txtAdminComment).sendKeys(comment);
		}
	
		public void clickLogout() {
			driver.findElement(lnkLogout).click();
		}
}



