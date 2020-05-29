package pack.pageAcions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import pack.Utilities.SetupDriver;
import pack.pageElements.WomenShopElements;

public class WomenShopAction {

	WomenShopElements pageelements;
	
	Actions action = new Actions(SetupDriver.chromeDriver);
	JavascriptExecutor js =(JavascriptExecutor)SetupDriver.chromeDriver;
	
	 public WomenShopAction () {
		 this.pageelements = new WomenShopElements();
		 PageFactory.initElements(SetupDriver.chromeDriver, pageelements);
	 }
		public void getMyntraHomePage() {
	
			SetupDriver.chromeDriver.get("https://www.myntra.com");
			SetupDriver.chromeDriver.manage().window().maximize();
			SetupDriver.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}
	public void womenTab() {
	      action.moveToElement(pageelements.womenTab).build().perform();
	}
	public void shrugTab()  {
		pageelements.shrugTab.click();
	}

public void brandsection() {
	    action.moveToElement(pageelements.brandTab).build().perform();
	}
public void brandclick() {
    
	pageelements.selectbrand.click();
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}
public void randomitemclicked()  {
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	action.moveToElement(pageelements.imagesection).build().perform();
	pageelements.imageTab.click();
	
	}
public String newpagedisplayed()  {
	
	String getpagetitle = SetupDriver.chromeDriver.getTitle();
	return getpagetitle;
	}

public void size() {
	
	for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
		SetupDriver.chromeDriver.switchTo().window(winHandle);
	}
	pageelements.sizebtn.click();
	
}

public void AddtoBag() {
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	//pageelements.addtobagbtn.click();
	 js.executeScript("arguments[0].click();", pageelements.addtobagbtn); 
}
public void mouseOver() throws Exception {
	  Thread.sleep(4000);
    action.moveToElement(pageelements.bagbtn).build().perform();
    pageelements.bagbtn.click();
}
public void cartPageApplyCoupon() throws Exception {
	Thread.sleep(6000);
	for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
		SetupDriver.chromeDriver.switchTo().window(winHandle);
	}
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	action.moveToElement(pageelements.applycoupn).build().perform();
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	pageelements.applycoupn.click();

}
public void couponTextbox() throws Exception {
	action.moveToElement(pageelements.textbox).build().perform();
	SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	pageelements.inputtext.clear();
	pageelements.inputtext.sendKeys("wzcq1234nm");
	Thread.sleep(5000);
	
}
public void clickApplyBtn() {
	//action.moveToElement(pageelements.clickapply).build().perform();
	pageelements.clickapply.click();
}
public String errorMsg() {
  return pageelements.errormsg.getText();			
	
}
public void closeButton() throws Exception {
				
	File srcFile = ((TakesScreenshot)SetupDriver.chromeDriver).getScreenshotAs(OutputType.FILE);   

	try {
		FileUtils.copyFile(srcFile, new File("c:\\Users\\silvi\\ErrorMasgscreenshot.png"));
	} 
	catch(IOException e) {
		System.out.println("Screenshot unable");
	}		
	Thread.sleep(5000);
		   pageelements.applyBtn.click();
		 
}
}



