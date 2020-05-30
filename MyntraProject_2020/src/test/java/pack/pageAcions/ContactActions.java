package pack.pageAcions;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;

import pack.Utilities.SetupDriver;
import pack.pageElements.ContactElements;

public class ContactActions {

	
	ContactElements contactElements;
	
	public ContactActions() {
		this.contactElements = new ContactElements();
		PageFactory.initElements(SetupDriver.chromeDriver, contactElements);
			
		
	}
	
	
	public void  getHomepage() {
		SetupDriver.chromeDriver.get("https://www.myntra.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
	}
	
	public void image() throws Throwable {
		contactElements.image.click();
		Thread.sleep(3000);
	}

	public void contactUs() throws Throwable {
		((JavascriptExecutor) SetupDriver.chromeDriver)
	     .executeScript("window.scrollTo(0, document.body.scrollHeight)");
		
		contactElements.contactUs.click();
		Thread.sleep(3000);
		
		
		//TakesScreenshot ts = (TakesScreenshot)SetupDriver.chromeDriver;
		
		File src = contactElements.helpTextScreenshot.getScreenshotAs(OutputType.FILE);
		File trgs = new File("ContactUs.png");
		FileUtils.copyFile(src, trgs);
		

		Thread.sleep(3000);

		
		
		
		
		
		
		
		
		
	}

	public String helpText() throws Throwable {
		
		return contactElements.helpText.getText();
		
	}
	
	
}
