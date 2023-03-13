Feature: Page Navigation in Different pages

Scenario: Successfull page navigation
Given User launched chrome browser
When user opens signIn url "https://dev-app.elderlylife.co.uk/"
And click on signIN link
And User should sign in to the account email as "charanss5@gmail.com" password as "12345678" 
And Navigate to dashboard page
Then 
And Close the browser


