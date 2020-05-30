package pack.pageAcions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import pack.Utilities.SetupDriver;
import pack.pageElements.CategoryArrayElements;

public class CategoryArrayActions {

	
	CategoryArrayElements categoryArrEle;
	
	public CategoryArrayActions() {
		this.categoryArrEle = new CategoryArrayElements();
		PageFactory.initElements(SetupDriver.chromeDriver, categoryArrEle);
	}
	
	public void getHomePage() {
		SetupDriver.chromeDriver.manage().window().maximize();
		SetupDriver.chromeDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		SetupDriver.chromeDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	public void categoryList() throws Throwable {
		
		System.out.println("Total category : "+categoryArrEle.sweatshirt.size());
		
		categoryArrEle.sweatshirt.get(2).click();
		Thread.sleep(5000);
		categoryArrEle.sweatshirt.get(1).click();		
		Thread.sleep(5000);
		categoryArrEle.sweatshirt.get(5).click();		
		Thread.sleep(5000);
		categoryArrEle.sweatshirt.get(0).click();		
		Thread.sleep(5000);
	}
		
	
	public void categoryDisplay() {
		categoryArrEle.sweatshirtText.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
}
