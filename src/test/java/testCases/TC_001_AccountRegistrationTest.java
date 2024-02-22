package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends BaseClass{
	
	@Test(groups= {"sanity","master"})
	public void verify_account_registration()
	{
		logger.info("**** starting TC_001_AccountRegistrationTest  *****");
		
		logger.debug("application logs started......");
		
		try
		{
		HomePage hp=new HomePage(driver);
		hp.clickMyAccount();
		logger.info("Clicked on MyAccount link");
		
		hp.clickRegister();
		logger.info("Clicked on registration link");
		
		
		logger.info("Entering customer details.. ");
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setFirstname(randomeString().toUpperCase());
		regpage.setFirstname(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");// randomly generated the email
		regpage.setTelephone(randomeNumber());
		
		String password=randomAlphaNumeric();
		
		regpage.setCnfrmpassword(password);
		regpage.setCnfrmpassword(password);
		
		regpage.setprivacypolicy();
		regpage.setclickContinue();
		logger.info("clicked on continue..");
		
		String confmsg=regpage.GetConfirmationMsg();
		
		logger.info("Validating expected message..");
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!","Account creation failed");		
				
		}
		catch(Exception e)
		{
			logger.error("test failed..");
			logger.debug("debug logs....");
			Assert.fail();
		}
		
		logger.debug("application logs end.......");
		logger.info("**** finished TC_001_AccountRegistrationTest  *****");
		
	}
	
	
	
	
}








