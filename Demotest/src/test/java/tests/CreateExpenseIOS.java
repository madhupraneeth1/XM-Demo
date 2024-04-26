package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class CreateExpenseIOS extends BaseClass {
	
	
	@Test
	public void dotest() throws InterruptedException {
		
		Thread.sleep(5000);
		
		WebElement settings = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"configuration white\"]"));
		settings.click();
		
		Thread.sleep(3000);
		
		WebElement serveradd = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Expense\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[1]"));
		serveradd.sendKeys("https://xm10-dde.xm.dev.inforcloudsuite.com");
		
		WebElement serverport = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Expense\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[2]"));
		serverport.sendKeys("443");
		
		WebElement tenantid = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Expense\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField[3]"));
		tenantid.sendKeys("XMMOBSTND_AX1");
		
		WebElement enter = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Return\"]"));
		enter.click();
		
		WebElement next = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Next\"]"));
		next.click();
		
		Thread.sleep(3000);
		
		WebElement username = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Expense\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeTextField"));
		username.sendKeys("jsmith");
		
		WebElement password = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Expense\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeSecureTextField"));
		password.sendKeys("p");
		
		WebElement enter1 = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Return\"]"));
		enter1.click();
		
		WebElement show = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"wrong icon\"]"));
		show.click();
		
		WebElement login = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Log in\"]"));login.click();
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeButton[@name=\"Allow\"]")));
		
		WebElement allow = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Allow\"]"));allow.click();
		Thread.sleep(2000);
		
		WebElement skip = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Skip For Now\"]"));skip.click();
		Thread.sleep(2000);
		
		WebElement add = (WebElement) driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"plus white\"]"));add.click();
		
		WebElement startexpense = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Start Expense\"]"));startexpense.click();
		Thread.sleep(5000);
		
		WebElement expensetype = driver.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Cellular Phone\"]"));
		if(expensetype.isDisplayed()){
			expensetype.click();
		}
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait1 = new WebDriverWait(driver,120);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//XCUIElementTypeApplication[@name=\"Expense\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField")));
		
		WebElement amount = driver.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"Expense\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[4]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[1]/XCUIElementTypeTextField"));
		amount.sendKeys("23");
		
		WebElement done = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Done\"]"));done.click();
		
		WebElement save = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Save\"]"));save.click();
		Thread.sleep(15000);
//		@SuppressWarnings("deprecation")
//		WebDriverWait wait2 = new WebDriverWait(driver,120);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("com.infor.hl.xm.dev:id/user_profile_img")));
//		
//		WebElement profilebtn =driver.findElement(By.xpath("com.infor.hl.xm.dev:id/user_profile_img"));profilebtn.
//		click();
//		
//		WebElement logout =driver.findElement(By.xpath("com.infor.hl.xm.dev:id/pro_log_out_btn"));logout.click(); 
//		Thread.sleep(2000);
//		
//		WebElement confirm =driver.findElement(By.xpath("com.infor.hl.xm.dev:id/dialog_button_negative"));confirm.click();
		
		System.out.println("Logout Succesful");
	}

	@AfterTest
	public void teardown() {
		
		driver.quit();
		
	}
}

