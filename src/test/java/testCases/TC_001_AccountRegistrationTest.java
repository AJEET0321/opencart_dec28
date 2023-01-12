package testCases;


import org.testng.Assert;
import org.testng.annotations.Test;



import PageObjects.AccountRegistrationPage;
import PageObjects.HomePage;
import testBase.BaseClass;

public class TC_001_AccountRegistrationTest extends  BaseClass
{  
  @Test
	public void test_account_Registration()
	{  
	  logger.debug("application logs...");
	  logger.info("***  Starting TC_001_AccountRegistrationTest ***");
	  try
		{
		HomePage hp=new HomePage(driver);
		hp.clkmyaccount();
		logger.info("Clicked on My account link");
		hp.clkregister();
		logger.info("Clicked on register link");
		
		AccountRegistrationPage repage=new AccountRegistrationPage(driver);
		
		logger.info("providing costomer data"); 
		repage.setFirstName(randomeString().toUpperCase());
		
		repage.setLastName(randomeString().toUpperCase());
		
		repage.setEmail(randomeString()+"@gmail.com");
		
		repage.setPassword(randomAlphaNumeric());
		
		repage.setPrivacyPolicy();
		
		repage.clickContinue();
		logger.info("clicked on continue..");
		
String confmsg=repage.getConfirmationMsg();

logger.info("validating expected message..");
		
		Assert.assertEquals(confmsg, "Your Account Has Been Created!","Test failed..");

		}
	  catch(Exception e)
		{
			logger.error("test failed");
			Assert.fail();
		}
		
	  logger.info("***  finished login test ***");

	}
}
