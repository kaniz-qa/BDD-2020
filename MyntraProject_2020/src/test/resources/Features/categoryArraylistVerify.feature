Feature:  Myntra category list Verification
         This feature will test the category list  of Myntra homepage.
         
 Background: 
   Given Myntra Homepage is launched.

  @Sprint1 @Sanity
  
  Scenario: Verify category list of Myntra  is working successfully.
  
 
  When Customer mouse over on kids menu
	And  Click on H&M from brand section
	
	
	And 	click on sweatshirt
	
	Then 	display all sweatshirts
