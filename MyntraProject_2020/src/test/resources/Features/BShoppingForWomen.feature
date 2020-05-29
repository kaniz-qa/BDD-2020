@Second
Feature: This feature will test Myntra Women clothing section

  Background: 
   Given Myntra Home page is launched


  @Sprint1 @Sanity 
  
  Scenario: Verify if customer can order womens cloth from Myntra
  
    
    When User mouseover to the Women tab
    And  User selects Shrug from the dropdown items
    And  User mouseover to brand section 
    And  clicks on FOREVER 21 brand 
    And  User clicks on an item from the displayed item
    Then user lands on a new page
    And  User selects the size M 
    And  clicks on ADD TO BAG
    When User click on bag Link
    And  User lands to Cart page and Click on apply link
    And  User enter invalid cupon code
    And  User click apply button of textbox
    And  An error message is displayed
    Then User clicks on the bottom apply link
    
  
