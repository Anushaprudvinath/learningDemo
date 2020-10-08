import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestiondropdowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		Thread.sleep(5000L);
		driver.findElement(By.id("SearchInputBox")).sendKeys("Lip");
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='react-autosuggest__suggestion'] div"));
		
		for(WebElement option :options)
		{
			if(option.getText().equalsIgnoreCase("Lipstick"))
			{
				option.click();

				break;
			}
		}
		System.out.println("Pass");

	}

}
