package pack.Utilities;


import cucumber.api.java.After;

public class AfterActions {

	
	@After
	public void afterActions() {
		SetupDriver.tearDownChromeDriver();
		//SetupDriver.tearDownFirefoxDriver();
	}

}
