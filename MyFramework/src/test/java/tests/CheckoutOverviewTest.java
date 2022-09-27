package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.CheckoutOverviewPage;
import pages.CheckoutInformationPage;
import pages.HomePage;
import pages.LoginPage;

public class CheckoutOverviewTest extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	CartPage cartpage;
	CheckoutInformationPage checkoutinformationpage;
	CheckoutOverviewPage checkoutoverviewpage;
	
	public void initialiseTestcase() {
		loginpage = new LoginPage(BaseTest.driver);
		homepage=new HomePage(BaseTest.driver);
		cartpage=new CartPage(BaseTest.driver);
		checkoutinformationpage=new CheckoutInformationPage(BaseTest.driver);
		checkoutoverviewpage= new CheckoutOverviewPage(BaseTest.driver);
		
		}
	
	@Test
	public void VerifyCheckoutOverview() throws InterruptedException
	{
		initialiseTestcase();
		loginpage.Login("standard_user", "secret_sauce");//uts verifying either we are on homepage pr not
		homepage.verifyProduct();
		homepage.Addtocart();
		cartpage.navigatetocart();
		cartpage.Verifyproductprice();
		checkoutinformationpage.ClickcheckoutButton();
		checkoutinformationpage.checkoutdetails("palak", "tiwari", "12345678");
		checkoutoverviewpage.checkoutOverview();
	}
}

