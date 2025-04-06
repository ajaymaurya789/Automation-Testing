package Testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class DemoTestng {
	
	@Test(invocationCount=2)
	public void facebook() {
		WebDriver w = new ChromeDriver();
		w.get("https://www.facebook.com/");
		
	}
	@Test(invocationCount = 5)
	public void amazon() {
		WebDriver w = new ChromeDriver();
		w.get("https://www.amazon.in/");
	}
	

}
