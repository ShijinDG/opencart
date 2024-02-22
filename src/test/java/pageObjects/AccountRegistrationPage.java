package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountRegistrationPage extends BasePage {
		WebDriver driver;

public  AccountRegistrationPage(WebDriver driver) {
		
	super(driver);
	
}
	@findBy(xpath="//input[@id='input-firstname']")
	WebElement txtFirstName;
	@findBy(xpath="//input[@id='input-lastname']")
	WebElement txtLastName;
	@findBy(xpath="//input[@id='input-email']")
	WebElement txtEmail;
	@findBy(xpath="//input[@id='input-telephone']")
	WebElement txtTelephone;
	@findBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	@findBy(xpath="//input[@id='input-confirm']")
	WebElement txtConfirmPassword;
	@findBy(xpath="//input[@name='agree']")
	WebElement chkdPolicy;
	@findBy(xpath="//input[@value='Continue']")
	WebElement btnContinue;
	@findBy(xpath= "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConformation;
	
	
	public void setFirstname(String fname) {
		txtFirstName.sendKeys(fname);
	}
	
	public void setLastname(String lname) {
		txtLastName.sendKeys(lname);
	}
	
	public void setEmail(String Email) {
		txtEmail.sendKeys(Email);
		
	}
	
	
	public void setTelephone(String tel) {
		txtTelephone.sendKeys(tel);

	}
	
	public void setpassword(String Password) {
		txtPassword.sendKeys(Password);
	}
	public void setCnfrmpassword(String CnfrmPassword) {
		txtConfirmPassword.sendKeys(CnfrmPassword);
	}
	
	public void setprivacypolicy() {
		chkdPolicy.click();
	}	
	public void setclickContinue() {
		btnContinue.click();
	}
	
	public String GetConfirmationMsg() {
		try {
			return(msgConformation.getText());
		}
		catch(Exception e){
			return(e.getMessage());
		}
	}
	
}
















