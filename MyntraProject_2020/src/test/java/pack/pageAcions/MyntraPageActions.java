package pack.pageAcions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import pack.Utilities.SetupDriver;
import pack.pageElements.MyntraPageElements;

public class MyntraPageActions {

	MyntraPageElements searchElements;

	public MyntraPageActions() {
		this.searchElements = new MyntraPageElements();
		PageFactory.initElements(SetupDriver.chromeDriver, searchElements);
	}

	public void getHomePage() {

		SetupDriver.chromeDriver.get("https://www.myntra.com/");
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	public void searchTextbox() {
		searchElements.searchText.clear();
		searchElements.searchText.sendKeys("T-shirt");
		// searchElements.searchText.sendKeys(Keys.ENTER);
	}

	public void pressEnter() {
		searchElements.searchText.sendKeys(Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor) SetupDriver.chromeDriver;
		js.executeScript("window.scrollBy(0,400)", "");

	}

	public String displayedItem() {

		String tshirtText = searchElements.searchItemDisplay.getText();

		return tshirtText;

	}

	public void imageLink() {
		searchElements.firstImage.click();

		for (String winHandle : SetupDriver.chromeDriver.getWindowHandles()) {
			SetupDriver.chromeDriver.switchTo().window(winHandle);
		}
		// searchElements.newPage.sendKeys(Keys.CONTROL +"\t");

	}

	// System.out.println("----------new page-----------");
	//JavascriptExecutor executor = (JavascriptExecutor)SetupDriver.chromeDriver;
	//executor.executeScript("arguments[0].click();", searchElements.size);

	/*
	 * Actions action = new Actions(SetupDriver.chromeDriver);
	 * action.moveToElement(searchElements.size); action.build();
	 * 
	 * action.perform(); action.click();
	 */

	public void newPage() {

		try {
			searchElements.size.click();  // use arraylist
			searchElements.addToBag.click();
			searchElements.goToBag.click();
			searchElements.placeOrder.click();

		} catch (Exception e) {
			System.out.println(" elements not found ");
		}

	}

}
