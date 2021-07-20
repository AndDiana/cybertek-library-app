Feature: Users page table columns
  User Story : As a user, I should be able to login as librarian. WhenI go to Users page,
  table should have following columns:•Actions•UserID•Full Name•Email•Group•Status


  Scenario: Verify users page table columns
    Given user is on the login page
    When user enters valid librarian username and password
    And user clicks on Users link
    Then table should have the following column names:

      | Actions   |
      | User ID   |
      | Full Name |
      | Email     |
      | Group     |
      | Status    |


