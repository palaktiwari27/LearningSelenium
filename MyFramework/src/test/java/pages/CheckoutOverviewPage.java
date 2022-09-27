package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutOverviewPage {
	WebDriver driver;
	public CheckoutOverviewPage(WebDriver driver)
	{
		this.driver = driver;

	}
	
	By Continue= By.id("continue");
	By checkoutoverview =By.className("title");
	By productnameselected = By.xpath("//a[@id='item_4_title_link']/div");
	By paymentinfotext = By.xpath("(//div[@class='summary_value_label'])[1]");
	By shipinfotext = By.xpath("(//div[@class='summary_value_label'])[2]");
	
	
	
	
	public void checkoutOverview() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(Continue).click();
		String ActualText=driver.findElement(checkoutoverview).getText();
		String ExpectedText= "CHECKOUT: OVERVIEW";
		assertTrue(ActualText.contains(ExpectedText));
		Thread.sleep(3000);
	}
	
	public void VerifyProductName(String productname) throws InterruptedException
	{
		Thread.sleep(3000);
		String ActualText=driver.findElement(productnameselected).getText();
		String ExpectedText= productname;
		assertTrue(ActualText.contains(ExpectedText));
		Thread.sleep(3000);
	}
	
	public void VerifyPaymentInfoandShipInfo() throws InterruptedException
	{
		Thread.sleep(3000);
		String ActualTextPaymentInfo=driver.findElement(paymentinfotext).getText();
		String ExpectedTextPaymentInfo= "SauceCard #31337";
		assertTrue(ActualTextPaymentInfo.contains(ExpectedTextPaymentInfo));
		Thread.sleep(3000);
		String ActualTextShipInfo=driver.findElement(shipinfotext).getText();
		String ExpectedTextShipInfo= "FREE PONY EXPRESS DELIVERY!";
		assertTrue(ActualTextShipInfo.contains(ExpectedTextShipInfo));
	}
	
	
	

}
