import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javaExecutorDOM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.apsrtconline.in/");
		
		driver.manage().window().maximize();
		
		WebElement source=driver.findElement(By.id("fromPlaceName"));
		source.sendKeys("kurn");
		source.sendKeys(Keys.DOWN);
		source.sendKeys(Keys.ENTER);
		System.out.println(source.getText());
		int i=-0;
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		String getText=(String) js.executeScript(script);
		//System.out.println(getText);
		
		while(!getText.equalsIgnoreCase("VEKURNOOL"))
		{
			i++;
			source.sendKeys(Keys.DOWN);
			getText=(String) js.executeScript(script);
			System.out.println(getText);
			
			if(i>3)
			{
				break;
			}
			
			
		}
		
		
		
	}

}
