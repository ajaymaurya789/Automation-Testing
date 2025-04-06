package TestcaseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_Login_001 {
	public Webdriverdata data;
	public TC_Login_001(Webdriverdata data) {
		this.data = data;
		
	}
	@Given("User launch an chrome browser")
	public void user_launch_an_chrome_browser() {
	    data.w = new ChromeDriver();
	}
	@Given("User should be landed on front accounting site")
	public void user_should_be_landed_on_front_accounting_site() {
	    data.w.get("https://demo.frontaccounting.eu/index.php");
	}
	@When("First clear and then enter {string} in username field.")
	public void first_clear_and_then_enter_in_username_field(String user) {
	    data.w.findElement(By.name("user_name_entry_field")).clear();
	    data.w.findElement(By.name("user_name_entry_field")).sendKeys(user);
	}
	@When("First clear and then enter {string} in password field.")
	public void first_clear_and_then_enter_in_password_field(String pass) {
	    data.w.findElement(By.name("password")).clear();
	    data.w.findElement(By.name("password")).sendKeys(pass);;
	}
	@When("Click on login button")
	public void click_on_login_button() {
	    data.w.findElement(By.name("SubmitUser")).click();
	}
	@Then("Validate login by title of the page")
	public void validate_login_by_title_of_the_page() {
	    String Exptitle = "Main Menu";
	    String Acttitle = data.w.getTitle();
	    Assert.assertEquals(Acttitle, Exptitle);
	    
	}
	@Then("close the browser")
	public void close_the_browser() {
	    data.w.quit();
	}


}
