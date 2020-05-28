package pack.stepDefn;

import cucumber.api.java.en.*;
import pack.pageAcions.CloseActions;

public class CloseCategoryStepDef {
	
	
	CloseActions closeActions = new CloseActions();

	@When("^Customer mouse over on kids menu$")
	public void customer_mouse_over_on_kids_menu() throws Throwable {
		closeActions.kidsMenu();
		
	}

	@When("^Click on H&M from brand section$")
	public void click_on_H_M_from_brand_section() throws Throwable {
		closeActions.brand();
		
	}

	@When("^Click on more link from category section$")
	public void click_on_more_link_from_category_section() throws Throwable {
		closeActions.moreLink();
		
	}

	@When("^Check swim shirt$")
	public void check_swim_shirt() throws Throwable {
		closeActions.chkItem();
		
	}

	@When("^Click on close icon$")
	public void click_on_close_icon() throws Throwable {
		closeActions.closeIcon();
		
	}

	@Then("^Customer can show all swimshirts$")
	public void customer_can_show_all_swimshirts() throws Throwable {
		
		closeActions.titleText();
	}

}
