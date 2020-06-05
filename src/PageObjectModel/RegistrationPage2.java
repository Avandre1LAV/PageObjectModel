package PageObjectModel;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage2 {
	WebDriver driver;
	
	@FindBy(how = How.LINK_TEXT, using = "REGISTER")  //Annotation
	WebElement RegLink;
	
	@FindBy(how = How.NAME, using = "firstName")  //Syntax 1
	WebElement FirstName;
	
	//@FindBy(how = name = "firstName")  //Syntax 2
	//WebElement FirstName;
	
	@FindBy(name = "lastName")
	WebElement LastName;
	
	@FindBy(name = "phone")
	WebElement phone;
	
	@FindBy(name = "userName")
	WebElement email;
	
	@FindBy(name = "address1")
	WebElement address1;
	
	@FindBy(name = "address2")
	WebElement address2;
	
	@FindBy(name = "city")
	WebElement city;
	
	@FindBy(name = "state")
	WebElement state;
	
	@FindBy(name = "postalCode")
	WebElement postalCode;
	
	@FindBy(name = "country")
	WebElement country;
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "confirmPassword")
	WebElement confirmpassword;
	
	@FindBy(name = "register")
	WebElement registerBtn;
	
	RegistrationPage2(WebDriver d) {
		driver = d;
		PageFactory.initElements(d, this); //additional method to initiate driver
	}
	public void clickReg()  {
		(RegLink).click();
	}
	public void setFirstName(String fname) {
		FirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		LastName.sendKeys(lname);
	}
	public void setPhone(String ph) {
		phone.sendKeys(ph);
	}

	public void setEmail(String emailAddr) {
		email.sendKeys(emailAddr);
	}
	public void setAddress1(String addr1) {
		address1.sendKeys(addr1);
	}

	public void setAddress2(String addr2) {
		address2.sendKeys(addr2);
	}
	public void setCity(String cty) {
		city.sendKeys(cty);
	}

	public void setState(String st) {
		state.sendKeys(st);
	}

	public void setPostalCode(String zipcode) {
		postalCode.sendKeys(zipcode);
	}

	public void setCountry(String cntry) {
		country.sendKeys(cntry);
	}
	
	public void setUsername(String uname) {
		username.sendKeys(uname);
	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);
	}

	public void setConfirmpassword(String cpassword) {
		confirmpassword.sendKeys(cpassword);
	}

	public void clickRegisterBtn() {
		registerBtn.click();
	}

}
