package TestcaseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RepoOfFlipkart {
	WebDriver w;
	public RepoOfFlipkart(WebDriver wd) {
		w = wd;
		
		
	}
	//By search = By.name("q");
	By search = By.cssSelector("input[placeholder=\"Search for products, brands and more\"]");
	public void site(String url) {
		w.get(url);
	}
	public void Search(String product) {
		w.findElement(search).sendKeys(product,Keys.ENTER);
	}
	public void VerifyTitle(String ExpectedTitle) {
		String Acttitle = w.getTitle();
	    boolean ans = Acttitle.contains(ExpectedTitle);
	    Assert.assertEquals(ans, true);
	}
	public void Browserclose() {
		w.quit();
	}

}
