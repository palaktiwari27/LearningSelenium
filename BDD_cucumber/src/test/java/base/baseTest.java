package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseTest {
	public static WebDriver driver;
	
	public static void testsetup() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	
	public static void testteardown() throws InterruptedException
	{
		driver.quit();
		Thread.sleep(3000);
	}

}
