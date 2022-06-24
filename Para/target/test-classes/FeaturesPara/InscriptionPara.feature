@Inscription
Feature: Inscription on parashop

 
  Scenario Outline: Inscription
    Given Browser is open
    And User clicks on s enregistrer
    When User enter name <Name>
    And Enter familly name <Familly name>
    And Enter email <Email>
    And Enter telephone <telephone>
    And Enter password <password>
    And Enter confirm password <confirm password>
    And clicks on accept legal mentions
    And clicks on continuer
    Then User is signed in on the website

    Examples: 
      | Name   | Familly name | Email                   | telephone | password | confirm password |
      | jihene | saidene      | test.academy14@yahoo.com|  26555888 | Test123  | Test123          |

      
   Scenario: research as guest 
   Given Browser is open and user on homepage
   When  User choose category
   And   choose sub category 
   And   choose price filter
   And   choose product
   And   click on add to cart 
   And   verify cart 
   Then  the poduct is added to cart
      