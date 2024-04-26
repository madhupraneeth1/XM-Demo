package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


public class UnattachedReceipt extends BaseClass {
	
	
	@Test
	public void dotest() throws InterruptedException {
		
		Thread.sleep(5000);
		
		WebElement settings = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
		settings.click();
		
		Thread.sleep(3000);
		
		WebElement screenprotection = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_screen_protection"));
		screenprotection.click();
		
		WebElement serveradd = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_address"));
		serveradd.sendKeys("https://xm10-dde.xm.dev.inforcloudsuite.com");
		
		WebElement serverport = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_port"));
		serverport.sendKeys("443");
		
		WebElement tenantid = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_tenant"));
		tenantid.sendKeys("XMOPSDDECAQA_AX2");
		
		WebElement next = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));next.click();
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_username"));
		username.sendKeys("jsmith");
		
		WebElement password = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_password"));
		password.sendKeys("p");
		
		WebElement login = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));login.click();
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,60);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));
		
		WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));skip.click();
		Thread.sleep(2000);
		
		WebElement add = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));add.click();
		Thread.sleep(2000);
		
		WebElement receipt = driver.findElement(By.id("com.infor.hl.xm.dev:id/capture_receipt_button"));
		receipt.click(); Thread.sleep(3000);
		  
		WebElement permission = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
		permission.click(); 
		Thread.sleep(3000);
		
		WebElement permissions = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_button"));
		permissions.click(); 
		Thread.sleep(3000);
//		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("browserstack_executor: {\"action\":\"cameraImageInjection\", \"arguments\": {\"imageUrl\" : \"media://e6e30f60a6990f46394e2fd1a84134a62a21a1a1\"}}");
//
//		WebElement picture = driver.findElement(By.id("com.infor.hl.xm.dev:id/picture"));picture.click();
//		Thread.sleep(3000);
//		
//		WebElement expnese = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_new_expense_title"));expnese.click();
//		Thread.sleep(3000);
//		
//		WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Cellular Phone')]"));
//		if(expensetype.isDisplayed()){
//			expensetype.click();
//		}
//		
//		@SuppressWarnings("deprecation")
//		WebDriverWait wait1 = new WebDriverWait(driver,120);
//		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/amount_field")));
//		
//		WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));
//		amount.sendKeys("23");
//		
//		WebElement save = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));save.click();
		
		WebElement gallery = driver.findElement(By.id("com.infor.hl.xm.dev:id/gallery"));gallery.click();
		Thread.sleep(3000);
		  
		WebElement selectphoto = driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\\\"Android_O.png, 81.61 kB, Nov 7\\\"]/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.ImageView[1]"));
		selectphoto.click(); Thread.sleep(3000);
		  
		WebElement savereceipt = driver.findElement(By.id("com.infor.hl.xm.dev:id/save_receipt"));
		savereceipt.click();
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait2 = new WebDriverWait(driver,120);
		wait2.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/user_profile_img")));
		
		WebElement profilebtn = driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));profilebtn.click();
		
		WebElement logout = driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));logout.click();
		Thread.sleep(2000);
		
		WebElement confirm = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));confirm.click();
		
		System.out.println("Expense created");
	}

	@AfterTest
	public void teardown() {
		
		driver.quit();
		
	}
}

