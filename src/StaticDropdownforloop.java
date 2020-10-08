import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropdownforloop {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		Thread.sleep(1000L);
		driver.findElement(By.xpath("//input[@placeholder='pax-class']")).click();
		Thread.sleep(10000L);
		for(int i=1;i<7;i++)
		{
		driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']//li[@class='adult-pax-list']//button[@class='pax-plus btn btn-info']")).click();
		}
		
		//Thread.sleep(1000L);
		
		for(int i=7;i>=5;i--)
		{
			driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']//button[@class='pax-minus btn btn-info']")).click();
			
		
		}
		
		System.out.println(driver.findElement(By.xpath("//div[@class='passenger-dropdown pax-selection-row']//button[@class='pax-minus btn btn-info']")).getText());
		
		

			
}
}
