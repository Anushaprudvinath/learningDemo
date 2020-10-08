import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nykaa2 {
	
	public void otp(){
		WebDriver driver=new ChromeDriver();
	
		driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div/div[2]/div/section/div/div/button")).click();
		
	}

	

	}


