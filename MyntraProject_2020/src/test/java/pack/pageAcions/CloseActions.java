package pack.pageAcions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pack.Utilities.SetupDriver;
import pack.pageElements.CloseElements;

public class CloseActions {

	CloseElements closeElements;

	public CloseActions() {
		this.closeElements = new CloseElements();
		PageFactory.initElements(SetupDriver.chromeDriver, closeElements);
	}

	public void getHomePage() {

		//SetupDriver.chromeDriver.get("https://www.myntra.com/");
		SetupDriver.chromeDriver.get("https://www.myntra.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void kidsMenu() {
		Actions action = new Actions(SetupDriver.chromeDriver);
		action.moveToElement(closeElements.kidsMenu);
		//action.build();

		action.perform();
		//action.click();
	}

	public void brand() throws InterruptedException {
		closeElements.brand.click();
		Thread.sleep(3000);
	}

	public void moreLink() throws InterruptedException {
		closeElements.moreLink.click();
		Thread.sleep(3000);
	}

	public void chkItem() throws InterruptedException {
		
		
		for (int i = 38; i < closeElements.chkItem.size(); i++) {
			closeElements.chkItem.get(i).click();
		}
		
		//closeElements.chkItem.click();
		Thread.sleep(3000);
	}

	public void closeIcon() throws InterruptedException {
		closeElements.closeIcon.click();
		Thread.sleep(3000);
	}

	public void titleText() {
		closeElements.textMsg.getText();
	}

}
