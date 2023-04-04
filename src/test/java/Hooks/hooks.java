package Hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utils.ConfigReader;
import factory.driverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class hooks {
	WebDriver driver;
	
	// @Before(order=1) / can create multiple hooks and tag it with order=1, 2,3,4 ----
		// @After (order=1) / can create multiple hooks and tag it with order=1, 2,3,4 ----
		// @Before (order=1,value="@Login) // this can be used in order with value tag which to run first 
		
		@Before
		public void hooksNavigate() {
			
			//Properties prop = ConfigReader.initializePrperties();
			//driverFactory.initializezeBrowser(prop.getProperty("browser"));
			driverFactory.initializezeBrowser("firefox");
			driver = driverFactory.getDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//driver.get(prop.getProperty("url"));
			driver.get("https://www.jawaduniversity.online/courses/your-first-course");
			
			System.out.println(" >>>--- Chrome Driver is lanching ----<<<");
		}
		
		@After
		public void hooksTearDown() {
			driver.quit();
			System.out.println(">>>--- the browser is closed ---<<<");
		}
		
		
//		@BeforeStep
//		public void beforeStepHook(Scenario scenario) {
//			System.out.println("=== Printed befre step hooks==="+scenario.getName());
//			
//		}
//		
//		@AfterStep
//		public void afterStepHook() {
//			System.out.println("=== Printed after step hooks===");
//		//-----------------------------------------------------------------------------------------------	
//		}
		
		
		
	

}
