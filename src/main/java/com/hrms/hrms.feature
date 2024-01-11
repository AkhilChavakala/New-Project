@VerifyTitle001
Feature: HRMS
Scenario: Verify Title
Given Open Application
When  Verify Title
Then  Close Application
@LoginLogout002
Scenario: LoginLogout
Given Open Application
When  Verify Title
When Login into application
When Logout of application
Then  Close Application
