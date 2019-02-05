@loginpage

Feature: Multiple creditial check
  Scenario Outline: Check a list of creditials using username and password

    Given Land on Login Page From home Page
    When Try multiple "<username>" and "<password>"
    Then Invalid message appear
    Examples:
      | username          | password |
      | abcdef@gmail.com | ghghfnfn |
      | abcs12@gmail.com  | fhghghg   |
      | asif123@gmail.com   | ghghfddg    |





  Scenario: reading data from data table
    Given Land on lOginPage from HomePage
    When  read data from data table
      | username          | password |
      | abcdef@gmail.com | ghghfnfn |
      | abcs12@gmail.com  | fhghghg   |
      | asif123@gmail.com   | ghghfddg    |

    Then  Invalid alert box should appear