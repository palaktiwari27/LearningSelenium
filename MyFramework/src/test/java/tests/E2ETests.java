package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import Utilities.PropertyReadWrite;
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
	PropertyReadWrite propertyrw;
	
	
	public void initialiseTestcase() throws IOException {
		String datasheet_path=System.getProperty("user.dir")+"\\src\\test\\resources\\testdata\\datasheet.properties";
		loginpage = new LoginPage(BaseTest.driver);
		homepage=new HomePage(BaseTest.driver);
		cartpage=new CartPage(BaseTest.driver);
		checkoutinformationpage=new CheckoutInformationPage(BaseTest.driver);
		checkoutoverviewpage= new CheckoutOverviewPage(BaseTest.driver);
		checkoutcompletepage = new CheckoutCompletePage(BaseTest.driver);
		propertyrw = new PropertyReadWrite(datasheet_path);
		}
	
	@Test
	public void TC_001() throws InterruptedException, IOException
	{
		initialiseTestcase();
		loginpage.Login(propertyrw.getdata("username"), propertyrw.getdata("password"));
		homepage.verifyProduct();
		homepage.Addtocart();
		cartpage.navigatetocart();
		cartpage.Verifyproductprice();
		checkoutinformationpage.ClickcheckoutButton();
		checkoutinformationpage.checkoutdetails(propertyrw.getdata("firstname"),propertyrw.getdata("lastname"),propertyrw.getdata("zip"));
		checkoutoverviewpage.checkoutOverview();
		checkoutoverviewpage.VerifyProductName(propertyrw.getdata("productname"));
		checkoutoverviewpage.VerifyPaymentInfoandShipInfo();
		checkoutcompletepage.ClickFinish();
		checkoutcompletepage.VerifyOrderSuccesfull();
	}
}

