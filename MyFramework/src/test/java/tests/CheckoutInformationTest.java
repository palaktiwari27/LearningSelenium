package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.CheckoutInformationPage;
import pages.HomePage;
import pages.LoginPage;

public class CheckoutInformationTest extends BaseTest{
	LoginPage loginpage;
	HomePage homepage;
	CartPage cartpage;
	CheckoutInformationPage checkoutpage;
	
	public void initialiseTestcase() {
		loginpage = new LoginPage(BaseTest.driver);
		homepage=new HomePage(BaseTest.driver);
		cartpage=new CartPage(BaseTest.driver);
		checkoutpage=new CheckoutInformationPage(BaseTest.driver);
		
		}
	
	@Test
	public void Checkoutdetails() throws InterruptedException
	{
		initialiseTestcase();
		loginpage.Login("standard_user", "secret_sauce");//uts verifying either we are on homepage pr not
		homepage.verifyProduct();
		homepage.Addtocart();
		cartpage.navigatetocart();
		cartpage.Verifyproductprice();
		checkoutpage.ClickcheckoutButton();
		checkoutpage.checkoutdetails("palak", "tiwari", "12345678");
		
	}
	

}
