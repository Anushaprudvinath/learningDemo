package Framework.E2E;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import academyLogin.LoginPage;

public class ValidateH3Title extends base{
	
public WebDriver driver;
	
	private static Logger log=LogManager.getLogger(validateTitle.class.getName());

	@BeforeTest
	public void driverOpen() throws IOException
	{
		
		driver=initializeDriver();
		log.info("Starting Chrome Driver");
		driver.get(prop.getProperty("URL"));
		log.info("Got the academy URL");
	}	

	@Test
	
	public void h3Title() throws IOException
	{
		
		LoginPage Lp=new LoginPage(driver);
		
		Assert.assertEquals(Lp.H3title().getText(), "An Academy to learn Everything about Testing");
		log.info("Failure occured");
	}
	
	@AfterTest
	public void driverClose()
	{
		driver.close();
	}
	

}
