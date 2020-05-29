Feature:  Myntra faster delevery Verification
         This feature will test the faster delevery of Myntra homepage.
         
 Background: 
   Given Myntra Homepage is launched.

  @Sprint1 @Sanity
  
  Scenario: Verify faster delevery of Myntra  is working successfully.
  
 When 	Customer mouse over on essentials menu
	And  	Click on haircare
	And 	select faster delevery from sort by drop down list 
	And 	enter pincode
	And 	click on check button
	Then 	shows msg
