#Author Masood Sidiqui
Feature: FreeCRM

Background: 
And I login using valid ID and password

@NewContact
Scenario: Add new contact

When I click on contacts and new contact
And I select criteria from title
And I enter First name , middle name and last name
And I select criteria from suffix
And I enter nick name , company name, position , department , supervisor name, assistant , reffered by
And I select criteria from category and status 
And I enter phone, mobile home fone, fax , email and alternative email
And I select chekboxes of receive email, receive sms, allow calls 
And I enter messenger ID 
And I select criteria from messenger network
And I enter skype ID
And I select criteria from source 
And I enter birthday and identifier 
And I enter address title 
And I select criteria from type
And I enter default address, city, state, zip code , country, tags , notes
And I select criteria from contact time zone, filter time zone
And I click save button  
Then I verify my new contact 



