Feature: maplogin feature
Scenario: mapLogin user

Given User is on Login Page
When title1 of login page is facebook
Then User enters username1 and password1
|username1|password1|
|junpyojandidogs@gmail.com|Knivetha@16|

Then clicks on LogIn button  
And user is at home page
