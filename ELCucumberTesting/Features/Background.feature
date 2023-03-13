Feature: Background Keyword Testing



Background:
Given User launched chrome browser
When user opens signIn url "https://dev-app.elderlylife.co.uk/"
And click on signup link
Then It should open the create account page


Scenario: Successful Navigation to signup page

And Close the browser



Scenario: Successful account creation with valid credentials

And User enter firstname as "charan" lastname as "kumar" email as "charanss5@gmail.com" password as "12345678" and confirmpassword as "12345678"
And User click on Signup button
Then It should create the account and display the Hurray!! Your Elderly Life account has been successfully created modal page 
And Close the browser


Scenario: Account creation with existing emial id

And User enter firstname as "charan" lastname as "kumar" email as "charanss5@gmail.com" password as "12345678" and confirmpassword as "12345678"
And User click on Signup button
Then It should display an error message as Email is already taken, Please use another emai
And Close the browser

Scenario: Account creation with password lessthan 8digits

And User enter firstname as "charan" lastname as "kumar" email as "charan@gmail.com" password as "123456" and confirmpassword as "12345678"
And User click on Signup button
Then It should display an error message as Please enter a valid password
And Close the browser

Scenario: Account creation with different password and confirm password 

And User enter firstname as "charan" lastname as "kumar" email as "charan123@gmail.com" password as "12345678" and confirmpassword as "123456789"
And User click on Signup button
Then It should display an error message as Please enter the same password you've entered before
And Close the browser


Scenario: Account creation with invalid email format

And User enter firstname as "charan" lastname as "kumar" email as "charan123@gm" password as "12345678" and confirmpassword as "12345678"
And User click on Signup button
Then It should display an error message as This is not a valid email format !
And Close the browser



Scenario: Account creation without giving the credentials

And User click on Signup button
Then It should display an error message as Please enter the required fields
And Close the browser

Scenario: Account creation without Email

And User enter firstname as "charan" lastname as "kumar"  password as "12345678" and confirmpassword as "12345678"
And User click on Signup button
Then It should display an error message as Please enter the required fields
And Close the browser


Scenario: Account creation without Password

And User enter firstname as "charan" lastname as "kumar" email as "charan1123@gm" 
And User click on Signup button
Then It should display an error message as Please enter the required fields
And Close the browser


Scenario: Functionality of Already have an account? Login here link in SignUp page

And User clicks on the the Already have an account? Login here link
Then It should navigate to the SignIn page
And Close the browser
