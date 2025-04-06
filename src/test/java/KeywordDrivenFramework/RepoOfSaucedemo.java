package KeywordDrivenFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RepoOfSaucedemo {
	
	public RepoOfSaucedemo(WebDriver wd) {
		PageFactory.initElements(wd, this);

	}
	@FindBy(id= "user-name") private WebElement username;
	@FindBy(id= "password")private WebElement password;
	@FindBy(css = "input[data-test=\"login-button\"]")private WebElement loginbtn;
	@FindBy(id="add-to-cart-sauce-labs-backpack")private WebElement addtocartbtn;
	@FindBy(css= "a[data-test=\"shopping-cart-link\"]")private WebElement gotocart;
	@FindBy(id="checkout")private WebElement checkoutbtn;
	@FindBy(id="first-name")private WebElement firstname;
	@FindBy(id="last-name")private WebElement lastname;
	@FindBy(id="postal-code")private WebElement postalcode;
	@FindBy(id="continue")private WebElement continuebtn;
	@FindBy(id="finish")private WebElement finishbtn;
	@FindBy(id="react-burger-menu-btn")private WebElement menubtn;
	@FindBy(linkText = "Logout")private WebElement logoutbtn;
	
	public void username(String user) {
		username.sendKeys(user);
	}
	public void password(String pass) {
		password.sendKeys(pass);
	}
	public void login() {
		loginbtn.click();
	}
	public void addtocart() {
		addtocartbtn.click();
	}
	public void gotocart() {
		gotocart.click();
	}
	public void checkout() {
		checkoutbtn.click();
	}
	public void firstname(String fname) {
		firstname.sendKeys(fname);
	}
	public void lastname(String lname) {
		lastname.sendKeys(lname);
	}
	public void postcode(String pcode) {
		postalcode.sendKeys(pcode);
	}
	public void Continue() {
		continuebtn.click();	
	}
	public void finish() {
		finishbtn.click();
	}
	public void menu() {
		menubtn.click();
	}
	public void logout() {
		logoutbtn.click();
	}

}
