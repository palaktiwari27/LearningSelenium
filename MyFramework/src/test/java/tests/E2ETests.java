package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.CheckoutCompletePage;
import pages.CheckoutOverviewPage;
import pages.CheckoutInformationPage;
import pages.HomePage;
import pages.LoginPage;

public class E2ETests extends BaseTest {
	LoginPage loginpage;
	HomePage homepage;
	CartPage cartpage;
	CheckoutInformationPage checkoutinformationpage;
	CheckoutOverviewPage checkoutoverviewpage;
	CheckoutCompletePage checkoutcompletepage;
	
	
	public void initialiseTestcase() {
		loginpage = new LoginPage(BaseTest.driver);
		homepage=new HomePage(BaseTest.driver);
		cartpage=new CartPage(BaseTest.driver);
		checkoutinformationpage=new CheckoutInformationPage(BaseTest.driver);
		checkoutoverviewpage= new CheckoutOverviewPage(BaseTest.driver);
		checkoutcompletepage = new CheckoutCompletePage(BaseTest.driver);
		
		}
	
	@Test
	public void TC_001() throws InterruptedException
	{
		initialiseTestcase();
		loginpage.Login("standard_user", "secret_sauce");
		homepage.verifyProduct();
		homepage.Addtocart();
		cartpage.navigatetocart();
		cartpage.Verifyproductprice();
		checkoutinformationpage.ClickcheckoutButton();
		checkoutinformationpage.checkoutdetails("palak", "tiwari", "12345678");
		checkoutoverviewpage.checkoutOverview();
		checkoutoverviewpage.VerifyProductName("Sauce Labs Backpack");
		checkoutoverviewpage.VerifyPaymentInfoandShipInfo();
		checkoutcompletepage.ClickFinish();
		checkoutcompletepage.VerifyOrderSuccesfull();
	}
}

