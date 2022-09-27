package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class HomeTest  extends BaseTest{
	LoginPage loginpage;
	HomePage homepage;

	public void initialiseTestcase() {
		loginpage = new LoginPage(BaseTest.driver);
		homepage=new HomePage(BaseTest.driver);
	}
	
@Test
public void verifyProduct() throws InterruptedException
{
	initialiseTestcase();
	loginpage.Login("standard_user", "secret_sauce");
	homepage.verifyProduct();
	}

@Test
public void addingProductTocart() throws InterruptedException
{
	initialiseTestcase();
	loginpage.Login("standard_user", "secret_sauce");
	homepage.verifyProduct();
	homepage.Addtocart();
	}


	

}
