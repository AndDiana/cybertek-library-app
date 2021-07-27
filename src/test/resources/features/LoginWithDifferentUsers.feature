Feature: Login with different credentials

  User Story : As a user, I should be able to login with different users using their
  correct emails and passwords. When I login, I should be able to see username
  in the account username section.

  @smoke
  Scenario Outline:
    Given user is on the login page
    When user enters "<username>" and "<password>"
    Then account holder name should be "<name>"



    Examples:

      | name              |  | username            |  | password |
      | Test Student 11   |  | student11@library   |  | tScBPCUr |
      | Test Student 12   |  | student12@library   |  | UC0LC9Hj |
      | Test Student 13   |  | student13@library   |  | zcVbvUWH |
      | Test Student 14   |  | student14@library   |  | 6SW236ia |
      | Test Student 15   |  | student15@library   |  | Tt6UFxnY |
      | Test Student 16   |  | student16@library   |  | VNKw282v |
      | Test Student 17   |  | student17@library   |  | 0UID4kr8 |

      | Test Librarian 13 |  | librarian13@library |  | 9rf6axdD |
      | Test Librarian 14 |  | librarian14@library |  | 87x8afWY |
      | Test Librarian 15 |  | librarian15@library |  | S5Ejblg1 |
      | Test Librarian 16 |  | librarian16@library |  | 8BzUhhaU |
      | Test Librarian 17 |  | librarian17@library |  | tXqOoIOS |
      | Test Librarian 18 |  | librarian18@library |  | rKG2sP88 |



