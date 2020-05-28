Feature:  Myntra close category Verification
         This feature will test the close button of Myntra homepage.
         
 Background: 
   Given Myntra Homepage is launched.

  @Sprint1 @Sanity
  
  Scenario: Verify category close button of Myntra homepage is working successfully.
  
  When Customer mouse over on kids menu
	And  Click on H&M from brand section
	And Click on more link from category section
	And Check swim shirt 
	And Click on close icon
	Then Customer can show all swimshirts
  