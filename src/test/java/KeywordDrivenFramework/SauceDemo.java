package KeywordDrivenFramework;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SauceDemo {

	public static void main(String[] args) throws Exception {
		WebDriver w = new ChromeDriver();
		w.get("https://www.saucedemo.com/");
		w.manage().window().maximize();
		RepoOfSaucedemo r = new RepoOfSaucedemo(w);
		FileInputStream fis = new FileInputStream("C:\\Users\\Ajay\\Downloads\\Sauce demo.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheet("Sheet1");
		for (int i=1;i<=10;i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell teststep = row.getCell(0);
			
			switch (teststep.toString()) {
			case "Enter Username and Password":
				Thread.sleep(2000);
				r.username("standard_user");
				Thread.sleep(2000);
				r.password("secret_sauce");
				break;
			case "Click on login button":
				Thread.sleep(2000);
				r.login();
				break;
			case "Click on add to cart button":
				Thread.sleep(2000);
				r.addtocart();
				break;
			case "go to cart":
				Thread.sleep(2000);
				r.gotocart();
				break;
			case "Click on checkout Button":
				Thread.sleep(2000);
				r.checkout();
				break;
			case "Enter Firstname,Lastname and Pincode":
				Thread.sleep(2000);
				r.firstname("Ajay");
				Thread.sleep(2000);
				r.lastname("Maurya");
				Thread.sleep(2000);
				r.postcode("400603");
				break;
			case "Click on Continue Button":
				Thread.sleep(2000);
				r.Continue();
				break;
			case "Click on Finish Button":
				Thread.sleep(2000);
				r.finish();
				TakesScreenshot tss = (TakesScreenshot) w;
				FileHandler.copy(tss.getScreenshotAs(OutputType.FILE),new File("./src.png"));
				break;
			case "Click on Menu Button":
				Thread.sleep(2000);
				r.menu();
				break;
			case "Click on Logout":
				Thread.sleep(2000);
				r.logout();
				break;
			default:
				System.out.println("Invalid Test step or Invalid Keyword");
				break;
			}
			
			
			
		}
		
		
		
		
		

	}

}
