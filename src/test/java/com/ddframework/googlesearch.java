package com.ddframework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class googlesearch {

	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeDriver w =new ChromeDriver();
		w.get("https://www.google.com/");
		FileInputStream fis = new FileInputStream("C:\\Users\\Ajay\\OneDrive\\Desktop\\frameworkdemo.xlsx");
		@SuppressWarnings("resource")
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = work.getSheet("Sheet1");
		for(int i=1;i<=6;i++)
		{
			XSSFRow row = sheet1.getRow(i);
			XSSFCell data = row.getCell(0);
			w.findElement(By.id("APjFqb")).sendKeys(data.toString(),Keys.ENTER);
			Thread.sleep(3000);
			w.findElement(By.id("APjFqb")).clear();
			
		}
		w.quit();
		
		// TODO Auto-generated method stub

	}

}
