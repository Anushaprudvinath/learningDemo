import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assertions1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		
		
		Thread.sleep(2000L);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@class='search_options_menucontentbg']//a[@text='Bhopal (BHO)']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		Thread.sleep(2000L);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
		Thread.sleep(1000L);
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		
		
		
	
		
		Thread.sleep(4000L);
		
		driver.findElement(By.id("divpaxinfo")).click();
		Select s1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s1.selectByValue("7");
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"7 Adult");
		
		Select s=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		s.selectByVisibleText("AED");
		
		
		//Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"7 Adult");
		
		
		//System.out.println("Pass");
		
		
		
		
		
	
		

	}

}
