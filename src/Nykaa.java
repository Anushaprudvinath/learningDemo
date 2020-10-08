import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nykaa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com");
		driver.findElement(By.cssSelector("div.UserAccount")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input[type='email']")).click();
		driver.findElement(By.xpath("//input[@name='emailMobile']")).sendKeys("anushareddy768652@gmail.com");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[contains(text(),'send otp to email')]")).click();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		System.out.println("Pass");
		
		
		//driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div/div[2]/div/div/div[2]/div[3]/input")).click();
		//driver.findElement(By.cssSelector("input.input.text-center")).sendKeys("anushareddy768652@gmail.com");
		//driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div/div[2]/div/section/div/form/div[2]/button")).click();
		//driver.findElement(By.xpath("//button[@class='button big full small-button-seperator']")).click();
		
	
	}
	
}