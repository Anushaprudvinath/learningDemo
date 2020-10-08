package Classes.ExtentReports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReports1 {
	
	ExtentReports extent;
	
	@BeforeTest
	public void config() 
	{
		String path=System.getProperty("user.dir")+"\\reports\\index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("ExtentAutomationResults");
		reporter.config().setDocumentTitle("ExtentTesting");
		
		extent= new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "AnushaReddy");
	}
	
	
	@Test
	public void demo1()
	{
		
		extent.createTest("ExtentReportDemo");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M LOK NATH REDDY\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.dafabet.com/in");
		System.out.println(driver.getTitle());
		extent.flush();
	}

}
