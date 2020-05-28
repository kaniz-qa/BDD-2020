package pack.Utilities;


import cucumber.api.Scenario;
import cucumber.api.java.Before;

public class BeforeActions {
	 

			@Before
			public void beforeActions(Scenario scen){
				System.out.println("===============Driver Initialization================");
				SetupDriver.setupChromeDriver();
				//SetupDriver.setupFirefoxDriver();
				System.out.println(scen.getName());
			}
			
			
		

}
