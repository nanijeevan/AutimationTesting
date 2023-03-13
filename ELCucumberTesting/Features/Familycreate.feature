
Feature: EL Family creation

Scenario: Successful Family Creation
Given User launched chrome browser
When user opens signIn url "https://dev-app.elderlylife.co.uk/"
And login to the application
Then Navigate to the create account plan page
And Create the family
