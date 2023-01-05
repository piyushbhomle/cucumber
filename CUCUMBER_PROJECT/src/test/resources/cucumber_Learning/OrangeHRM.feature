@OrangeHRM
Feature: I want to test login Functionality of orangeHRM

Background: I am giving common step to run before all scenarios
Given I navigate to the login page 
And I submit correct username and password
When I click on th submit button 

@LoginHRM
Scenario: Login cenario of OrangeHRM
Then I am logged in

@LogoutHRM
Scenario: Logout scenario of OrangeHRM
Then I am inside the homepage
And I validate the presence of logout link


