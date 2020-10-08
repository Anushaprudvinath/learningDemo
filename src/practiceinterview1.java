import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practiceinterview1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String[] nestleItems= {"Multi Grain Dal Veg","Wheat Mixed Vegetable"};
		
		driver.get("https://www.bigbasket.com/ps/?q=vegetables#!page=1");
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//div[@id='deck']//div[4]//label[1]//span[1]")).click();
		addItems(driver,nestleItems);
	}
	
	
	public static void addItems(WebDriver driver,String[] nestleItems) throws InterruptedException {
		Thread.sleep(3000L);
		
		List <WebElement> nestle=driver.findElements(By.cssSelector("div.col-sm-12.col-xs-7.prod-name"));
		
		for(int i=0;i<nestle.size();i++) {
			String Product=nestle.get(i).getText();
			
			List nI=Arrays.asList(nestleItems);
			
			if(nI.contains(Product)) {
				
				
				
			}
			
			
		}
		
		
	}

}


