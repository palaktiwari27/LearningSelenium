package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest extends BaseTest {

	LoginPage loginpage;// what and why

	public void initialiseTestcase() {
		loginpage = new LoginPage(BaseTest.driver);
	}

	// This test case verifies that the login username is locked
	@Test
	public void LockedUserTest() throws InterruptedException {
		initialiseTestcase(); // we can call within same class
		loginpage.SendUsername("locked_out_user");
		loginpage.SendPassword("secret_sauce");
		loginpage.ClickLogin();
		loginpage.VerifyLockedUser();
	}

	// test for incorrect username verification
	@Test
	public void IncorrectUsernameTest() throws InterruptedException {
		initialiseTestcase();
		loginpage.SendUsername("palak");
		loginpage.SendPassword("secret_sauce");
		loginpage.ClickLogin();
		loginpage.VerifyIncorrectUsername();
	}

	@Test
	public void CorrectUsernameTest() throws InterruptedException {
		initialiseTestcase();
		loginpage.SendUsername("standard_user");
		loginpage.SendPassword("secret_sauce");
		loginpage.ClickLogin();
		loginpage.VerifyCorrectCredentials();
	}

}
