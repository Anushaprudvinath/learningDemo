import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchild {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		Thread.sleep(10000L);
		driver.findElement(By.xpath("//div[@class='ig-input-group field-float']//input[@placeholder='From']")).click();
		Thread.sleep(3000L);
		driver.findElement(By.xpath("//div[@class='ig-input-group field-float']//div[@class='autocomplete-results autocomplete-main station-results'] //div[@data-iata='BOM']")).click();
		

	}

}
