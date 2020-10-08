package Framework.E2E;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import academyLogin.EmailnPswdPage;
import academyLogin.ForgotPswd;
import academyLogin.LoginPage;

public class homeLogin extends base{
	
	public WebDriver driver;
	
	private static Logger log=LogManager.getLogger(homeLogin.class.getName());
	
	
	@BeforeTest
	public void driverOpen() throws IOException
	{
		
		driver=initializeDriver();
		
	}	
	
	
	
	@Test(dataProvider="getData")
	public void Page(String EmailId,String Password,String NameofUser) throws IOException
	{
		driver.get(prop.getProperty("URL"));
		LoginPage Lp=new LoginPage(driver);
		Lp.login().click();
		EmailnPswdPage Epp=new EmailnPswdPage(driver);
		Epp.Email().sendKeys(EmailId);
		Epp.Pswd().sendKeys(Password);
		log.info(NameofUser);
		Epp.Submit().click();
		log.info("Data Entered Successfully");
		//ForgotPswd fp=new ForgotPswd(driver);
		//fp.forgotpassword().click();

	}
	
	@DataProvider
	public Object[][] getData()
	{
		
		//Anusha..u r passing 2 values with 2 different username and passwords,soo object[2][2] indicates 2 different users with 3 values for each 
		Object[][] data=new Object[2][3];
		data[0][0]="anushareddy768652@gmail.com";
		data[0][1]="Anupuvi142020";
		data[0][2]="AnushaReddy";
		
		data[1][0]="prudvinathreddy6@gmail.com";
		data[1][1]="Anupuvi142020";
		data[1][2]="Prudvinath Reddy";
		
		return data;
		
		
	}
	
	@AfterTest
	public void driverClose()
	{
		driver.close();
	}
	
	
	
}
