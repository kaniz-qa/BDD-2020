

Feature: Myntra Homepage Search box Verification
         This feature will test the search button of Myntra homepage.
         
 Background: 
   Given Myntra Homepage is launched.

  @Sprint1 @Sanity
  
  Scenario: Verify search button of Myntra homepage is working successfully.
   
    When Customer enter T-shirt in search textbox
    
    And  Customer press enter from keyboard
    And  Customer should be able to see searched items successfully.
    
    And  Click on first image
    Then It will go next page 

 