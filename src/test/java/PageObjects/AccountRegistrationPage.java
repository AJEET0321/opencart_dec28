package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage
{
  public AccountRegistrationPage (WebDriver driver)
  {
	  super(driver);
  }
  
  //Elements
  @FindBy(xpath="//input[@id='input-firstname']")WebElement firstname;
  @FindBy(xpath="//input[@id='input-lastname']")WebElement lastname;
  @FindBy(xpath="//input[@id='input-email']")WebElement email;
  @FindBy(xpath="//input[@id='input-password']")WebElement password;
  @FindBy(xpath="//input[@name='agree']")WebElement policy;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement btnContinue;
  @FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']")
	WebElement msgConfirmation;

  
  //Action method
  public void setFirstName(String fname) {
		firstname.sendKeys(fname);

	}
  public void setLastName(String lname) {
		lastname.sendKeys(lname);

	}
  public void setEmail(String mail) {
		email.sendKeys(mail);

	}

	public void setPassword(String pwd) {
		password.sendKeys(pwd);

	}
	public void setPrivacyPolicy() {
		policy.click();

	}
	public void clickContinue() {
		//sol1 
		 btnContinue.click();
	}
    
	
	public String getConfirmationMsg() {
		try {
			return (msgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());

		}

	}
  
  
}
