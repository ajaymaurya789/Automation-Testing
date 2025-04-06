package PageObjectModel;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class repoOfFlipkart {
	private WebDriver b;
	private String mainWindow;
	public repoOfFlipkart(WebDriver a) {
		b = a;
	}
	private By search = By.name("q");
	private By product = By.className("CGtC98");
	private By product1 = By.className("wjcEIp");
	private By product2 = By.className("WKTcLC");
	private By buynow = By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2\"]");
	private By cart = By.className("_9Wy27C");
	private By Pincode = By.id("pincodeInputId");
	private By AddToCartOption = By.cssSelector("button[class=\"QqFHMw vslbG+ In9uk2 JTo6b7\"]");
	
	public void Search(String product){
		b.findElement(search).sendKeys(product);
		b.findElement(search).submit();
	}
	public void product() {
		try {
			b.findElement(product).click();
		} catch (Exception e) {
			try {
				b.findElement(product1).click();
			} catch (Exception e2) {
				b.findElement(product2).click();
			}
			
		}
	}
	public void windowHandle() {
		String parent = b.getWindowHandle();
		mainWindow = parent;
		System.out.println(parent);
		Set<String> child = b.getWindowHandles();
		for (String c : child) {
			if (!c.equals(parent)) {
				b.switchTo().window(c);
				System.out.println(c);
			}	
		}	
		}
	public void AddToCard() {
		b.navigate().refresh();
		try {
			b.findElement(AddToCartOption).click();
			
		} catch (Exception e) {
			b.findElement(buynow).click();
			b.findElement(cart).click();
		}
	}
	
	public void close() {
		b.close();
	}
	
	public void switchParent() {
		b.switchTo().window(mainWindow);
	}
	
	public void insertpincode() {
		b.findElement(Pincode).sendKeys("400603",Keys.ENTER);
	}
	public void clearproduct() {
		b.findElement(search).sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
	}
		}


