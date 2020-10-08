import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class autoSuggestiveDropDowns3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com");

		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		//Traverse the webelement in to variable source
		WebElement Source=driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT"));
		Source.click();
		Source.sendKeys("HYD");
		
		WebElement destination=driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT"));
		destination.sendKeys("MAA");
		destination.sendKeys(Keys.ENTER);
	}
	

}
