package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	WebDriver driver;
	 public LoginPage(WebDriver driver) 
	 {
		 this.driver=driver;
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

			
	 

}
