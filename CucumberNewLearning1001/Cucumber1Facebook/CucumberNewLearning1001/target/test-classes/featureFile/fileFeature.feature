Feature: Facebook Login feature
#	without example keyword
#	Scenario: Facebook Login Test_Scenario
#	Given User is already on Login Page
#	When title of login page is facebook
#	Then User enters "junpyojandidogs@gmail.com" and "Knivetha@16"
#	Then user clicks on LogIn button  
#	And user is on home page
 	
Scenario: Facebook Login user

Given User is already on Login Page
When title of login page is facebook
Then User enters username and password
|junpyojandidogs@gmail.com|Knivetha@16|
Then user clicks on LogIn button  
And user is on home page

#Examples:
 
 #|username|password|
 #|junpyojandidogs@gmail.com|Knivetha@16|
 #|nayankutty@gmail.com|Knivetha@16|
