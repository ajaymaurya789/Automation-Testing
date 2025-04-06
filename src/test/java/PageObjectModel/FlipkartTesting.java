package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipkartTesting {

	public static void main(String[] args) throws Exception {
		
		WebDriver w = new FirefoxDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");
		repoOfFlipkart f = new repoOfFlipkart(w);
		f.Search("iphone");
		Thread.sleep(2000);
		f.product();
		Thread.sleep(2000);
		f.windowHandle();
		Thread.sleep(2000);
		f.AddToCard();
		w.navigate().refresh();
		Thread.sleep(2000);
		w.close();
		f.switchParent();
		f.clearproduct();
		
		f.Search("gopro");
		Thread.sleep(2000);
		w.navigate().refresh();
		f.product();
		Thread.sleep(2000);
		f.windowHandle();
		Thread.sleep(2000);
		f.AddToCard();
		w.navigate().refresh();
		w.close();
		f.switchParent();
		f.clearproduct();
		w.navigate().refresh();
		
		f.Search("Boat");
		Thread.sleep(2000);
		w.navigate().refresh();
		f.product();
		Thread.sleep(2000);
		f.windowHandle();
		f.insertpincode();
		Thread.sleep(2000);
		f.AddToCard();
		w.navigate().refresh();
		w.close();
		w.navigate().refresh();
		f.switchParent();
		f.clearproduct();
		}

	}


