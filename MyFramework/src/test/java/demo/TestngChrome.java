package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestngChrome {
	//WebDriver driver1=null; // placed it as a global, as we need to use it everywhere
	
	@BeforeSuite
	public void driversetup()
	{
		WebDriverManager.chromedriver().setup();
		 //driver1 =new ChromeDriver();
	}
	
	@Test //(priority = 4)
	public void d_googleTest() throws InterruptedException
	{
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://www.google.com/");		       		      
        driver1.manage().window().maximize();	
        Thread.sleep(3000);
        WebElement searchbar = driver1.findElement(By.name("q"));
    	searchbar.sendKeys("books");
    	Thread.sleep(3000);
    	searchbar.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	driver1.close();
	}
	
	@Test //(priority = 1)
	public void c_googleTest1() throws InterruptedException
	{
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://www.google.com/");		       		      
        driver1.manage().window().maximize();	
        Thread.sleep(3000);
        WebElement searchbar = driver1.findElement(By.name("q"));
    	searchbar.sendKeys("books");
    	Thread.sleep(3000);
    	searchbar.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	driver1.close();
	}
	
	@Test //(priority = 3)
	public void b_googleTest2() throws InterruptedException
	{
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://www.google.com/");		       		      
        driver1.manage().window().maximize();	
        Thread.sleep(3000);
        WebElement searchbar = driver1.findElement(By.name("q"));
    	searchbar.sendKeys("books");
    	Thread.sleep(3000);
    	searchbar.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	driver1.close();
	}
	
	@Test  //(priority = 2)
	public void a_googleTest3() throws InterruptedException
	{
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://www.google.com/");		       		      
        driver1.manage().window().maximize();	
        Thread.sleep(3000);
        WebElement searchbar = driver1.findElement(By.name("q"));
    	searchbar.sendKeys("books");
    	Thread.sleep(3000);
    	searchbar.sendKeys(Keys.ENTER);
    	Thread.sleep(3000);
    	driver1.close();
	}
	
	@AfterSuite
	public void teardown()
	{
		//driver1.quit();
        System.out.println("completed");
        
	}

}
