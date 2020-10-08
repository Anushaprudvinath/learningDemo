import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class drivedatadynamically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.qaclickacademy.com/");
		
		WebElement header=driver.findElement(By.xpath("//div[@class='navbar navbar-default navbar-static-top']//div[@class='container']"));
		
		
		WebElement practicepage=header.findElement(By.xpath("//nav//ul//li[5]"));
		practicepage.click();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		String opt1=driver.findElement(By.xpath("//div[@id='checkbox-example']//fieldset//label[1]")).getText();
		
		String opt2=driver.findElement(By.xpath("//div[@id='checkbox-example']//fieldset//label[2]")).getText();
		
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByVisibleText(opt2);
		
		driver.findElement(By.id("name")).sendKeys(opt2);
		
		driver.findElement(By.id("alertbtn")).click();
		
		String alert=driver.switchTo().alert().getText();
		
		System.out.println(driver.switchTo().alert().getText());
		
		if(alert.contains(opt1)) 
		{
			System.out.println("message displayed");
			
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
		
		
		

	}

}
