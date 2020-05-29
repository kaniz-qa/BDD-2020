package pack.stepDefn;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.pageAcions.WomenShopAction;

public class WomenShopStepDefn {
	
	
	WomenShopAction newaction = new WomenShopAction();
	
	
	@Given("^Myntra Home page is launched$")
	public void myntra_Home_page_is_launched()   {
		 newaction.getMyntraHomePage();
	     
	}

	@When("^User mouseover to the Women tab$")
	public void user_mouseover_to_the_Women_tab()   {
		 newaction.womenTab();
	     
	}

	@When("^User selects Shrug from the dropdown items$")
	public void user_selects_Shrug_from_the_dropdown_items()   {
	    
		 newaction.shrugTab();
	}


	@When("^User mouseover to brand section$")
	public void user_mouseover_to_brand_section()  {
		newaction.brandsection();
	    
	}

	@When("^clicks on FOREVER (\\d+) brand$")
	public void clicks_on_FOREVER_brand(int arg1)  {
	   newaction.brandclick();
	}


	@When("^User clicks on an item from the displayed item$")
	public void user_clicks_on_an_item_from_the_displayed_item() {
	 newaction.randomitemclicked();
	}
	@Then("^user lands on a new page$")
	public void user_lands_on_a_new_page()   {
		 newaction.newpagedisplayed();
		 String expectedTitle = "Shrugs - Buy Long Shrugs For Women Online - Myntra";
	     String actualTitle   = newaction.newpagedisplayed();
	     
	     Assert.assertEquals(actualTitle, expectedTitle);
	     
	}

	@Then("^User selects the size M$")
	public void user_selects_the_size_M ()   {
	    
		 newaction.size();
	}
	@Then("^clicks on ADD TO BAG$")
	public void clicks_on_ADD_TO_BAG() {
	    newaction.AddtoBag();
	}
	@When("^User click on bag Link$")
	public void user_click_on_bag_Link() throws Exception {
     newaction.mouseOver();
     
	}
	@When("^User lands to Cart page and Click on apply link$")
	public void user_lands_to_Cart_page_and_Click_on_apply_link() throws Exception  {
	    
	    newaction.cartPageApplyCoupon();
	}

	@When("^User enter invalid cupon code$")
	public void user_enter_invalid_cupon_code() throws Exception {
	    newaction.couponTextbox();
	}
	@When("^User click apply button of textbox$")
	public void user_click_apply_button_of_textbox()  {
	   newaction.clickApplyBtn();
	}
	@Then("^An error message is displayed$")
	public void an_error_message_is_displayed() {
		String expectederrosMsg = "Coupon code is not valid";
		System.out.println("Error Message :" + expectederrosMsg);
		String actualErrorMsg = newaction.errorMsg();
		Assert.assertEquals(actualErrorMsg, expectederrosMsg);
		
	}
//	
//	@When("^User takes a screenshoot of the page$")
//	public void user_takes_a_screenshoot_of_the_page() throws Exception  {
//	    newaction.takeScrnsht();
//	  
//	}
	@Then("^User clicks on the bottom apply link$")
	public void user_clicks_on_the_bottom_apply_link() throws Exception {
	   
	   newaction.closeButton();
	}
	

}
