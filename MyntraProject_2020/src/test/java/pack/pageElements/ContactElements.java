package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactElements {

	
	
	@FindBy(xpath = "//div[@id='mountRoot']")
	public WebElement image;
	
	@FindBy(xpath = "//div[@class='desktop-contact']//a[contains(text(),'Contact Us')]")
	public WebElement contactUs;
	
	@FindBy(xpath = "//div[@class='dheader-headerText']")
	public WebElement helpText;
}
