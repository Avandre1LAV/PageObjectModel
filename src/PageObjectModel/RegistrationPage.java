package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
	WebDriver driver;
	By RegLink=By.linkText("REGISTER");
	By FirstName=By.name("firstName");
	By LastName=By.name("lastName");
	By phone=By.name("phone");
	By email=By.name("userName");
	By address1=By.name("address1");
	By address2= By.name("address2");
	By city=By.name("city");
	By state=By.name("state");
	By postalCode=By.name("postalCode");
	By country=By.name("country");
	By username=By.name("email");
	By password=By.name("password");
	By confirmpassword=By.name("confirmPassword");
	By registerBtn=By.name("register");
	
	RegistrationPage(WebDriver d) {
		driver=d;
	}
	
	public void clickReg()  {
		driver.findElement(RegLink).click();
	}
	public void setFirstName(String fname) {
		driver.findElement(FirstName).sendKeys(fname);
	}

	public void setLastName(String lname) {
		driver.findElement(LastName).sendKeys(lname);
	}
	public void setPhone(String ph) {
		driver.findElement(phone).sendKeys(ph);
	}

	public void setEmail(String emailAddr) {
		driver.findElement(email).sendKeys(emailAddr);
	}
	public void setAddress1(String addr1) {
		driver.findElement(address1).sendKeys(addr1);
	}

	public void setAddress2(String addr2) {
		driver.findElement(address2).sendKeys(addr2);
	}
	public void setCity(String cty) {
		driver.findElement(city).sendKeys(cty);
	}

	public void setState(String st) {
		driver.findElement(state).sendKeys(st);
	}

	public void setPostalCode(String zipcode) {
		driver.findElement(postalCode).sendKeys(zipcode);
	}

	public void setCountry(String cntry) {
		driver.findElement(country).sendKeys(cntry);
	}
	
	public void setUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}

	public void setPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}

	public void setConfirmpassword(String cpassword) {
		driver.findElement(confirmpassword).sendKeys(cpassword);
	}

	public void clickRegisterBtn() {
		driver.findElement(registerBtn).click();
	}

	
}
