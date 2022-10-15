package tests;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener {
	
	public void onTestStart(ITestResult result) {
	   System.out.println("Started the Execution");
	  }
	
	public void onTestSuccess(ITestResult result) {
	    System.out.println("All the testcases ran successfully");
	  }
	
	
}
