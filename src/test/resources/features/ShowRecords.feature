Feature: Show records feature


  Scenario: verify show records dropdown values
    Given user is on the login page
    When user enters valid librarian username and password
    And user clicks on Users link
    Then show records default value should be 10
    And show records should have the following options:

      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |
