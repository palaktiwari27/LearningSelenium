package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) // Why constructor here?
	{
		this.driver = driver;

	}
	By productname= By.xpath("//a[@id='item_4_title_link']/div");
	By price =By.xpath("(//div[@class='pricebar']/div)[1]");
	By addtocart_Button=By.id("add-to-cart-sauce-labs-backpack");
	
	
	
	public void verifyProduct()
	{
	String ActualText= driver.findElement(productname).getText();
	String ExpectedText="Sauce Labs Backpack";
	assertTrue(ActualText.contains(ExpectedText));
	
	}
	
	public void Addtocart() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(addtocart_Button).click();
		
	}


}
