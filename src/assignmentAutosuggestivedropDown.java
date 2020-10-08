import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignmentAutosuggestivedropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/");
		driver.manage().window().maximize();
		WebElement header=driver.findElement(By.xpath("//div//nav[@class='navbar-collapse collapse']"));
		WebElement practice=header.findElement(By.xpath("//ul/li[5]"));
		practice.click();
		
		WebElement selectCountries=driver.findElement(By.id("autocomplete"));
		selectCountries.sendKeys("ind");
		int i=0;

		while(i<3)

		{

			selectCountries.sendKeys(Keys.ARROW_DOWN);

		i++;

		}
		
		
		System.out.println(selectCountries.getAttribute("value"));
		
		
		
	}

}
