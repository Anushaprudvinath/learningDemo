package academyLogin;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[contains(text(),'Login')]")
	WebElement Login ;
	
	@FindBy(xpath=("//h2[contains(text(),'Featured Courses')]"))
	WebElement getTitle;
			
	@FindBy(xpath="//ul[@class='nav navbar-nav navbar-right']/li[8]")
	WebElement Navheader;
		
	
	@FindBy(xpath="//h3[contains(text(),'An Academy to learn Everything about Testing')]")
	WebElement H3title;
	
	
	public WebElement login()
	{
		return Login;
	}
	
	public WebElement getTitle() 
	{
		return getTitle;
	}
	
	public WebElement Navheader()
	{
		return Navheader;
	}
	public WebElement H3title()
	{
		return H3title ;
	}
	
	


}
