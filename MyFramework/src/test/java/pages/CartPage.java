package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	WebDriver driver;
	public CartPage(WebDriver driver)
	{
		this.driver = driver;

	}
	
	By NavigateToCart = By.id("shopping_cart_container");
	By Cartpagetitle= By.className("title");
	By ProductPrice=By.xpath("//div[@class='inventory_item_price']");
			
	
	public void navigatetocart() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.findElement(NavigateToCart).click();
		Thread.sleep(3000);
		String ActualText =driver.findElement(Cartpagetitle).getText();
		String ExpectedText= "YOUR CART";
		assertTrue(ActualText.contains(ExpectedText));
		
}

	public void Verifyproductprice() throws InterruptedException
	{
		Thread.sleep(2000);
		String ActualText=driver.findElement(ProductPrice).getText();
		String ExpectedText= "29.99";
		assertTrue(ActualText.contains(ExpectedText));
		
		}
	
	

}
