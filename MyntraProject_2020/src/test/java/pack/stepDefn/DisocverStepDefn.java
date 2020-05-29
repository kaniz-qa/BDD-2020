package pack.stepDefn;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.pageAcions.DiscoverFeatureAction;

public class DisocverStepDefn {
	
	DiscoverFeatureAction actn = new DiscoverFeatureAction();
	
	
	
	@When("^mouse over on home&living menu$")
	public void mouse_over_on_home_living_menu()  {
	   
	    actn.homenLivingTab();
	}

	@When("^Click on curtains$")
	public void click_on_curtains() throws Exception  {
	   
	    actn.selectCurtain();
	}

	@When("^Click on whishlist from image section$")
	public void click_on_whishlist_from_image_section() throws Exception  {
	   
	    actn.clickWishlist();
	}

	@When("^Click on discover menu link$")
	public void click_on_discover_menu_link() throws Exception  {
	   actn.clickDiscoverLink();
	    
	}

	@Then("^It will display disorder page$")
	public void it_will_display_disorder_page() throws Exception  {
	   
		String actualTitle = actn.getpageTitle();
		   String expectedTitle = "Online Shopping Site - Shop Online for Men, Women & Kids Fashion | Myntra";
		   System.out.println("Items dispalyed successfully : " + expectedTitle);
		   Assert.assertEquals(actualTitle, expectedTitle);
	}


}
