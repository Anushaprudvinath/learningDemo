import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arrayOfElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("vegetables");
		driver.findElement(By.cssSelector(".btn.btn-default.bb-search")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//body//div[@id='deck']//div//div[5]//label[1]//span[1]")).click();
		Thread.sleep(4000L);
		List<WebElement> veggies=driver.findElements(By.xpath("//div[@qa='product_name']//a"));	
		
		for(WebElement option:veggies)
		{
			if(option.getText().contains("Frozen - Mixed Vegetables"))
			{
				option.click();
				Thread.sleep(2000L);
				driver.findElement(By.xpath("//div//span[contains(text(),'ADD TO BASKET')]")).click();
				break;
			
			}
		}
		System.out.println("Pass");

	}

}
