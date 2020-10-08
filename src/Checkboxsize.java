import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxsize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://semantic-ui.com/modules/checkbox.html");
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//a[contains(text(),'Examples')]")).click();
		//driver.findElement(By.xpath("(//div[@class='ui master checkbox'] )[1]//")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='item'] //div[@class='ui master checkbox'] //input[@type='checkbox']")).getSize());
		System.out.println("matched");
		
		

	}

}
