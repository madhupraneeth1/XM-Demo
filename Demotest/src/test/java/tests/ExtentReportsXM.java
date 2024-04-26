package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportsXM {
	
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	
	@BeforeSuite
	public void reportSetup() {
		
		//start reporters
		htmlReporter = new ExtentSparkReporter("extent.html");
	    
        //create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
		
		
	}
	
	@AfterSuite
	public void reportTeardown() {
		
		extent.flush();
			
	}
	

}
