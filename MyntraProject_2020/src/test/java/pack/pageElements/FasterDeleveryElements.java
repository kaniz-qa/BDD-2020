package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FasterDeleveryElements {

	
	
	
	@FindBy(xpath = "//a[contains(text(),'Essentials')]")
	public WebElement essentialMenu;
	
	@FindBy(xpath = "//a[contains(text(),'Haircare')]")
	public WebElement haircareSubmenu;
	
		
	@FindBy(xpath = "//div[@class='sort-sortBy']")
	public WebElement sortBy;
	
	@FindBy(xpath = "//label[contains(text(),'Faster Delivery')]")
	public WebElement fasterDeleveryDD;
	
	
	@FindBy(xpath = "//input[@placeholder='Enter pincode']")
	public WebElement pincode;
	
	@FindBy(xpath = "//input[@class='modal-check']")
	public WebElement chkBtn;
	
	@FindBy(xpath = "//p[@class='index-infoBig']")
	public WebElement notFindingMsg;
	
	
}
