package PageObjectModel;

import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class projectrepoofflipkart {
	private WebDriver b;
	private String mainWindow;
	public projectrepoofflipkart(WebDriver a) {
		PageFactory.initElements(a, this);
		b=a;
	}
	@FindBy (name = "q") private WebElement search;
	@FindBy (className="CGtC98") private WebElement product; 
	@FindBy (className="wjcEIp") private WebElement product1;
	@FindBy (className="WKTcLC") private WebElement product2;
	@FindBy (css="button[class=\"QqFHMw vslbG+ In9uk2\"]") private WebElement buynow;
	@FindBy (className="_9Wy27C") private WebElement bycart;
	@FindBy (id="pincodeInputId") private WebElement Pincode;
	@FindBy (css="button[class=\"QqFHMw vslbG+ In9uk2 JTo6b7\"]") WebElement AddToCartOption;
	
	public void Enterproduct(String Product){
		search.sendKeys(Product,Keys.ENTER);
	}
	public void Selectproduct() {
		try {
			product.click();
		} catch (Exception e) {
			try {
				product1.click();
			} catch (Exception e2) {
				product2.click();
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
						try {
							AddToCartOption.click();
							

			} catch (Exception e) {
				insertpincode();
				AddToCartOption.click();
				
			}
			
		} catch (Exception e) {
			buynow.click();
			bycart.click();
		}
	}
	
	public void close() {
		b.close();
	}
	
	public void switchParent() {
		b.switchTo().window(mainWindow);
	}
	
	public void insertpincode() {
		Pincode.sendKeys("400603",Keys.ENTER);
	}
	public void clearproduct() {
		search.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
	}
		}
