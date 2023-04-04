package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class driverFactory{
	static WebDriver driver=null;
	
	public static void initializezeBrowser(String browserName) {
		
		if(browserName.equalsIgnoreCase("firefox")) {
			//driver = new ChromeDriver();
			driver = new FirefoxDriver();
		}
		
		else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		
		else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		
		else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	

}
