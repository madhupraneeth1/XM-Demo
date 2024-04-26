package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ApproveandReject extends BaseClass {
	
	@Test
	public void Test() throws InterruptedException {
		
		login();
		
		WebElement reports = driver.findElement(By.id("com.infor.hl.xm:id/reports"));reports.click();
		Thread.sleep(3000);
		
		WebElement approvals = driver.findElement(By.xpath("//*[contains(@content-desc, 'Approvals')]"));approvals.click();
		Thread.sleep(2000);
		
		WebElement er1 = driver.findElement(By.xpath("//*[contains(@text, 'Test')]"));er1.click();
		Thread.sleep(3000);
		
		WebElement expensetab = driver.findElement(By.xpath("//*[contains(@content-desc, 'Expenses')]"));expensetab.click();
		
		//WebElement approve = driver.findElement(By.id("com.infor.hl.xm:id/approve"));approve.click();
		
		WebElement reject = driver.findElement(By.id("com.infor.hl.xm:id/reject"));reject.click();
		
		WebElement rejectnote = driver.findElement(By.id("com.infor.hl.xm:id/reject_note"));
		rejectnote.sendKeys("Testing");
		
		WebElement rejectconfirm = driver.findElement(By.id("com.infor.hl.xm:id/reject_report"));rejectconfirm.click();
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,120);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("android:id/button2")));
		
		WebElement ok = driver.findElement(By.id("android:id/button2"));ok.click();
		
		WebElement profilebtn = driver.findElement(By.id("com.infor.hl.xm:id/user_profile_img"));profilebtn.click();
		
		WebElement logout = driver.findElement(By.id("com.infor.hl.xm:id/pro_log_out_btn"));logout.click();
		
		Thread.sleep(2000);
		
		WebElement confirm = driver.findElement(By.id("android:id/button1"));confirm.click();
		
		System.out.println("Expense report");
	}
	
	public void login() throws InterruptedException {
	
		Thread.sleep(5000);
		
		WebElement settings = driver.findElement(By.id("com.infor.hl.xm:id/tenant_button"));
		settings.click();
		
		WebElement serveradd = driver.findElement(By.id("com.infor.hl.xm:id/login_address"));
		serveradd.sendKeys("https://xm10.xm.awsdev.infor.com");
		
		WebElement serverport = driver.findElement(By.id("com.infor.hl.xm:id/login_port"));
		serverport.sendKeys("443");
		
		WebElement tenantid = driver.findElement(By.id("com.infor.hl.xm:id/login_tenant"));
		tenantid.sendKeys("XMQA_TRN");
		
		WebElement next = driver.findElement(By.id("com.infor.hl.xm:id/next_button"));
		next.click();
		
		WebElement username = driver.findElement(By.id("com.infor.hl.xm:id/login_username"));
		username.sendKeys("jjones");
		
		WebElement password = driver.findElement(By.id("com.infor.hl.xm:id/login_password"));
		password.sendKeys("p");
		
		WebElement login = driver.findElement(By.id("com.infor.hl.xm:id/next_button"));
		login.click();
		
		@SuppressWarnings("deprecation")
		WebDriverWait wait = new WebDriverWait(driver,120);		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.infor.hl.xm:id/product_tour_skip_button")));
		
		WebElement skip = driver.findElement(By.id("com.infor.hl.xm:id/product_tour_skip_button"));
		skip.click();
		Thread.sleep(2000);
	}

}

