
Feature: Create new user feature
In order to add an user to actitime as a valid actitime admin, I want to login to the system successfully.

Scenario: Login successfully

Given Currently in the login page of the actitime applicaion
When I enter valid credentials
Then I should see the overview page
Then I should go to the userlist page
Then Enters user details "<firstname>" and "<lastname>" and "<email>"
Then Successfully added the user 
Then Close the browser


