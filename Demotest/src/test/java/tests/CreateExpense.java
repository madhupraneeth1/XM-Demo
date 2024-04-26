package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import io.percy.appium.AppPercy;


public class CreateExpense extends BaseClass {
	
	
	
	@Test
	public void dotest() throws InterruptedException {
		
		//creates a toggle for the given test, adds all log events under it    
        //ExtentTest test = extent.createTest("XMTest", "Sample XMTest description");
		//test.log(Status.INFO, "Test Started");
		
		Thread.sleep(5000);
		
		WebElement settings = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
		settings.click();
		//test.log(Status.PASS, "Navigate to Server Address Page");
		
		Thread.sleep(3000);
		
		WebElement screenprotection = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_screen_protection"));
		screenprotection.click();
		
		WebElement serveradd = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_address"));
		serveradd.sendKeys("https://xm10-dde.xm.dev.inforcloudsuite.com");
		
		WebElement serverport = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_port"));
		serverport.sendKeys("443");
		
		WebElement tenantid = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_tenant"));
		tenantid.sendKeys("XMMOBSTND_AX1");
		
		WebElement next = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		next.click();
		//test.log(Status.PASS, "Navigate to Login Page");
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_username"));
		username.sendKeys("jsmith");
		
		WebElement password = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_password"));
		password.sendKeys("p");
		
		AppPercy percy = new AppPercy(driver);
		percy.screenshot("Login");
		
		WebElement login = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));login.click();
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));
		
		WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));skip.click();
		Thread.sleep(2000);
		//test.log(Status.PASS, "Navigate to Home Page");
		
        WebElement add = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));add.click();
		
		WebElement startexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_expense_button"));startexpense.click();
		Thread.sleep(5000);
		
		WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Cellular Phone')]"));
		if(expensetype.isDisplayed()){
			expensetype.click();
		}
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait1 = new WebDriverWait(driver,120);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
		
		WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
		amount.sendKeys("23");
		
		WebElement save = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));save.click();
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait2 = new WebDriverWait(driver,120);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		WebElement profilebtn =driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));profilebtn.
		click();
		
		WebElement logout =driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));logout.click(); 
		Thread.sleep(2000);
		
		WebElement confirm =driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));confirm.click();
		
		System.out.println("Logout Succesful");
		//test.log(Status.INFO, "Test Closed");
	}

}
