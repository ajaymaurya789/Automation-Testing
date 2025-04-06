package TestcaseCode;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC_search_001 {
	RepoOfFlipkart f;
	//Webdriverdata data;
	public TC_search_001(Webdriverdata data) {
		//this.data = data;
		f = new RepoOfFlipkart(data.w);
	}
	@Given("User should be landed on flipkart site")
	public void user_should_be_landed_on_flipkart_site() {
		//data.w.get("https://www.flipkart.com/");
		//f.site("https://www.flipkart.com/");
		f.site("https://www.flipkart.com/");
		
		
	    
	}
	
	@Given("User should be landed on myntra site")
	public void user_should_be_landed_on_myntra_site() {
		//data.w.get("https://www.flipkart.com/");
		//f.site("https://www.flipkart.com/");
		f.site("https://www.myntra.com/");
	}
	
	@When("enter {string} in search tab.")
	public void enter_in_search_tab(String product) {
	    //data.w.findElement(By.name("q")).sendKeys(string,Keys.ENTER);
		f.Search(product);
	}
	@Then("Validate search by title of the page")
	public void validate_search_by_title_of_the_page() {
		//String Exptitle = "Mobile- Buy Products Online at Best Price in India - All Categories | Flipkart.com";
	    //String Acttitle = w.getTitle();
	    //Assert.assertEquals(Acttitle, Exptitle);
		f.VerifyTitle("Mobile- Buy Products Online at Best Price in India - All Categories | Flipkart.com");
	}
	@Then("Validate search by {string} of the page")
	public void validate_search_by_of_the_page(String Exptitle) {
	    //String Acttitle = data.w.getTitle();
	    //boolean ans = Acttitle.contains(Exptitle);
	   //Assert.assertEquals(ans, true);
		f.VerifyTitle(Exptitle);
		
	}

}
