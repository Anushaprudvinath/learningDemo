import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableAssignment2 {

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
		int rowCount=table.findElements(By.tagName("tr")).size();
		System.out.println(rowCount);
		
		//System.out.println(table.findElements(By.tagName("td")).size());
		
		List<WebElement> SecondRow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		
		System.out.println(SecondRow.get(0).getText());
		System.out.println(SecondRow.get(1).getText());
		System.out.println(SecondRow.get(2).getText());

	}

}
