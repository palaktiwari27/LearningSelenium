package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutCompletePage {
	WebDriver driver;
	public CheckoutCompletePage(WebDriver driver)
	{
		this.driver = driver;

	}
	
	By finishbutton = By.id("finish");
	By checkoutfinish =By.className("title");
	By orderplacementetxt = By.xpath("//div[@id='checkout_complete_container']/h2");
	
	
	
	
	public void ClickFinish() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(finishbutton).click();
		Thread.sleep(3000);
		String ActualText=driver.findElement(checkoutfinish).getText();
		String ExpectedText= "CHECKOUT: COMPLETE";
		assertTrue(ActualText.contains(ExpectedText));
		Thread.sleep(3000);
	}
	
	public void VerifyOrderSuccesfull() throws InterruptedException
	{
		Thread.sleep(3000);
		String ActualText=driver.findElement(orderplacementetxt).getText();
		String ExpectedText= "THANK YOU FOR YOUR ORDER";
		assertTrue(ActualText.contains(ExpectedText));
		Thread.sleep(3000);
	}
	
	

}
