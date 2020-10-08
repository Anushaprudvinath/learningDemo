import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.qaclickacademy.com/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement header=driver.findElement(By.xpath("//div[@class='navbar navbar-default navbar-static-top']//div[@class='container']"));
		WebElement practicepage=header.findElement(By.xpath("//nav//ul//li[5]"));
		practicepage.click();
		
		WebElement table=driver.findElement(By.cssSelector("table[id='product']"));
		int rowCount=table.findElements(By.cssSelector(" tbody tr")).size();
		System.out.println(rowCount);
		
		int columnCount=table.findElements(By.cssSelector(" td")).size();
		System.out.println(columnCount);
		
		for(int i=1;i<rowCount;i++)
		{
			String secondRowText=table.findElements(By.cssSelector(" tbody tr")).get(2).getText();
			System.out.println(secondRowText);
			break;
		}
		


	}

}
