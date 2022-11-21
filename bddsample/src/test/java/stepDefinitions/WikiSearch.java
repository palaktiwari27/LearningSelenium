package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.RestAssured;
import io.restassured.RestAssured.*;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.hamcrest.Matcher.*;


public class WikiSearch {
	WebDriver driver ;
		
	
	@Given("I have a wiki pedia homepage")
	public void i_have_a_wiki_pedia_homepage() throws InterruptedException {
		// Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Hi I am GIVEN"); 	
	}
	
	
	//@And("^have a keyword \"Earth\" to search$")
	  @And("have a keyword {string} to search")
	  public void andHaveAKeyword(String string1) throws InterruptedException {
		// setup
		System.out.println("Hi I am AND"); 
		
	  }

	  @When("I search")
	  public void whenSearched() {
		  System.out.println("Hi I am WHEN"); 
	  }

	  @Then("I should see the related outcomes")
	  public void shouldVeeerifyTheOutcome() throws Throwable {
		  System.out.println("Hi I am THEN"); 
		  // Rest Assured Setup
		  String res = RestAssured.get("https://wikipedia.org").getHeaders().toString();
		  System.out.println("API Reesponsee Header: " + res);
		  
	  }
	  
	  @And("validate the outcomes")
	  public void and() throws Throwable {
		// setup
		driver = new ChromeDriver();
		this.driver.get("https://google.com");
		Thread.sleep(100);
		// taking screnshots
		System.out.println("Taking screenshot now : >>>");
		// step-1: Converesion of driver to screenshot object to take the current driver screenshot
			TakesScreenshot t = ((TakesScreenshot)driver);
		
		// Step-2: Recieve the output as file
			File sc_file = t.getScreenshotAs(OutputType.FILE);
			// Lets create a new empty file at some location
			File img = new File("D:\\myscreenshot1.png");
			// Now dump the screenshot data to newly created empty file
			FileUtils.copyFile(sc_file, img);
			
		Thread.sleep(100);
		this.driver.quit();
	  }

}
