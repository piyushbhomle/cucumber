@Rediff
Feature: Validating Rediff LoginLogout
  I want to Validate the login and logout of RediffMail

  @Login
  Scenario: This is login scenario of Rediff
    Given I Open a Chrome Browser
    And I enter the Url in the address bar 
    Then I click sign on link
    And I enter RediffMail page
    And  I Enter correct user name and password 
    Then I click sign in button
    And I Check if I am in the Inbox Page of RediffMail
    
    @Logout
    Scenario: This Is Logout Scenario of RediffMail
    Given I am inside the inbox Page 
    And I Validate the presence of the Logout linkS
    When I click on the Logout Link 
    Then I am Logged out of RediffMail
    And I can Validate the presence of RediffHome link 
    
   

 