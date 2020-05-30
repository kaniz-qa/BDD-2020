package pack.pageElements;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoryArrayElements {

	
	
	
	@FindBy(className = "common-checkboxIndicator")
	public List<WebElement> sweatshirt;
	
	@FindBy(className ="filter-summary-filter")
	public WebElement sweatshirtText;
}
