Feature: Datadriven testing

Scenario Outline: El login functionality
Given User should launch the browser and enter the URL
When User Login with emial as "<email>" and password as "<password>"
And click on on login button
Then It should navigate to the User dashboard
And Close the Browser




    Examples: 
      |email|password|
      ||12345678| 
			|gleecustest1@gmail.com|| 
      |gleecustest1@gmail.com|123456789| 
      |gleecustest2@gmail.com|12345678| 
			|gleecustest3@gmail.com|12345678| 
	