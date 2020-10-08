import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCart2 {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		String[] items= {"Almonds","Pista"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(2000L);
		driver.manage().window().maximize();
		addItems(driver,items);
		
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		//Thread.sleep(2000L);
		driver.findElement(By.xpath("//div//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//Adding Explicit wait
		WebDriverWait w=new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");

		
		
		
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		driver.findElement(By.cssSelector("span.promoInfo")).getText();
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		//driver.findElement(By.xpath("//div[@class='wrapperTwo']//select")).click();
		
		Select s= new Select(driver.findElement(By.xpath("//div[@class='wrapperTwo']//select")));
		s.selectByVisibleText("India");
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
		System.out.println(driver.findElement(By.cssSelector("span.errorAlert")).getText());
		driver.findElement(By.xpath("//input[@class='chkAgree']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Proceed')]")).click();
				
		
	}
	
	public static void addItems(WebDriver driver,String[] items) 
	{
		List<WebElement> veggies=driver.findElements(By.xpath("//div//h4[@class='product-name']"));	
		for(int i=0;i<veggies.size();i++)
		{
			String[] Name=veggies.get(i).getText().split("-");
			String formatName=Name[0].trim();
			
			
			List iR=Arrays.asList(items);
			
			if(iR.contains(formatName)) {
				
				for(int j=0;j<4;j++)
				{
				
				driver.findElements(By.xpath("//div[@class='stepper-input']//a[@class='increment']")).get(i).click();
				}
				driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
			}
			
			
			
		}
		

	}

}
