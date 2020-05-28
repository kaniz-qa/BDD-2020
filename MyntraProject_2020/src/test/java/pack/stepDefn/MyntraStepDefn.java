package pack.stepDefn;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pack.pageAcions.MyntraPageActions;

public class MyntraStepDefn {
	
	MyntraPageActions searchActions = new MyntraPageActions();
	
	
	@Given("^Myntra Homepage is launched\\.$")
	public void myntra_Homepage_is_launched()  {
		searchActions.getHomePage();
	}

	
	@When("^Customer enter T-shirt in search textbox$")
	public void customer_enter_T_shirt_in_search_textbox()  {
		searchActions.searchTextbox();
	}

	@When("^Customer press enter from keyboard$")
	public void customer_press_enter_from_keyboard()  {
		searchActions.pressEnter();
	}
	
	
	@When("^Customer should be able to see searched items successfully\\.$")
	public void customer_should_be_able_to_see_searched_items_successfully()   {
		
	       
		String displayMessage = searchActions.displayedItem(); 
		System.out.println(displayMessage);

		boolean bool = false;

		if (displayMessage.equalsIgnoreCase("T-shirts For Men & Women")) {
			bool = true;
		}

		Assert.assertEquals(bool, true);
	}

	
	
	@When("^Click on first image$")
	public void click_on_first_image() throws Throwable {
		searchActions.imageLink();
	}

	@Then("^It will go next page$")
	public void it_will_go_next_page() throws Throwable {
		searchActions.newPage();
		
		
	}
	
	
	
	
	
		
		
	}



