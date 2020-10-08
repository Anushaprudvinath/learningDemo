import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class autoSuggestiveDropdowns2 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		Actions a=new Actions(driver);
		Robot robot = new Robot();
		robot.mouseMove(170, 282);
		a.click().build().perform();
		
		//driver.findElement(By.cssSelector("div.modal.displayBlock.modalLogin.dynHeight.personal")).click();
		
		WebElement source=driver.findElement(By.id("fromCity"));
		source.click();
		source.sendKeys("HYD");
		
		
		driver.findElement(By.id("toCity"));
		driver.findElement(By.id("toCity")).click();
		driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open")).sendKeys("HYD");
		//driver.findElement(By.id("toCity")).sendKeys("hyd");
		System.out.println("pass");

	}

}
