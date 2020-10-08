import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class endToend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.qaclickacademy.com/");
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//find the count of links present in a particular section.
		//Also,limiting the scope of a web driver.
		
		//limiting the scope of header section to a webdriver,get the size of links available in header section
		WebElement header=driver.findElement(By.xpath("//div[@class='navbar navbar-default navbar-static-top']//div[@class='container']"));
		System.out.println(header.findElements(By.tagName("a")).size());
		
		//passing the practice link in to a webelement,click on the link and get the size of links available in practice page
		WebElement practicepage=header.findElement(By.xpath("//nav//ul//li[5]"));
		practicepage.click();
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//moving the footer section in to a webelement and get the size of links available
		WebElement footer=driver.findElement(By.xpath("//div[@id='gf-BIG']"));
		 System.out.println(footer.findElements(By.tagName("a")).size());
		
		 //moving the second section from footer to a webelement and get the size on links available
		WebElement SS=footer.findElement(By.xpath("//table//tbody//tr//td[1]//ul"));
		System.out.println(SS.findElements(By.tagName("a")).size());
		
		for(int i=1;i<SS.findElements(By.tagName("a")).size();i++)
		{
			String clickonTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			SS.findElements(By.tagName("a")).get(2).sendKeys(clickonTab);
			break;
		}
		 
		Set<String>mw=driver.getWindowHandles();
		
		 Iterator<String>it= mw.iterator();
		 
		 while(it.hasNext())
		 {
		
		 driver.switchTo().window(it.next());
		 
		System.out.println(driver.getTitle());
		
		 }
		
		
		
		
	
		
		
		
	
		
		
		
	
		
		
	
	}

}
