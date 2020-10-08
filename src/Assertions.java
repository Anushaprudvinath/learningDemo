import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assertions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com");
		Thread.sleep(2000L);
		//driver.findElement();
				//Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Flight Booking')]")).isEnabled());
		
		
		//Syetm.out.driver.findElement(By.xpath("//a[contains(text(),'Flight Booking')]")).isEnabled());
		
		
	
	}

}
