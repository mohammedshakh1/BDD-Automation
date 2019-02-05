@login
Feature: Login Feature


  Scenario Outline: Login with invalid credentials
    Given User has to be in log in page
    When Try log in by invalid "<userName>" and "<password>"
    Then Unable to log in
    Examples:
      | userName     |password|
      |asif123@gmail.com|asif123|
      |shakh123@gmail.com|asif12|



  Scenario: Login with invalid credentials
    Given  User is in login page
     #When   Enter invalid email and password
    When   Enter invalid email and password from Data Table
      | userName             | password |
      | bddd@gmail.com | abcd1 |
      | as123@gmail.com | abc3  |

    Then   Error message appear
