package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;


public class ExpenseReport extends BaseClass {
	
	@Test
	public void Test() throws InterruptedException {
		
		login();
		
		WebElement add = driver.findElement(By.id("com.infor.hl.xm.dev:id/fab_add"));
		add.click();
		
		WebElement startreport = driver.findElement(By.id("com.infor.hl.xm.dev:id/start_report_button"));
		startreport.click();
		Thread.sleep(2000);
		
		WebElement doucmenttitle = driver.findElement(By.id("com.infor.hl.xm.dev:id/report_name"));
		doucmenttitle.sendKeys("Test Appium");
		
		WebElement purpose = driver.findElement(By.id("com.infor.hl.xm.dev:id/detail"));
		purpose.click();
		Thread.sleep(2000);
		
		WebElement purposetype = driver.findElement(By.xpath("//*[contains(@text, 'Business Development')]"));
		if(purposetype.isDisplayed()){
			purposetype.click();
		}
		Thread.sleep(2000);
		
		WebElement nextbutton = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));nextbutton.click();

		WebElement skipbutton = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));skipbutton.click();

		WebElement addexpense = driver.findElement(By.id("com.infor.hl.xm.dev:id/add_tv"));addexpense.click();
		
		WebElement createnew = driver.findElement(By.id("com.infor.hl.xm.dev:id/create_new"));createnew.click();
		Thread.sleep(2000);
		WebElement expensetype = driver.findElement(By.xpath("//*[contains(@text, 'Fax')]"));
		if(expensetype.isDisplayed()){
			expensetype.click();
		}
		Thread.sleep(6000);
		
		WebElement amount = driver.findElement(By.id("com.infor.hl.xm.dev:id/amount_field"));amount.sendKeys("30");
		
		WebElement receipt = driver.findElement(By.id("com.infor.hl.xm.dev:id/receipt_clip"));receipt.click();
		Thread.sleep(3000);
		
		WebElement takephoto = driver.findElement(By.id("com.infor.hl.xm.dev:id/take_photo"));takephoto.click();
		Thread.sleep(3000);
		
		WebElement permission = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));permission.click();
		Thread.sleep(3000);
		
		WebElement picture = driver.findElement(By.id("com.infor.hl.xm.dev:id/picture"));picture.click();
		Thread.sleep(3000);
		
		WebElement save = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		save.click();
		WebElement save1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/save"));
		save1.click();
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait1 = new WebDriverWait(driver,120);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/submit_report")));
		
		WebElement submit = driver.findElement(By.id("com.infor.hl.xm.dev:id/submit_report"));submit.click();
		
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral")));
		
		WebElement done = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_neutral"));done.click();
		
		WebElement profilebtn = driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));profilebtn.click();
		
		WebElement logout = driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));logout.click();
		
		Thread.sleep(2000);
		
		WebElement confirm = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));confirm.click();
		
		System.out.println("Expense report submitted");
		
		login1();
		
		WebElement reports = driver.findElement(By.id("com.infor.hl.xm.dev:id/reports"));reports.click();
		Thread.sleep(3000);
		
		WebElement approvals = driver.findElement(By.xpath("//*[contains(@content-desc, 'Approvals')]"));approvals.click();
		Thread.sleep(2000);
		
		WebElement er1 = driver.findElement(By.xpath("//*[contains(@text, 'Test Appium')]"));er1.click();
		Thread.sleep(3000);
		
		WebElement expensetab = driver.findElement(By.xpath("//*[contains(@content-desc, 'Expenses')]"));expensetab.click();
		
		WebElement approve = driver.findElement(By.id("com.infor.hl.xm.dev:id/approve"));approve.click();
		
		WebElement reject = driver.findElement(By.id("com.infor.hl.xm.dev:id/reject"));reject.click();
		
		WebElement rejectnote = driver.findElement(By.id("com.infor.hl.xm.dev:id/reject_note"));
		rejectnote.sendKeys("Testing");
		
		WebElement rejectconfirm = driver.findElement(By.id("com.infor.hl.xm.dev:id/reject_report"));rejectconfirm.click();
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,120);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button2")));
		
		WebElement ok = driver.findElement(By.id("android:id/button2"));ok.click();
		
		WebElement profilebtn1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/user_profile_img"));profilebtn1.click();
		
		WebElement logout1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/pro_log_out_btn"));logout1.click();
		
		Thread.sleep(2000);
		
		WebElement confirm1 = driver.findElement(By.id("com.infor.hl.xm.dev:id/dialog_button_negative"));confirm1.click();
	}
	
	public void login() throws InterruptedException {
	
		Thread.sleep(5000);
		
		WebElement settings = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
		settings.click();
		Thread.sleep(3000);
		
		WebElement serveradd = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_address"));
		serveradd.sendKeys("https://xm10-dde.xm.dev.inforcloudsuite.com");
		
		WebElement serverport = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_port"));
		serverport.sendKeys("443");
		
		WebElement tenantid = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_tenant"));
		tenantid.sendKeys("XMOPSDDECAQA_AX2");
		
		WebElement next = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		next.click();
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_username"));
		username.sendKeys("jsmith");
		
		WebElement password = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_password"));
		password.sendKeys("p");
		
		WebElement login = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		login.click();
		
		//WebDriverWait wait = new WebDriverWait(driver,120);		
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(120));
		WebElement skip = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button")));
		
		//WebElement skip = driver.findElement(By.id("com.infor.hl.xm.dev:id/product_tour_skip_button"));
		skip.click();
		Thread.sleep(2000);
	}
	
	public void login1() throws InterruptedException {
		
		Thread.sleep(5000);
		
		WebElement settings = driver.findElement(By.id("com.infor.hl.xm.dev:id/tenant_button"));
		settings.click();
		Thread.sleep(3000);
		
		WebElement serveradd = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_address"));
		serveradd.sendKeys("https://xm10-dde.xm.dev.inforcloudsuite.com");
		
		WebElement serverport = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_port"));
		serverport.sendKeys("443");
		
		WebElement tenantid = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_tenant"));
		tenantid.sendKeys("XMOPSDDECAQA_AX2");
		
		WebElement next = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		next.click();
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_username"));
		username.sendKeys("jjones");
		
		WebElement password = driver.findElement(By.id("com.infor.hl.xm.dev:id/login_password"));
		password.sendKeys("p");
		
		WebElement login = driver.findElement(By.id("com.infor.hl.xm.dev:id/next_button"));
		login.click();
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,120);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm.dev:id/reports")));
		
		Thread.sleep(2000);
	}
	
}

