
Feature: Add to cart validation


  Scenario Outline: Add to cart 
    Given Open the TestMe app Homepage
    When Click the SignIn 
    Then User enters the username "<username>"
    Then User enters the password "<password>"
    Then User clicks login
    And Search "head" in the find details
    And Click find Details
    Then Click the Add to Cart icon
   
 Examples: 
      | username | password | 
      | Lalitha | Password123|