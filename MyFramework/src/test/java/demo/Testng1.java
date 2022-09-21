package demo;



import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1{
	@BeforeSuite
	public void beforesuit()  //eg clear cookies
	{
		System.out.println("I am before suit");
	}
	
	@BeforeTest
	public void beforeTest() //eg clearing old testing report
	{
		System.out.println("I am beforeTest");
	}
	
	@BeforeClass
	public void beforeClass() //eg depends on the test
	{
		System.out.println("I am beforeClass");
	}
	
	@BeforeMethod
	public void BeforeMethod()
	{
		System.out.println("I am BeforeMethod");
	}
	
	@Test
	public void test()
	{
		System.out.println("I am test");
	}
	
	@Test
	public void TestOne()
	{
		System.out.println("I am 2nd test");
	}
	
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("I am AfterMethod");
	}

	@AfterClass
	public void AfterClass()
	{
		System.out.println("I am AfterClass");
	}
	
	@AfterTest
	public void AfterTest()
	{
		System.out.println("I am AfterTest");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("I am AfterSuite");
	}
	
	
	
}


