package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@findBy(xpath="//input[@id='input-email']\"")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
	@findBy(xpath="//input[@value='Login']")
	WebElement btnLogin;
	
	public void setEmail(String Email) {
		txtEmailAddress.sendKeys(Email);
	}
	public void setpwd(String Pwd) {
		txtPassword.sendKeys(Pwd);
	}
	
	public void ClickLogin() {
		btnLogin.click();
	}

}