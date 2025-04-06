package TestcaseCode;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	Webdriverdata data;
	public hooks(Webdriverdata d) {
		data = d;
	}
	@Before
	public void launchBrowser(){
		data.w = new ChromeDriver();

	}
	@After
	public void closebrowser() {
		data.w.quit();

	}

}
