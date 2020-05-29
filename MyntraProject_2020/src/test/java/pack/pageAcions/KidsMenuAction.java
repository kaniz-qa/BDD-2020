package pack.pageAcions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pack.Utilities.SetupDriver;
import pack.pageElements.KidsItemMoreItem;

public class KidsMenuAction {
	
	Actions action = new Actions(SetupDriver.chromeDriver);
	JavascriptExecutor js =(JavascriptExecutor)SetupDriver.chromeDriver;
	KidsItemMoreItem elemnts;
	
	public KidsMenuAction() {
		this.elemnts = new KidsItemMoreItem();
		PageFactory.initElements(SetupDriver.chromeDriver, elemnts);
	}
	public void kidsMenuTab() throws Exception {
		Thread.sleep(2000);
		action.moveToElement(elemnts.kidsmenutab).build().perform();
		
	}
	public void selectBrand() throws Exception {
		Thread.sleep(2000);
		action.moveToElement(elemnts.kidsbrand).build().perform();
		elemnts.kidsbrand.click();
	}
	public void moreLink() throws Exception {
		Thread.sleep(2000);
		action.moveToElement(elemnts.morelink).build().perform();
		elemnts.morelink.click();
	}
	public void checkSweatShirt() throws Exception {
		Thread.sleep(2000);
		action.moveToElement(elemnts.sweetshrtbtn).build().perform();
		elemnts.sweetshrtbtn.click();
	}
    public void closeBtn() throws Exception {
    	Thread.sleep(2000);
    	action.moveToElement(elemnts.closebtn).build().perform();
    	Thread.sleep(2000);
    	elemnts.closebtn.click();
    	Thread.sleep(2000);
    }
    public String itemDisplayed () {
     
     return elemnts.textitem.getText();
    }
}
