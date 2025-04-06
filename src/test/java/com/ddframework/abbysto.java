package com.ddframework;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class abbysto {


	public static void main(String[] args) throws Exception {
		WebDriver w = new FirefoxDriver();
		w.get("https://abyss.to/");
		w.manage().window().maximize();
		FileInputStream fis =new FileInputStream("C:\\Users\\Ajay\\Downloads\\Untitled spreadsheet.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet = work.getSheetAt(0);
		for(int i=1 ; i<=sheet.getLastRowNum(); i++) {
			XSSFRow row = sheet.getRow(i);
			XSSFCell email = row.getCell(0);
			XSSFCell pass = row.getCell(1);
			Thread.sleep(2000);
			try {
				w.findElement(By.partialLinkText("Log in")).click();
			} catch (Exception e) {
			
			}
			Thread.sleep(2000);
			w.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys(email.toString());
			Thread.sleep(2000);
			w.findElement(By.cssSelector("input[placeholder=\"Password\"]")).sendKeys(pass.toString());
			Thread.sleep(2000);
			w.findElement(By.cssSelector("input[type=\"checkbox\"]")).click();
			Thread.sleep(2000);
			w.findElement(By.cssSelector("button.btn.btn-primary.btn-block")).click();
			Thread.sleep(2000);
			try {
				w.findElement(By.partialLinkText("Logout")).click();
			} catch (Exception e) {
				TakesScreenshot tss = (TakesScreenshot) w;
				FileHandler.copy(tss.getScreenshotAs(OutputType.FILE),new File("C:\\Users\\Ajay\\OneDrive\\Desktop\\Ajay Automation\\Automation\\Project\\"+email.toString()+" "+pass.toString()+".png"));
				w.navigate().refresh();
			}
		}
		
		
		
	}

}
