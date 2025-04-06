package Testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class saucedemotestng {
	WebDriver w;
	@Parameters ("b")
	@BeforeClass(alwaysRun = true)
	public void browserlaunch(String browser) {
		if (browser.equals("chrome")) {
			w=new ChromeDriver();
			w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}else if (browser.equals("firefox")) {
			w=new FirefoxDriver();
			w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}else if (browser.equals("edge")) {
			w=new EdgeDriver();
			w.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		}else {
			System.out.println("Browser not valid");
		}
		
	}
	@BeforeMethod(alwaysRun = true)
	public void opensite() {
		w.get("https://www.saucedemo.com/");
	}
	
	@Test(dataProviderClass = data.class,dataProvider = "login",alwaysRun = true)
	public void login(String username, String password) {
		w.findElement(By.id("user-name")).sendKeys(username);
		w.findElement(By.id("password")).sendKeys(password);
		w.findElement(By.id("login-button")).click();
		w.findElement(By.id("react-burger-menu-btn")).click();
		w.findElement(By.linkText("Logout")).click();
	}
	@AfterClass (alwaysRun = true)
	public void close() {
		w.quit();
	}
	

}
