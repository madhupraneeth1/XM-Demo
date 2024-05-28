package tests;

import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.MobileCapabilityType;
import io.percy.appium.AppPercy;

public class BaseClass extends ExtentReportsXM {
	
	public AppiumDriver driver;
	
	@BeforeTest
	public void setup() {
		
		try {
		
		DesiredCapabilities caps = new DesiredCapabilities();	
			
		//caps.setCapability("platformName", "ANDROID");
		//caps.setCapability(CapabilityType.PLATFORM_NAME, "ANDROID");
		//caps.setCapability("chromedriverExecutable", "C:\\Users\\mkorukonda\\Desktop\\chromedriver_win32\\chromedriver.exe");
		//caps.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");	
		//caps.setCapability(MobileCapabilityType.UDID, "192.168.0.102:5555");
		
		caps.setCapability(MobileCapabilityType.UDID, "7fac1e5a");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ios");
		caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Oneplus 7T");
		caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		caps.setCapability("appPackage", "com.infor.hl.xm");
		caps.setCapability("appActivity", "com.infor.hl.xm.ui.navigation.NavigationActivity");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver(url, caps);
		
		//driver = new AndroidDriver(url, caps);
		//driver = new IOSDriver(url, caps);
			
			
			
		//MutableCapabilities caps = new UiAutomator2Options();
		//caps.setCapability("browserstack.enableCameraImageInjection", "true");
		//driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
			
		//MutableCapabilities caps = new XCUITestOptions();
		//driver = new AppiumDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);
					
//		  DesiredCapabilities capabilities = new DesiredCapabilities(); HashMap<String,
//		  Object> browserstackOptions = new HashMap<String, Object>();
//		  browserstackOptions.put("appiumVersion", "1.22.0");
//		  
//		  capabilities.setCapability("platformName", "android");
//		  
//		  capabilities.setCapability("bstack:options", browserstackOptions);
//	  
//		  // Set your access credentials
//		  capabilities.setCapability("browserstack.user", "madhupraneeth_EPwxVk");
//		  capabilities.setCapability("browserstack.key", "NkiobTxsEtiwKf4CmKxN");
//		  
//		  // Set URL of the application under test 
//		  capabilities.setCapability("app","bs://c26fb929c5a31cda35419c8aa769dce32d37c18d");
//		  
//		  // Specify device and os_version for testing
//		  capabilities.setCapability("platformName", "android");
//		  capabilities.setCapability("deviceName", "Samsung Galaxy S22 Ultra");
//		  capabilities.setCapability("platformVersion", "12.0");		  
//		  
//		  // Set other BrowserStack capabilities 
//		  capabilities.setCapability("project","Native App Project"); capabilities.setCapability("build", "BUILDNAME");
//		  capabilities.setCapability("name", "first_test"); driver = new
//		  AndroidDriver(new URL("https://madhupraneeth_EPwxVk:NkiobTxsEtiwKf4CmKxN@hub-cloud.browserstack.com/wd/hub"), capabilities);
		 
		}catch(Exception exp) {
			
			System.out.println("Cause is: "+exp.getCause());
			System.out.println("Cause is: "+exp.getMessage());
			exp.printStackTrace();
		}
		
		
		
	}
	
	 
//	  protected void sampleTest() {
//	  
//		  curl -u "madhupraneeth_EPwxVk:NkiobTxsEtiwKf4CmKxN" \-X PUT "https://api-cloud.browserstack.com/app-automate/sessions/f97f02bf39d592f5fc349cee419294fdfb7593a2.json" \-H "Content-Type: application/json" \-d '{"status":"failed", "reason":"Element not found on the login page"}'
//	  }
	  
	  @AfterTest
	  public void teardown() {
	  driver.quit();
	  }
	 
}
