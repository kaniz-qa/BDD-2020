Feature: Myntra contact us Verification
         This feature will contact us of Myntra homepage.
         
 Background: 
   Given Myntra Homepage is launched.

  @Sprint1 @Sanity
  
  Scenario: Verify contact of Myntra  is working successfully.
  
 When 	Customer click on wragon img
	And  	Go down absolutely end of the page and Click on contact us		
	Then 	Shows help desk 
