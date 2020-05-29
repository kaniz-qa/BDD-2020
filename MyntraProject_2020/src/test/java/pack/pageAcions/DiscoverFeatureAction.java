package pack.pageAcions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pack.Utilities.SetupDriver;
import pack.pageElements.DiscoverPageElements;

public class DiscoverFeatureAction {
	
	DiscoverPageElements elmnt;
	Actions action = new Actions(SetupDriver.chromeDriver);
	JavascriptExecutor js =(JavascriptExecutor)SetupDriver.chromeDriver;
	
   public  DiscoverFeatureAction() {
	   this.elmnt = new DiscoverPageElements();
	   PageFactory.initElements(SetupDriver.chromeDriver, elmnt);
	   
   }
   public void homenLivingTab() {
	   action.moveToElement(elmnt.hometab).build().perform();
   }
   public void selectCurtain() throws Exception {
	   Thread.sleep(3000);
	   elmnt.curtainsbtn.click();
   }
   
   public void clickWishlist() throws Exception {
	   for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
			SetupDriver.chromeDriver.switchTo().window(winHandle);
	   }
	   Thread.sleep(3000);
	  // action.moveToElement(elmnt.wishlistbtn).build().perform();
	   //elmnt.wishlistbtn.click();
	   js.executeScript("arguments[0].click();", elmnt.wishlistbtn); 
   }
   public void clickDiscoverLink() throws Exception {
	   for (String winHandle : SetupDriver.chromeDriver.getWindowHandles() ) {
			SetupDriver.chromeDriver.switchTo().window(winHandle);
		}
	   Thread.sleep(3000);
	   action.moveToElement(elmnt.discoverbtn).build().perform();
	   elmnt.discoverbtn.click();
   }
   public String getpageTitle() throws Exception {
	   Thread.sleep(3000);
	   String pageTitle = SetupDriver.chromeDriver.getTitle();
	   return pageTitle;
   }
   
   
}
