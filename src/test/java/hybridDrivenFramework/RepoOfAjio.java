package hybridDrivenFramework;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RepoOfAjio {
	WebDriver w;
	String Mainpage;
	public RepoOfAjio(WebDriver w) {
		PageFactory.initElements(w, this);
		this.w = w;
	}
	@FindBy(css="input[aria-label=\"Search Ajio\"]")
	WebElement search;
	
	@FindBy(css = "a[class=\"rilrtl-products-list__link desktop\"]")
	WebElement product;
	
	@FindBy(xpath="//*[@class=\"pdp-addtocart-button\"]/div")
	WebElement addtobag;
	
	@FindBy(css="a[aria-label=\"cart icon\"]")
	WebElement Carticon;
	
	@FindBy(xpath="//*[@class=\"circle size-variant-item size-instock \"]")
	WebElement size;
	
	public void search(String searchProduct) {
		search.sendKeys(searchProduct,Keys.ENTER);
	}
	public void product() {
		product.click();
	}
	public void windowhandle() {
		String parent = w.getWindowHandle();
		Mainpage=parent;
		Set<String> child = w.getWindowHandles();
		for (String c : child) {
			if(!c.equals(parent)) {
				w.switchTo().window(c);
			}
		}
	}
	public void AddToBag() {
		try {
			size.click();
			addtobag.click();
		} catch (Exception e) {
			addtobag.click();
		}
		
	}
	public void carticon() {
		WebDriverWait wait = new WebDriverWait(w, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(Carticon)).click();
	}
	public void SwitchtoMainpage() {
		w.switchTo().window(Mainpage);
	}
	public void close() {
		w.close();
		
	}

}
