package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	
	public static WebDriver driver= null;
	private String url="https://www.saucedemo.com/";
	
	@BeforeSuite
	public void init()
	{
		WebDriverManager.chromedriver().setup();		
	}
	
	@BeforeMethod
	public void initiliseTest()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	
	@AfterMethod
	public void CloseTest()
	{
		driver.quit();
	}
	
	@AfterSuite
    public void Teardown()
	{
		System.out.println(" TEST IS COMPLETE");
	}
	

	

}
