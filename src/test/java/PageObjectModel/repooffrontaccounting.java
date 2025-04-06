package PageObjectModel;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class repooffrontaccounting {
	WebDriver w;
	String ParentWindow;
	
	public repooffrontaccounting(WebDriver wd) {
		PageFactory.initElements(wd, this);
		w = wd;
		
	}
	@FindBy(name="user_name_entry_field") private WebElement Username;
	@FindBy(name="password") private WebElement Password;
	@FindBy(name="SubmitUser") private WebElement Loginbtn;
	@FindBy(linkText = "Sales Quotation Entry") private WebElement SQE;
	@FindBy(id="customer_id") private WebElement customer;
	@FindBy(id="payment") private WebElement payment;
	@FindBy(id="stock_id") private WebElement item;
	@FindBy(id="AddItem") private WebElement additem;
	@FindBy(id="ProcessOrder") private WebElement placeorder;
	@FindBy(linkText = "View This Quotation") private WebElement VTQ;
	@FindBy(linkText = "Close") private WebElement VTQclose;
	@FindBy(linkText = "Logout") private WebElement logoutbtn;
	
	public void clearusername() {
		Username.clear();
	}
	public void EnterUsername(String username) {
		Username.sendKeys(username);
	}
	public void clearpassword() {
		Password.clear();
	}
	public void EnterPassword(String password) {
		Password.sendKeys(password);
	}
	public void Loginbtn() {
		Loginbtn.click();
	}
	public void ClickonSQE() {
		SQE.click();
	}
	public void customer(String Customervisibletext) {
	Select s = new Select(customer);
	s.selectByVisibleText(Customervisibletext);
	}
	public void payment(String paymentvisibletext) {
		Select s = new Select(payment);
		s.selectByVisibleText(paymentvisibletext);
		}
	public void item(String itemvisibletext) {
		Select s = new Select(item);
		s.selectByVisibleText(itemvisibletext);
		}
	public void Clickonadditem() {
		additem.click();
	}
	public void placeorder() {
		placeorder.click();
	}
	public void VTQ() {
		VTQ.click();
	}
	public void Windowhandle() {
		String Parent = w.getWindowHandle();
		ParentWindow = Parent;
		Set<String> child = w.getWindowHandles();
		for (String c : child) {
			if(!c.equals(Parent)) {
				w.switchTo().window(c);
				Close();
			}
		}
	}
	public void Close() {
		w.close();
	}
	public void SwitchParent() {
		w.switchTo().window(ParentWindow);
	}
	public void Logout() {
		logoutbtn.click();
	}

}
