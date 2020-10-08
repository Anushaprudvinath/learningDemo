package academyLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPswd {
	
	public WebDriver driver;
	
	public ForgotPswd(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Forgot Password?')]")
	WebElement forgotpassword;
	
	public WebElement forgotpassword()
	{
		return forgotpassword;
	}
	

}
