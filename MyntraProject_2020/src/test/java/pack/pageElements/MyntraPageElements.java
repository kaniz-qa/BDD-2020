package pack.pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyntraPageElements {

	
	
	@FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
	public WebElement searchText;
	
			
	@FindBy(xpath = "//h1[@class='title-title']")
	public WebElement searchItemDisplay;
	
	
	
	@FindBy(xpath = "//li[9]//a[1]//div[1]//div[1]//div[1]//div[1]//picture[1]//img[1]")
	public WebElement firstImage;
	//li[1]//a[1]//div[1]//div[1]//div[1]//div[1]//picture[1]//img[1]
	
	
		
	@FindBy(xpath = "//*[@id=\"desktopSearchResults\"]/div[2]/section/ul/li[1]/a")
	public WebElement newPage;
		
	//@FindBy(xpath ="//button[@class='size-buttons-show-size-chart']")
	//public WebElement size;
	
	
	@FindBy(xpath ="//body//div[@class='application-base']//div//div[1]//div[1]//button[1]")
	public WebElement size;
	
	@FindBy(xpath ="//div[contains(text(),'ADD TO BAG')]")
	public WebElement addToBag;
	
	@FindBy(xpath ="//*[@id=\"mountRoot\"]/div/div/div/main/div[2]/div[2]/div[3]/div/a")
	public WebElement goToBag;
	
	
	@FindBy(xpath ="//*[@id=\"appContent\"]/div/div/div/div/div[2]/div[2]/div[3]")
	public WebElement placeOrder;
	
	
	
}
