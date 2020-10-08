import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {
	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions a=new Actions(driver);
		WebElement move=driver.findElement(By.id("twotabsearchtextbox"));
		a.moveToElement(move).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		a.moveToElement(driver.findElement(By.id("nav-link-accountList"))).click().build().perform();

}
}
