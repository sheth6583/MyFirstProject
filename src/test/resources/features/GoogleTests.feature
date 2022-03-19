Feature: Login Action

Scenario: Successful login with valid credentials
Given I am on Home page
When  I navigate to Login page
And   I enter  username and  password
Then  Message display login successfully

Scenario: Successful LogOut
When I logout frome the Application
Then Message display logout successfully