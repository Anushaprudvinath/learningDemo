import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class calendarUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.goindigo.in/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		List<WebElement> dates=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td[@data-handler='selectDay']"));
		
		
		driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td[@data-handler='selectDay']"));
		int dayCount=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td[@data-handler='selectDay']")).size();
		
		System.out.println(dayCount);
		
		for(int i=0;i<dayCount;i++)
		{
			String exactDate=driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td[@data-handler='selectDay']")).get(i).getText();
			System.out.println(exactDate);
			
			if(exactDate.equalsIgnoreCase("11"))
			{
				driver.findElements(By.xpath("//div[@class='ui-datepicker-group ui-datepicker-group-first']//td[@data-handler='selectDay']")).get(i).click();
			}
			
			
			
		}
			System.out.println("pass");	
	}
	

}
