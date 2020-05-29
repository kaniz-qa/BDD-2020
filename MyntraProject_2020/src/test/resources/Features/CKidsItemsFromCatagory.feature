@Third
Feature: Verify category-more feature of Kids menu.
This feature will verify if customer is able to see more items from kids menu of more category link
  
  Background:
  
   Given Myntra Homepage is launched.
   
  @Sprint1 @Sanity 
  Scenario: Verify catagory close button of kids item working successfully.
  
    When Customer mouse over on kids menu
    And  Click on H&M from brand section
    And Click on more link from category section
    And Check sweat shirt 
    And Click on close icon
    Then Customer can show all swimshirts
    

