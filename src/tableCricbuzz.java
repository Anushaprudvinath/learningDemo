import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableCricbuzz {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.cricbuzz.com/cricket-match/live-scores/recent-matches");
		
		WebElement header=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-rank-tabs']/div[1]/div[1]"));
		//System.out.println(header.findElements(By.tagName("a")).size());
		header.findElement(By.xpath("//nav/a[text()='Scorecard']")).click();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		int memCount=driver.findElements(By.xpath("//div[@id='innings_1']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
		
		
		System.out.println(memCount);
		
		int runCount= driver.findElements(By.xpath("//div[@id='innings_1']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).size();
		
		System.out.println(runCount);
		
		for( int i=0;i<runCount-2;i++)
		{
			String value=driver.findElements(By.xpath("//div[@id='innings_1']/div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']/div[@class='cb-col cb-col-100 cb-scrd-itms']/div[3]")).get(i).getText();
			int value1= Integer.parseInt(value);
			 sum=sum+value1;
			}
		
		System.out.println(sum);
		
		String extras=driver.findElement(By.xpath("//div[@id='innings_1']//div[contains(text(),'Extras')]/following-sibling::div[1]")).getText();
		int extraValue=Integer.parseInt(extras);
		int totalScore=sum+extraValue;
		System.out.println(totalScore);
		//System.out.println(driver.findElement(By.xpath("//div[@id='innings_1']//div[contains(text(),'Total')]/following-sibling::div[1]")).getText());
		
		
		System.out.println("U did It!!!");
	}

}
