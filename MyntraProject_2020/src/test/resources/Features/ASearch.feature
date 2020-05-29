
@First
Feature: Myntra Homepage Search Text Box Verification
         This feature will test the search text box of Myntra homepage.
         
 Background: 
   Given Myntra Homepage is launched.

  @Sprint1 @Sanity 
  Scenario: Verify that items are added to the Bag 
   
    When  Customer types "Tshirts" on search text box
    And   Customer press enter 
    Then  Customer should be able to see searched items successfully.
    
    @Sanity  @Sprint1 
  Scenario Outline: Verify customer can search random items from search text button
    When Customer types random items in the "<Searchbox>" 
    And Customer press enter
    Then Customer should be able to see searched items successfully.

    Examples: 
    
      | Searchbox  | 
      | Shrugs     | 
      | Tops       |

 