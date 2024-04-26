package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class UnattachedReceiptIOS extends BaseClass {
	
	
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
		tenantid.sendKeys("XMOPSDDECAQA_AX2");
		
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
		
//		WebElement add = (WebElement) driver.findElement(By.xpath("com.infor.hl.xm.dev:id/fab_add"));add.click();
//		
//		WebElement receipt = (WebElement) driver.findElement(By.xpath("com.infor.hl.xm.dev:id/capture_receipt_button"));
//		receipt.click(); Thread.sleep(3000);
//		  
//		WebElement permission = (WebElement) driver.findElement(By.xpath("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
//		permission.click(); 
//		Thread.sleep(3000);
//		
//		WebElement permissions = (WebElement) driver.findElement(By.xpath("com.android.permissioncontroller:id/permission_allow_button"));
//		permissions.click(); 
//		Thread.sleep(3000);
//		
//		JavascriptExecutor jse = (JavascriptExecutor)(WebElement) driver;
//		jse.executeScript("browserstack_executor: {\"action\":\"cameraImageInjection\", \"arguments\": {\"imageUrl\" : \"media://e6e30f60a6990f46394e2fd1a84134a62a21a1a1\"}}");
//
//		WebElement picture = (WebElement) driver.findElement(By.xpath("com.infor.hl.xm.dev:id/picture"));picture.click();
//		Thread.sleep(3000);
//		
//		WebElement expnese = (WebElement) driver.findElement(By.xpath("com.infor.hl.xm.dev:id/start_new_expense_title"));expnese.click();
//		Thread.sleep(3000);
//		
//		WebElement expensetype = (WebElement) driver.findElement(By.xpath("//*[contains(@text, 'Cellular Phone')]"));
//		if(expensetype.isDisplayed()){
//			expensetype.click();
//		}
//		
//		@SuppressWarnings("deprecation")
//		WebDriverWait wait1 = new WebDriverWait(driver,60);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("com.infor.hl.xm.dev:id/amount_field")));
//		
//		WebElement amount = (WebElement) driver.findElement(By.xpath("com.infor.hl.xm.dev:id/amount_field"));
//		amount.sendKeys("23");
//		
//		WebElement save = (WebElement) driver.findElement(By.xpath("com.infor.hl.xm.dev:id/save"));save.click();
//		
//		/*
//		 * WebElement gallery =
//		 * (WebElement) driver.findElement(By.xpath("com.infor.hl.xm.dev:id/gallery"));gallery.click();
//		 * Thread.sleep(3000);
//		 * 
//		 * WebElement selectphoto = (WebElement) driver.findElement(By.xpath(
//		 * "//android.widget.ImageView[@bounds='[162,728][267,833]']"));
//		 * selectphoto.click(); Thread.sleep(3000);
//		 * 
//		 * WebElement savereceipt =
//		 * (WebElement) driver.findElement(By.xpath("com.infor.hl.xm.dev:id/save_receipt"));
//		 * savereceipt.click();
//		 */
//		
//		@SuppressWarnings("deprecation")
//		WebDriverWait wait2 = new WebDriverWait(driver,60);
//		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("com.infor.hl.xm.dev:id/user_profile_img")));
//		
//		WebElement profilebtn = (WebElement) driver.findElement(By.xpath("com.infor.hl.xm.dev:id/user_profile_img"));profilebtn.click();
//		
//		WebElement logout = (WebElement) driver.findElement(By.xpath("com.infor.hl.xm.dev:id/pro_log_out_btn"));logout.click();
//		Thread.sleep(2000);
//		
//		WebElement confirm = (WebElement) driver.findElement(By.xpath("com.infor.hl.xm.dev:id/dialog_button_negative"));confirm.click();
//		
//		System.out.println("Expense created");
	}

	@AfterTest
	public void teardown() {
		
		driver.quit();
		
	}
}

