import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendarUI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.goindigo.in/");
		
		//WebDriverWait w=new WebDriverWait (driver,5);
		
		//w.until(ExpectedConditions.visibilityOf(driver.findElement(By.className("close-cookie"))));
		
		driver.findElement(By.className("close-cookie")).click();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//div[@class='col-sm-5 col-5 padd-left']//input[@name='or-depart']")).click();
		
		int dateCount=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td[@data-handler='selectDay']")).size();

		System.out.println(dateCount);
		
		for(int i=0;i<dateCount;i++)
		{
			String exactDate=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td[@data-handler='selectDay']")).get(i).getText();
			System.out.println(exactDate);
			
			if(exactDate.equalsIgnoreCase("12"))
			{
				driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td[@data-handler='selectDay']")).get(i).click();
				break;
			}
		}
	}

}
