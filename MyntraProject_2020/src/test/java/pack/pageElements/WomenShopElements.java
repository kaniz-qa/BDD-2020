package pack.pageElements;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WomenShopElements {
	@FindBy (xpath ="//a[contains(text(),'Women')]")
	 public WebElement womenTab;
	@FindBy (xpath ="//a[contains(text(),'Shrugs')]")
	 public WebElement shrugTab;
	@FindBy (xpath ="//div[@class='vertical-filters-filters brand-container']")
	 public WebElement brandTab;
	@FindBy (xpath = "//label[contains(text(),'FOREVER 21')]")
	public WebElement selectbrand;
	@FindBy (xpath ="//div[@class='search-searchProductsContainer row-base']")
	public WebElement imagesection;
	@FindBy (xpath ="//li[2]//a[1]//div[1]//div[1]//div[1]//div[1]//picture[1]//img[1]")
	public WebElement imageTab;
	@FindBy (xpath ="//div[@class='pdp-description-container']")
	public WebElement sizesection;
	@FindBy (xpath ="//div[3]//div[1]//button[1]")
	public WebElement sizebtn;
	@FindBy (xpath ="//div[contains(text(),'ADD TO BAG')]")
	public WebElement addtobagbtn;
	@FindBy (xpath ="//div[@class='desktop-base-right']")
	public WebElement bagframe;
	@FindBy (xpath= "//span[@class='myntraweb-sprite desktop-iconBag sprites-headerBag']")
	public WebElement bagbtn;
//	@FindBy (xpath ="//div[contains(@class,'button-base-button')]")
//	public WebElement placeorderbtn;
	@FindBy (xpath ="//button[@class='coupons-base-button']")
	public WebElement applycoupn;
	@FindBy (xpath="//div[contains(@class,'couponsForm-base-applyCouponContainer')]")
	public WebElement textbox;
	@FindBy  (xpath ="//input[@id='coupon-input-field']")
	public WebElement inputtext;
	@FindBy (xpath ="//div[@class='couponsForm-base-applyButton couponsForm-base-enabled']")
	public WebElement clickapply;
	@FindBy (xpath ="//div[contains(@class,'couponsForm-base-errorMessage')]")
	public WebElement errormsg;
	@FindBy (xpath ="//button[@id='applyCoupon']")
	public WebElement applyBtn;
	
}
