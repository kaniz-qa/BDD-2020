package pack.stepDefn;

import org.testng.Assert;

import cucumber.api.java.en.*;
import pack.pageAcions.FasterDeleveryActions;

public class FasterDeleveryStepDef {
	
	FasterDeleveryActions deleveryAction = new FasterDeleveryActions();
	
	

	@When("^Customer mouse over on essentials menu$")
	public void customer_mouse_over_on_essentials_menu() throws Throwable {
		deleveryAction.essentialMenu();
		
	}

	@When("^Click on haircare$")
	public void click_on_haircare() throws Throwable {
		
		deleveryAction.haircareSubmenu();
	}

	@When("^select faster delevery from sort by drop down list$")
	public void select_faster_delevery_from_sort_by_drop_down_list() throws Throwable {
		deleveryAction.fasterDeleveryDD();
		
	}

	@When("^enter pincode$")
	public void enter_pincode() throws Throwable {
		deleveryAction.pinTextbox();
		
	}

	@When("^click on check button$")
	public void click_on_check_button() throws Throwable {
		deleveryAction.chkBtn();
		
	}

	@Then("^shows msg$")
	public void shows_msg() throws Throwable {
		//deleveryAction.notFinfMsg();
		
		
		
	    
			String displayMessage = deleveryAction.notFinfMsg(); 
			System.out.println(displayMessage);

			boolean bool = false;

			if (displayMessage.equalsIgnoreCase("We couldn't find any matches!")) {
				bool = true;
			}

			Assert.assertEquals(bool, true);
		
	}

}
