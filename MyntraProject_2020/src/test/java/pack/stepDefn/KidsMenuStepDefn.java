package pack.stepDefn;

import org.testng.Assert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.Utilities.SetupDriver;
import pack.pageAcions.KidsMenuAction;

public class KidsMenuStepDefn {
	
	KidsMenuAction actn = new KidsMenuAction();
	
	

@When("^Customer mouse over on kids menu$")
public void customer_mouse_over_on_kids_menu() throws Exception  {
	actn.kidsMenuTab();
    
   
}

@When("^Click on H&M from brand section$")
public void click_on_H_M_from_brand_section() throws Exception  {
    actn.selectBrand();
   
}

@When("^Click on more link from category section$")
public void click_on_more_link_from_category_section() throws Exception  {
    
   actn.moreLink();
}

@When("^Check sweat shirt$")
public void check_sweat_shirt() throws Exception  {
	actn.checkSweatShirt();
   
}

@When("^Click on close icon$")
public void click_on_close_icon() throws Exception  {
    actn.closeBtn();
   
}

@Then("^Customer can show all swimshirts$")
public void customer_can_show_all_swimshirts()  {
    
   String actualText = actn.itemDisplayed();
   String expectedText = "H&M Kids Clothing & Footwear";
   System.out.println("Items dispalyed successfully: " + expectedText);
   Assert.assertEquals(actualText, expectedText);
}



}
