package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutInformationPage {
	WebDriver driver;
	public CheckoutInformationPage(WebDriver driver)
	{
		this.driver = driver;

	}
	
	By checkout =By.id("checkout");
	By checkoutdetails = By.className("title");
	By firstname= By.id("first-name");
	By lastName=By.id("last-name");
	By zip= By.id("postal-code");
	
	
	public void ClickcheckoutButton() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(checkout).click();
		String ActualText=driver.findElement(checkoutdetails).getText();
		String ExpectedText= "CHECKOUT: YOUR INFORMATION";
		assertTrue(ActualText.contains(ExpectedText));
		
		
	}
	
	public void checkoutdetails(String ftname, String ltname, String zp) throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(firstname).clear();
		driver.findElement(firstname).sendKeys(ftname);
		driver.findElement(lastName).clear();
		driver.findElement(lastName).sendKeys(ltname);
		driver.findElement(zip).clear();
		driver.findElement(zip).sendKeys(zp);
		Thread.sleep(2000);
			
	}

}
