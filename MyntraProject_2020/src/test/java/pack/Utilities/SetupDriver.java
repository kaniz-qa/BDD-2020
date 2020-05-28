package pack.Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {
	
	
	public static WebDriver chromeDriver;
	//public static WebDriver firefoxDriver;

	public static void setupChromeDriver() {
		//WebDriverManager.chromedriver().version("83.0.4103.61 ").setup();
		WebDriverManager.chromedriver().setup();
		//chromeDriver = new ChromeDriver();
		
	
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		chromeDriver = new ChromeDriver(options);
		
			
	}

	//public static void setupFirefoxDriver() {
		//WebDriverManager.firefoxdriver().setup();
		//firefoxDriver = new FirefoxDriver();
			
	//}
	
	
	  public static WebDriver getChromeDriver() {
		  return chromeDriver;
		  }
	  
	  
	  public static void tearDownChromeDriver() {
		  chromeDriver.quit();
		  }
	 

	//public static WebDriver getFirefoxDriver() {
		//return firefoxDriver;
	//}

	//public static void tearDownFirefoxDriver() {
		//firefoxDriver.quit();
	//}


}
