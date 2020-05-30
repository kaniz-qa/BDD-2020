package pack.stepDefn;

import cucumber.api.java.en.*;
import pack.pageAcions.CategoryArrayActions;

public class CategoryArraylisttepDef {

	
	CategoryArrayActions caategoryArrAction = new CategoryArrayActions();
	
	@When("^click on sweatshirt$")
	public void click_on_sweatshirt() throws Throwable {
		caategoryArrAction.categoryList();
	}

	@Then("^display all sweatshirts$")
	public void display_all_sweatshirts() throws Throwable {
		caategoryArrAction.categoryDisplay();
	}
}
