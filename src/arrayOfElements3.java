import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arrayOfElements3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Creating an array List

		String[] items = {"Hara Bhara Veg Kebab"};

		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("vegetables");
		
		driver.findElement(By.cssSelector(".btn.btn-default.bb-search")).click();
		
		Thread.sleep(2000L);
		
		driver.findElement(By.xpath("//body//div[@id='deck']//div//div[5]//label[1]//span[1]")).click();
		Thread.sleep(4000L);
		//to get the size of the vegetables available in page under the same product name
		System.out.println(driver.findElements(By.xpath("//div[@qa='product_name']")).size());
		
		List<WebElement> veggies = driver.findElements(By.xpath("//div[@qa='product_name']//a"));

		for (int i = 0; i < veggies.size(); i++) {
			String Name = veggies.get(i).getText();
			
			// Creating an ArrayList
			List il = Arrays.asList(items);

			if (il.contains(Name)) {
				driver.findElement(By.cssSelector("div.col-sm-5.col-xs-5.pad-0")).click();
				
				//driver.findElement(By.xpath("//span[@class='arrow-marker']")).click();
			}
		}
		//System.out.println("Pass");
	}

}
