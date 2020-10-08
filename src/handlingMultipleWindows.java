import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handlingMultipleWindows {

	public static <strings> void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/intl/en_in/gmail/about/");
		
		driver.findElement(By.xpath("//a[@class='h-c-button h-c-button--primary hero-carousel__cta hero-carousel__cta--reg']")).click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.id("firstName")).sendKeys("Supriya");
		driver.findElement(By.id("lastName")).sendKeys("Vaddemanu");
		driver.findElement(By.id("username")).sendKeys("supriya1234.vaddemanu");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("VAR@puv12020");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("VAR@puv12020");
		driver.findElement(By.id("accountDetailsNext")).click();
		
		/*Set<String>ids=driver.getWindowHandles();
		Iterator<String>iT=ids.iterator();
		String parentId=iT.next();
		String childID=iT.next();
		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		
		String childID1=iT.next();
		driver.switchTo().window(childID1);
		System.out.println(driver.getTitle());*/
		
		
		//driver.switchTo().window(parentId);
		//System.out.println(driver.getTitle());

	}

}
