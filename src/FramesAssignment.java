import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();
		
		System.out.println(driver.findElements(By.tagName("frameset")).size());
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//html//frameset")));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-top']")));
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-middle']")));
		
		System.out.println(driver.findElement(By.id("content")).getText());
		
		//Switch back from frame to the web page.
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@name='frame-bottom']")));
		
		System.out.println(driver.findElement(By.cssSelector("body")).getText());
		
		System.out.println("Pass");
		

	}

}
