package Testng;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class frontaccountingannotation {
	WebDriver w;
	int i = 1;
	@BeforeSuite
	public void launchbrowser() {
		w=new ChromeDriver();
		w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	@BeforeTest
	public void opensite() {
		w.get("https://demo.frontaccounting.eu/");
	}
	@BeforeClass
	public void login() {
		w.findElement(By.name("SubmitUser")).click();
	}
	@BeforeMethod
	public void Salesquatationentry() {
		w.findElement(By.linkText("Sales Quotation Entry")).click();
	}
	@Test
	public void cancelorder() {
		w.findElement(By.name("CancelOrder")).click();
	}
	@Test
	public void customer() throws Exception {
		WebElement customer =w.findElement(By.name("customer_id"));
		Select s= new Select(customer);
		s.selectByVisibleText("ABCD");
		Thread.sleep(2000);
		w.findElement(By.name("CancelOrder")).click();
	}
	@Test
	public void payment() throws Exception {
		WebElement customer =w.findElement(By.name("customer_id"));
		Select s= new Select(customer);
		s.selectByVisibleText("ABCD");
		Thread.sleep(2000);
		WebElement payment =w.findElement(By.name("payment"));
		Select s2= new Select(payment);
		Thread.sleep(2000);
		s2.selectByVisibleText("Payment due within 10 days");
		w.findElement(By.name("CancelOrder")).click();
	}
	@AfterMethod
	public void mainpage() throws Exception {
		Thread.sleep(2000);
		Alert alt = w.switchTo().alert();
		alt.accept();
		Thread.sleep(2000);
		TakesScreenshot tss = (TakesScreenshot)w;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\Ajay\\OneDrive\\Pictures\\src"+i+".png"));
		i++;
		Thread.sleep(2000);
		w.findElement(By.linkText("Back")).click();
	}
	@AfterClass
	public void logout() throws InterruptedException {
		Thread.sleep(2000);
		w.findElement(By.linkText("Logout")).click();
	}
	@AfterTest
	public void loginagain() throws Exception {
		Thread.sleep(2000);
		w.findElement(By.linkText("Click here to Login Again.")).click();
	}
	@AfterSuite
	public void closebrowser() throws Exception {
		Thread.sleep(2000);
		w.quit();
	}
	

}
