package Testng;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Flipkartsearchtestng {
	Logger log;
	WebDriver w;
	@BeforeClass
	public void launchbrowser() {
		log = LogManager.getLogger();
		w = new ChromeDriver();
		log.info("User is opening chrome browser.");
		w.get("https://www.flipkart.com/");
		log.info("User has been redirected to flipkart site.");
	}
	String Change;
	@Test(dataProviderClass = data.class, dataProvider = "flipkart")
	public void search(String search) throws Exception {
		Thread.sleep(2000);
		w.findElement(By.name("q")).sendKeys(search,Keys.ENTER);
		log.info("User search an product called as "+search+"click on enter button");
		Change = search;
		Thread.sleep(2000);
	}
	@AfterMethod
	public void screenshot() throws Exception, Exception {
		TakesScreenshot tss = (TakesScreenshot)w;
		FileHandler.copy(tss.getScreenshotAs(OutputType.FILE), new File("./"+Change+".png"));
		Thread.sleep(2000);
		w.findElement(By.name("q")).sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
		log.info("After product get search user is clearing the search box");
	}
	@AfterClass
	public void close() throws Exception {
	Thread.sleep(2000);
	w.close();
	log.info("after every search has been done then user close the chrome browser");
	}
	

}
