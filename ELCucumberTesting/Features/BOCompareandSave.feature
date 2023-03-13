Feature: Backoffice Compare and Save Module testing

Scenario: Verify the UI of Compare and Save text in the Primary Management menu
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
Then It should display the menu options that also includes Compare and Save
And Close the Browser


Scenario: Functionality of Compare and Save menu option
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
Then It shuould navigate to the Compare and Save page
And Close the Browser

Scenario: Click on Add New Button
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
And Click on the Add New button
Then It should display the Add New Modal page
And Close the Browser

Scenario: Create New Compare and save Category
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
And Click on the Add New button
And Enter the details inside the fields and click on submit button
Then It should create new Compare and Save category and display the success message
And Close the Browser


Scenario: Create Compare and save without providing the data
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
And Click on the Add New button
And Without entering the details click on submit button
Then It should an error messages under the fields
And Close the Browser

Scenario: Open Compare and save Category
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
And Click on View Deatils button
Then It should display the category respective category
And Close the Browser

Scenario: Edit Compare and save
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
And Click on View Deatils button
And Change the details and click on submit button
Then It should display the Update Success toast message 
And Close the Browser



Scenario: Functionality of Template button
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
And Click on the Template button
Then It should display as Download and Import options
And Close the Browser

Scenario: Downloading the Default document
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
And Click on the Template button
And Click on the Download button
Then It should download the document
And Close the Browser

Scenario: Functionality of Import button
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
And Click on the Template button
And click on Import button
Then It should display the Import modal page
And Close the Browser

@smoke
Scenario: Upload the Csv Document
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
And Click on the Template button
And click on Import button
And Upload the document
Then It should the listing
And Close the Browser

@smoke
Scenario: Upload the Csv Document with Duplicate entries
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
And Click on the Template button
And click on Import button
And Upload the document with dulicate entries
Then It should display an error message as duplicate entries
And Close the Browser


Scenario: Upload the csv document of different module
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
And Click on the Template button
And click on Import button
And Upload the document of different module
Then It should display an error message as keys dont match
And Close the Browser


Scenario: Upload the empty default document
Given User should login to the EL Backoffice
When Click on the Primary Management menu 
And Click on the Compare and Save button
And Click on the Template button
And click on Import button
And Upload the empty default document
Then It should display an error message as empty file
And Close the Browser
