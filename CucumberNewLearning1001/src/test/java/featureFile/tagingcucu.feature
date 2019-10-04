Feature: creating a user

@SmokeTest
Scenario: enter a username and password
Given enter valid username and valid password


@RegressionTest
Scenario: enter a username and password
Given enter invalid username and invalid password


@SmokeTest @RegressionTest
Scenario: enter a username and password
Given enter valid username and invalid password



@RegressionTest
Scenario: enter a username and password
Given enter invalid username and valid password
