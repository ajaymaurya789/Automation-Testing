package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class uploadimage {

	public static void main(String[] args) throws Exception {
		WebDriver w =new ChromeDriver();
//		w.get("https://tus.io/demo");
//		Thread.sleep(2000);
//		w.findElement(By.id("P0-0")).sendKeys("C:\\Users\\Ajay\\Downloads\\img 1.jpg");
//	
		w.get("https://cloudconvert.com/");
 
		Thread.sleep(2000);
		w.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div/div[2]/div/div/input")).sendKeys("C:\\Users\\Ajay\\Downloads\\img 1.jpg");
//	

	}

}
