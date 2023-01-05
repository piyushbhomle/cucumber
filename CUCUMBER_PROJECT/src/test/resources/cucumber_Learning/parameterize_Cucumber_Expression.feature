@OTPValidate
Feature: I want to test OTP

@OTPTest1
Scenario: Looking to validate Login feature of an application
 Given I open a Chrome Browser
 And I enter the url 'http://www.makemytrip.com/'
 Then I click on login button
 And I enter my mobile number 70583
 Then I click on the continue button
 And it sends OTP 41$%123$ in my mobile number 
 But it was a fake OTP