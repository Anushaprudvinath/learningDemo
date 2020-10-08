import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ImplicitWaits {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// Creating an array List

		String[] items = {"Cerelac - Multi Grain Dal Veg (Stage 4)","Cerelac - Wheat Mixed Vegetable (Stage 3)"};

		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='input']")).sendKeys("vegetables");
		Thread.sleep(2000L);

		driver.findElement(By.cssSelector(".btn.btn-default.bb-search")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//div[@id='deck']//div[4]//label[1]//span[1]//i[1]")).click();
		

		//Assert.assertFalse(driver.findElement(By.xpath("//div[@id='deck']//div[4]//label[1]//span[1]//i[1]")).isEnabled());
		Thread.sleep(5000L);
		System.out.println(driver.findElements(By.xpath("//div[@qa='product_name']//a")).size());
		ImplicitWaits im=new ImplicitWaits();
		im.addItems(driver,items);

	}

	public void addItems(WebDriver driver,String[] items) {
		
		List<WebElement> veggies = driver.findElements(By.xpath("//div[@qa='product_name']//a"));
		for (int i = 0; i < veggies.size(); i++) {
			String Name = veggies.get(i).getText();

			// Creating an ArrayList
			List il = Arrays.asList(items);
			
			if(il.contains(Name)) {
				driver.findElement(By.cssSelector("div.col-sm-5.col-xs-5.pad-0")).click();
				
				
			}

		}

	}

}
