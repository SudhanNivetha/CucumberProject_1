Feature: createuser

 Scenario Outline: Facebook Login Test_Scenario

Given User is already on Create new account Page
Then User enters "<firstname>","<lastname>","<mnumber>","<npassword>"
Then user selects "<day>","<month>","<year>"
And user click on register button 

 
 Examples:
 |firstname|lastname|mnumber|npassword|day|month|year|
 |jandima|junpyoma|9698437070|Knivetha@16|16|Feb|1990|
