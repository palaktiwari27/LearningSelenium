package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;

public class CartTest extends BaseTest{
	LoginPage loginpage;
	HomePage homepage;
	CartPage cartpage;
	
	public void initialiseTestcase() {
		loginpage = new LoginPage(BaseTest.driver);
		homepage=new HomePage(BaseTest.driver);
		cartpage=new CartPage(BaseTest.driver);
	
	}
	
	@Test
	public void verifycartproduct() throws InterruptedException
	{
		initialiseTestcase();
		loginpage.Login("standard_user", "secret_sauce");//uts verifying either we are on homepage pr not
		homepage.verifyProduct();
		homepage.Addtocart();
		cartpage.navigatetocart();
		cartpage.Verifyproductprice();
		
	}
	
	
	
	
	

}
