package pack.pageElements;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CloseElements {

	
	//nav[@class='desktop-navbar']
	//@FindBy(xpath = "//nav[@class='desktop-navbar']")
	//public List<WebElement> kidsMenu;
	
	@FindBy(xpath = "//a[@class='desktop-main'][contains(text(),'Kids')]")
	public WebElement kidsMenu;
	

	@FindBy(xpath = "//a[@class='desktop-categoryLink'][contains(text(),'H&M')]")
	public WebElement brand;
	

	@FindBy(xpath = "//div[@class='categories-more']")
	public WebElement moreLink;
	

	@FindBy(xpath ="//li[contains(@class,'FilterDirectory-listTitle')][contains(text(),'b')]")
	public List<WebElement> chkItem;
	
	
	//@FindBy(xpath = "//label[contains(text(),'Nightdress')]")
	//public WebElement chkItem;
	

	@FindBy(xpath = "//span[@class='myntraweb-sprite FilterDirectory-close sprites-remove']")
	public WebElement closeIcon;
	

	@FindBy(xpath = "//h1[@class='title-title']")
	public WebElement textMsg;
}
