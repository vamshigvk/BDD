Feature: Github Login functionality Check

Scenario: User is trying to signin on GitHub using Invalid username and password

Given User is on GitHub login Page
When 	User enters Invalid username and password
Then 	'Incorrect username and password.' Message should display

Scenario: User is trying to signin on GitHub using valid username and passeword

Given User is on GitHub login Page
When 	User enters valid username and password
Then 	User should successfully Signin on his GitHub account