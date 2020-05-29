package pack.stepDefn;

import org.testng.Assert;

import cucumber.api.java.en.*;
import pack.pageAcions.ContactActions;

public class ContactusStepDef {
	
	ContactActions contactAction = new ContactActions();
	
	
	@When("^Customer click on wragon img$")
	public void customer_click_on_wragon_img() throws Throwable {
		contactAction.image();
	}

	@When("^Go down absolutely end of the page and Click on contact us$")
	public void go_down_absolutely_end_of_the_page_and_Click_on_contact_us() throws Throwable {
		contactAction.contactUs();
	}

	@Then("^Shows help desk$")
	public void shows_help_desk() throws Throwable {
		
		

		String displayMessage = contactAction.helpText();
		System.out.println(displayMessage);

		boolean bool = false;

		if (displayMessage.equalsIgnoreCase("Help center")) {
			bool = true;
		}

		Assert.assertEquals(bool, true);
		
		
		
		
	}

}
