package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DiscoverPageElements {
	@FindBy (xpath = "//a[@class='desktop-main'][contains(text(),'Home & Living')]")
	public WebElement hometab;
	
	@FindBy (xpath ="//a[@class='desktop-categoryName'][contains(text(),'Curtains')]")
	public WebElement curtainsbtn;
	@FindBy (xpath ="//li[1]//div[3]//span[1]")
	public WebElement wishlistbtn;
	@FindBy (xpath ="//div[contains(text(),'DISCOVER')]")
	public WebElement discoverbtn;
//	@FindBy ()
//	public WebElement

}
