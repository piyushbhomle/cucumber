@BackgroundvsHooks
Feature: Observing differences between Background and hooks

Background: Investment App
Given I am trying to invest my money in Mutual funds
And I decided to create a profile in an investment app
When I verified my KYC successfully

@Scenario1 
Scenario: This is first scenario Background and hooks
Then I am able to invest in mutual funds

@Scenario2
Scenario: This is first scenario Background and hooks
Then I am able to invest in bonds

@Scenario3
Scenario: This is first scenario Background and hooks
Then I am able to invest in FD

@Scenario4
Scenario: This is first scenario Background and hooks
Then I am able to invest in DigitalGold

