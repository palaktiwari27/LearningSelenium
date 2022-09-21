package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class bothdrivers {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//setting up property for chrome drive
				WebDriverManager.chromedriver().setup(); //It will automatically adjust to latest driver from maven dependency
				//Instantiate a chrome driver
		        WebDriver driver1 =new ChromeDriver();
		        //launch the website
		        driver1.get("https://www.google.com/");		       		      
		        driver1.manage().window().maximize();	
		        Thread.sleep(3000);
		        WebElement searchbar = driver1.findElement(By.name("q"));
		    	searchbar.sendKeys("books");
		    	Thread.sleep(3000);
		    	searchbar.sendKeys(Keys.ENTER);
		    	Thread.sleep(3000);
		        driver1.close();
		        System.out.println("completed");
		        

	}

}
