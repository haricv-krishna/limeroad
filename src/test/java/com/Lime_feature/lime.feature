@smoke
Feature: limeroad shopping

  Scenario: to click shop men
    Given launch url "https://www.limeroad.com/"
    And User clicks shop men button

  Scenario: user selects the product
    Given user clicks shoes

  Scenario: user selects footware brands
    Given user clicks anujab_Official

  Scenario: user selects footware from list
    And user click the the required footware
    And user selects the size of footware
    And user clicks add_to_cart
    Then user clicks buynow
