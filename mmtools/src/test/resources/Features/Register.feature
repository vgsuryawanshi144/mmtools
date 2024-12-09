Feature: User Registration

Background:
  Given the user is on the Registration page

Scenario: User registration with valid data
  When the user enters "John", "Doe", "valid@test.com", "Pass@123", and "Pass@123"
  And the "Remember Me" checkbox is checked
  And clicks the "Create Account" button
  Then the user should see Homepage.

Scenario Outline: User registration with invalid data (error for each field)
  When the user enters "<firstName>", "<lastName>", "<email>", "<password>", and "<confirmPassword>"
  And click on the "Remember Me" checkbox.
  And clicks the "Create Account" button
  Then the user should see the following error messages:
  
    | field            | expectedErrorMessage                   |
    | First Name       | "This is a required field."            |
    | Last Name        | "This is a required field."            |
    | Email Address    | "This is a required fiel               |
    | Password         | "This is a required field."            |
    | Confirm Password | "This is a required field."            |

Examples:
  | firstName | lastName | email               | password  | confirmPassword |
  |           | Doe      | invalidemail.com    | Pass@123  | Pass@123        |
  | John      |          | valid@test.com       | short     | short          |
  | John      | Doe      | valid@test.com       | Pass@123  | Mismatch@123   |
