  Feature: I access the dominoss app
  Scenario: Add and Remove products
  
    Given I launch url and maximize the site
    When I click on order online
    And  click on enter address and give pincode
    Then Click locate me and first suggestion
    And Click on Veg pizza
    Then Add Caprese Gourmet Pizza
    And Add Margherita
    And Add Peppy Paneer
    Then Click on Beverages
    And Add Pepsi 
   Then Remove Margherita and Pepsi
    And Click Checkout
    
    
    
    
    
    
    
    
    
    