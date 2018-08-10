Feature: Github Login
Registered users should be able to login into their Accounts and view their repositories

Scenario: Valid username and Password
    Given the user wants to access 'https://www.github.com/login'
    When 	the entered username is valid
    And 	the entered password is valid
    Then 	the user must be redirected to his repositories page

Scenario: InValid username and Valid Password
    Given the user wants to access 'https://www.github.com/login' 
    When 	the entered username is Invalid
    And 	the entered password is valid
    Then 	the user must be redirected to 'https://www.github.com/login' to re-enter login credentials 

Scenario: Valid username and InValid Password
    Given the user wants to access 'https://www.github.com/login'
    When 	the entered username is valid
    And 	the entered password is Invalid
    Then 	the user must be redirected to 'https://www.github.com/login' to re-enter login credentials
