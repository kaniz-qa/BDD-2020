package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KidsItemMoreItem {

	@FindBy (xpath ="//a[@class='desktop-main'][contains(text(),'Kids')]")
	public WebElement kidsmenutab;
	@FindBy (xpath ="//a[contains(text(),'H&M')]")
	public WebElement kidsbrand;
		
	@FindBy(xpath ="//div[@class='categories-more']")
	public WebElement morelink;
	
	@FindBy (xpath ="//ul[@class='FilterDirectory-list']//label[contains(@class,'common-customCheckbox')][contains(text(),'Sweatshirts')]")
	public WebElement sweetshrtbtn;
	
	@FindBy (xpath ="//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")
	public WebElement closebtn;
	@FindBy (xpath ="//h1[@class='title-title']")
	public WebElement textitem;
}
