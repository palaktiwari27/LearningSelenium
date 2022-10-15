package StepDefination;

import org.openqa.selenium.WebDriver;
import Pages.LoginPage;
import base.baseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	WebDriver driver;
	LoginPage loginpage;
	
	public void initialize() throws InterruptedException
	{
		baseTest.testsetup();
		driver=baseTest.driver;
		loginpage=new LoginPage(driver);
	}
	
	@Given("open the login page url")
	public void openUrl() throws InterruptedException
	{
		initialize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(3000);
		}
	
	@When("Enter the username and password")
	public void enterCredentials() throws InterruptedException
	{
		
		loginpage.SendUsername("standard_user");
		loginpage.SendPassword("secret_sauce");
		
	}
	
	@And("Click on the login button")
	public void clickLoginButton() throws InterruptedException
	{
		loginpage.ClickLogin();
		Thread.sleep(5000);
		
	}
	
	@Then("user is navigated to homepage")
	public void verifyLogin() throws InterruptedException
	{
		System.out.print("Login successful");
		baseTest.testteardown();
	}
	
	@When("Enter the wusername and wpassword")
	public void unsuccessfullogin() throws InterruptedException
	{
		loginpage.SendUsername("ustandard_user");
		loginpage.SendPassword("usecret_sauce");
	}
	
	@When("Enter the {string} and {string}")
	public void parameterlogin(String user , String pass) throws InterruptedException
	{
		loginpage.SendUsername(user);
		loginpage.SendPassword(pass);		
	}
	

}
