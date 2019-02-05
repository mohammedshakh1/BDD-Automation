# new feature
# Tags: optional

@run
Feature: BatPage

 ##Background:
  # Given user is already on home page


  Scenario: Soft Ball
    Given user is already on home page
  When go to bat page
  Then get text from Soft ball and assert



  Scenario: Base Ball
    Given user is already on home page
  When go to bat page1
  Then get text from Bse Ball and assert


  Scenario: Hunting tool

    When get text from Huntin Tool
    Then Assert Text from Huntoing tool