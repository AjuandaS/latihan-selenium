@Search
  Feature: Search Feature

    Background: Open to Website
      Given User open NSW website
    Scenario Outline: Menu Search Jojonomic
      When User Click Search Field and input Apply for a number plate
      Then User Click menu Find Locations
      Then User click and search "<locations>" on Suburb Locations
      Examples:
        |locations                    |
        |Sydney 2000                  |
        |Sydney Domestic Airport 2020 |

