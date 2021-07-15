
@wip
Feature: Login with different credentials

  User Story : As a user I should be able to login with different credentials


  @lib20
  Scenario: Login as librarian 20
    Given user is on the login page
    When user enters librarian username "librarian20@library"
    And user enters librarian password "XXJTMgzA"
    And user clicks the sign in button
    Then there should be 5559 users
    And user should see the dashboard tab


 @student20
  Scenario: Login as student 20
    Given user is on the login page
    When user enters student username "student20@library"
    And user enters student password "KH8sN9WC"
    And user clicks the sign in button
    Then user should see the books tab


   @lib
    Scenario: Login as librarian in the same line
    Given user is on the login page
    When user enters librarian username "librarian20@library" and password "XXJTMgzA"
    And user clicks the sign in button
    Then there should be 5559 users
    And user should see the dashboard tab

