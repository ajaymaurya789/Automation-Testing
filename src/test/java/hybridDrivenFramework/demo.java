package hybridDrivenFramework;

import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class demo {

	public static void main(String[] args) throws Exception {
		for(int k = 0;k <=10;k++) {
			DesiredCapabilities dc = new DesiredCapabilities();
			dc.setPlatform(Platform.WINDOWS);
			dc.setBrowserName("MicrosoftEdge");
			RemoteWebDriver w =new RemoteWebDriver(dc);
			Thread.sleep(3000);
			w.quit();
		}		
	}
	
}
