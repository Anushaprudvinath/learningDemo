import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class arrayListSortingASC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//get the size of elements available in 2nd column of all rows
		System.out.println(driver.findElements(By.xpath("//tbody/tr/td[2]")).size());
		
		//Passing the column elements into List,to get the text of each and every element of the column.
		List<WebElement> columnList=driver.findElements(By.xpath("//tbody/tr/td[2]"));
		
		ArrayList<String> OriginalList=new ArrayList<String>();
		
		for(int i=0;i<columnList.size();i++)
		{
			OriginalList.add(columnList.get(i).getText());
		}
		Collections.sort(OriginalList);
		
		for(String s:OriginalList)
		{
			System.out.println(s);
		}
		
		System.out.println("*******DESCENDING ORDER******");
		
		Collections.reverse(OriginalList);
		
		for(String s1:OriginalList)
		{
			System.out.println(s1);
		}
		
		
		
		
		
		
		System.out.println("Pass");

	}

}
