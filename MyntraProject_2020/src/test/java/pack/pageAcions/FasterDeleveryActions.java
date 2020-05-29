package pack.pageAcions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import pack.Utilities.SetupDriver;
import pack.pageElements.FasterDeleveryElements;

public class FasterDeleveryActions {

	FasterDeleveryElements deleveryElements;
	
	public FasterDeleveryActions() {
		this.deleveryElements = new FasterDeleveryElements();
		PageFactory.initElements(SetupDriver.chromeDriver, deleveryElements);
	}
	
	
	public void getHomePage() {

		//SetupDriver.chromeDriver.get("https://www.myntra.com/");
		SetupDriver.chromeDriver.get("https://www.myntra.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void essentialMenu() {
		Actions action = new Actions(SetupDriver.chromeDriver);
		action.moveToElement(deleveryElements.essentialMenu);
		//action.build();
		action.perform();
	}

	public void haircareSubmenu() {
		deleveryElements.haircareSubmenu.click();
	}

	public void fasterDeleveryDD() {
		
		
		Actions action = new Actions(SetupDriver.chromeDriver);
		action.moveToElement(deleveryElements.sortBy);
		action.perform();
		
		deleveryElements.fasterDeleveryDD.click();
		
		
		
	}

	public void pinTextbox() throws Exception {
		deleveryElements.pincode.sendKeys("365675");
		Thread.sleep(3000);
	}

	public void chkBtn() throws Exception  {
		deleveryElements.chkBtn.click();
		Thread.sleep(3000);
	}

	public String notFinfMsg() throws Exception {
		return deleveryElements.notFindingMsg.getText();
		//Thread.sleep(3000);
	}

}
