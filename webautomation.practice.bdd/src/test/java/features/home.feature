@FunctionalTest

Feature:home.feature

  Scenario: ContactUs text
    Given user is already on home page
    When get text from CotactUs
    Then bat should have text