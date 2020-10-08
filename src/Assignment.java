import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		
		Thread.sleep(1000L);
		//driver.switchTo().alert().dismiss();
		//System.out.println(driver.switchTo().alert().getText());
		
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
		System.out.println(driver.findElement(By.xpath("//input[@id='DepartDate']")).getText());
		
		Select s =new Select(driver.findElement(By.cssSelector("#Adults")));
		s.selectByValue("3");
		//System.out.println(driver.findElement(By.cssSelector("#Adults")).getText());
		Thread.sleep(2000L);
		
		Select s1=new Select(driver.findElement(By.id("Childrens")));
		s1.selectByIndex(1);
		System.out.println(driver.findElement(By.id("Childrens")));
		
		driver.findElement(By.xpath("//a[@id='MoreOptionsLink']")).click();
		Select s2=new Select(driver.findElement(By.id("Class")));
		s2.selectByVisibleText("Premium Economy");
		
		driver.findElement(By.id("AirlineAutocomplete")).sendKeys("in");
		driver.findElement(By.id("SearchBtn")).click();
		System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		
		
		
		
		System.out.println("Pass");
	}

}
