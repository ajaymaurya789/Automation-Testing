package hybridDrivenFramework;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ajiodemotest {

	public static void main(String[] args) throws Exception {
		for(int k = 0;k <=5;k++) {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setPlatform(Platform.WINDOWS);
		dc.setBrowserName("chrome");
		
		
		
		RemoteWebDriver w =new RemoteWebDriver(dc);
		w.manage().window().maximize();
		RepoOfAjio a = new RepoOfAjio(w);
		w.get("https://www.ajio.com/");
		FileInputStream fis = new FileInputStream("C:\\Users\\Ajay\\Downloads\\ajiohdf.xlsx");
		XSSFWorkbook work = new XSSFWorkbook(fis);
		XSSFSheet sheet =work.getSheet("Sheet1");
		for (int i=1;i<=sheet.getLastRowNum();i++) {
			XSSFRow Testdata = sheet.getRow(i);
			XSSFCell search = Testdata.getCell(0);
			for (int j=1;j<=4;j++) {
				XSSFRow Teststep = sheet.getRow(j);
				XSSFCell step = Teststep.getCell(1);
				
				switch (step.toString()) {
				case "search the product":
					a.search(search.toString());
					
					break;
				case"click on product":
					a.product();
					a.windowhandle();
					
					break;
				case"click on add to bag button":
					a.AddToBag();
					break;
				case"click on bag icon":
					Thread.sleep(3000);
					a.carticon();
					Thread.sleep(3000);
					a.close();
					a.SwitchtoMainpage();
					
					
					

				default:
					break;
				}
			}
			}
			
		}
		
		

	}

}
