#Author-Palak Tiwari
#Date-11-10-2022

Feature: feature to test login funtionality

@Smoke @Regression
Scenario: test to check successful login
Given open the login page url
When Enter the username and password
And Click on the login button
Then user is navigated to homepage

@Regression
Scenario: test to check unsuccessful login
Given open the login page url
When Enter the wusername and wpassword
And Click on the login button
Then user is navigated to homepage

@Regression #just to pass parameterized values we will use scenario outline
Scenario Outline: test to check parametrized login
Given open the login page url
When Enter the "<user>" and "<pass>"
And Click on the login button
Then user is navigated to homepage
Examples:
|user|pass|
|admin|password|

