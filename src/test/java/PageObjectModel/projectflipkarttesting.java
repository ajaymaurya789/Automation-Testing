package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class projectflipkarttesting {

	public static void main(String[] args) throws Exception {
		WebDriver w = new FirefoxDriver();
		w.manage().window().maximize();
		w.get("https://www.flipkart.com/");
		projectrepoofflipkart f = new projectrepoofflipkart(w);
		
		f.Enterproduct("iphone");
		Thread.sleep(2000);
		f.Selectproduct();
		Thread.sleep(2000);
		f.windowHandle();
		Thread.sleep(2000);
		f.AddToCard();
		w.navigate().refresh();
		Thread.sleep(2000);
		w.close();
		f.switchParent();
		
		w.navigate().refresh();
		f.clearproduct();
		
		f.Enterproduct("gopro");
		Thread.sleep(2000);
		w.navigate().refresh();
		f.Selectproduct();
		Thread.sleep(2000);
		f.windowHandle();
		Thread.sleep(2000);
		f.AddToCard();
		w.navigate().refresh();
		w.close();
		f.switchParent();
		w.navigate().refresh();
		f.clearproduct();
		
		
		f.Enterproduct("Boat");
		Thread.sleep(2000);
		w.navigate().refresh();
		f.Selectproduct();
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
