package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import tests.BaseClass;

public class WelcomeScreen extends BaseClass {
        
	
        WebElement settings = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button")); 
        
        private WelcomeScreen()
        {
        	
        }
    }

