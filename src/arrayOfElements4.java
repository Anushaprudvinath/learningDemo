import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arrayOfElements4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		

		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("vegetables");
		
		driver.findElement(By.cssSelector(".btn.btn-default.bb-search")).click();
		Thread.sleep(4000L);
		driver.findElement(By.xpath("//body//div[@id='deck']//div//div[5]//label[1]//span[1]")).click();
		Thread.sleep(4000L);
		//to get the no.of vegetables
		System.out.println(driver.findElements(By.xpath("//div[@qa='product_name']")).size());
		
		List<WebElement> veggies = driver.findElements(By.xpath("//div[@qa='product_name']//a"));

		for (int i = 0; i < veggies.size(); i++) 
		{
			String Name = veggies.get(i).getText();
			
			if(Name.contains("Frozen - Green Peas Pouch"))
			{
				driver.findElement(By.xpath("//div//button[@qa='add']")).click();
			}

		}
		System.out.println("Pass");

	}

}
