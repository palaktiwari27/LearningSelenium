package pages;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) // Why constructor here?
	{
		this.driver = driver;

	}

	By Username = By.id("user-name");
	By Password = By.id("password");
	By LoginButton = By.id("login-button");
	By LoginText = By.xpath("//h3[@data-test='error']");
	By Home = By.className("title");

	public void SendUsername(String username) {
		driver.findElement(Username).clear();
		driver.findElement(Username).sendKeys(username);
	}

	public void SendPassword(String password) {
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(password);
	}

	public void ClickLogin() {
		driver.findElement(LoginButton).click();
	}

	public void VerifyLockedUser() throws InterruptedException {
		Thread.sleep(3000);
		String ExpectedText = "Sorry, this user has been locked out";
		String Actualtext = driver.findElement(LoginText).getText();
		assertTrue(Actualtext.contains(ExpectedText));

	}

	public void VerifyIncorrectUsername() throws InterruptedException {
		Thread.sleep(3000);
		String ExpectedText = "Epic sadface: Username and password do not match any user in this service";
		String Actualtext = driver.findElement(LoginText).getText();
		assertTrue(Actualtext.contains(ExpectedText));
	}

	public void VerifyCorrectCredentials() throws InterruptedException {
		Thread.sleep(3000);
		String ExpectedText = "PRODUCTSss";
		String ActualText = driver.findElement(Home).getText();
		assertTrue(ActualText.contains(ExpectedText));
	}

}
