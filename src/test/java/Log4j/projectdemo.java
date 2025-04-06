package Log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class projectdemo {
	static Logger log;

	public static void main(String[] args) throws Exception {
		log = LogManager.getLogger();
		WebDriver w = new ChromeDriver();
		log.info("user has open chrome driver");
		Thread.sleep(2000);
		
		w.get("https://demo.frontaccounting.eu/");
		log.info("User has opened website");
		Thread.sleep(2000);
		
		w.findElement(By.name("user_name_entry_field")).clear();
		w.findElement(By.name("user_name_entry_field")).sendKeys("demouser");
		
		log.info("User has entered Username");
		Thread.sleep(2000);
		w.findElement(By.name("password")).clear();
		w.findElement(By.name("password")).sendKeys("pasdword");
		
		log.info("User has entered password");
		Thread.sleep(2000);
		w.findElement(By.name("SubmitUser")).click();
		log.info("User has clicked on login button");
		try {
			w.findElement(By.linkText("Logout")).click();
		} catch (Exception e) {
			log.error("User not able to login");
		}
		
		

	}

}
