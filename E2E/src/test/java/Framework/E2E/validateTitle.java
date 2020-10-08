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




public class validateTitle extends base  {
	
	public WebDriver driver;
	
	private static Logger log=LogManager.getLogger(validateTitle.class.getName());

	@BeforeTest
	public void driverOpen() throws IOException
	{
		
		driver=initializeDriver();
		log.info("Starting Chrome Driver");
		
	}	
	
	@Test()
	
	public void getTitle() throws IOException
	{
		
		driver.get(prop.getProperty("URL"));
		log.info("Got the academy URL");
		
		LoginPage LP=new LoginPage(driver);
		
		Assert.assertEquals(LP.getTitle().getText(),"FEATURED COURSES");
		
		log.debug(LP.getTitle().getText());
		
		Assert.assertEquals(LP.Navheader().getText(),"CONTACT");
		
		log.info(LP.Navheader().getText());
		
	
		
	}
	
	@AfterTest
	public void driverClose()
	{
		driver.close();
	}

}
