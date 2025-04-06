package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frontaccounting {

	public static void main(String[] args) throws Exception {
		WebDriver w = new FirefoxDriver();
		w.manage().window().maximize();
		w.get("https://demo.frontaccounting.eu/");
		repooffrontaccounting f = new repooffrontaccounting(w);
		f.clearusername();
		f.EnterUsername("DemoUser");
		f.clearpassword();
		f.EnterPassword("password");
		f.Loginbtn();
		f.ClickonSQE();
		f.customer("WWW");
		f.payment("Payment due within 10 days");
		Thread.sleep(2000);
		f.item("Milk");
		f.Clickonadditem();
		f.placeorder();
		Thread.sleep(2000);
		f.VTQ();
		Thread.sleep(2000);
		f.Windowhandle();
		f.SwitchParent();
		f.Logout();
		f.Close();
		

	}

}
