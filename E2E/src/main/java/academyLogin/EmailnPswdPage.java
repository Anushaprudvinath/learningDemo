package academyLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmailnPswdPage {
	
	public WebDriver driver;
	
	public EmailnPswdPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_email")
	WebElement Email ;
	
	@FindBy(id="user_password")
	WebElement Pswd;
	
	
	@FindBy(xpath="//input[@name='commit']")
	WebElement Submit;
	
	public WebElement Email()
	{
		return Email;
	}
	public WebElement Pswd()
	{
		return Pswd;
	}
	public WebElement Submit()
	{
		return Submit;
	}
	
	
}
