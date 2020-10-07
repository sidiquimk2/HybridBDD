#Author: Masood Sidiqui
@Entitlements
Feature: Add entitlements

Background:
Given I logged into OrangeHRM
And OrangeHRM logo is displayed
 
Scenario: Add Entitlements
When I click Leave Module and click add Entitlements
And Add all default employees to FMLA US leave type
And I Enter 50 Entitlement
Then I Confirm that all default employees have new Entitlements added for FMLA US


Scenario: Change Leave Type
When I click Leave Module and click add Entitlements
And Add 1 default employees to any leave type besides FMLA US leave type 
# this is what i entered "Russel Hamilton"); "Vacation US");
And I Enter 50 Entitlement
Then I Confirm that particular default employee has new Entitlements added for new Leave Type

Scenario: Assign Leave
When I click Leave Module and click Assign Leave
And I enter any one of the default employee names
# this is what i entered "Steven Edwards"); "FMLA US
And I select FMLA US
And Balance of 50 should be present for employee
And I select From Date
And I select To Date that does not exceed 50 days
Then I should see that the leave balance has changed based on how many days that was taken

Scenario: Leave Type for unique employee
When I click Leave Module and click Assign Leave
And I enter the unique default employee name who was chosen for a different Leave Type
#this is what i entered "Russel Hamilton"); "Vacation US");
And I select any Leave Type
And Balance of 50 should be present for employee
And I select From Date
And I select To Date that does not exceed 50 days
Then I should see that the leave balance has changed based on how many days that was taken

Scenario: Leave List
When I click Leave Module and click Leave List
And I select From Date that matches the assign leave to default employee
And I select To Date that matches the assign leave to default employee
And I select on All from show leave with the status
And I enter the default employee name
#this is what i entered "Russel Hamilton"
And I select Sub Unit that matches the default employee credentials
Then Click Search
And Verify that default employee name appears
And Verify leave type displayed as FMLA US
And Verify Number of days matches the amount of assigned leave given for default employee

Scenario: LeaveList2
When I click Leave Module and click Leave List
And I select From Date that matches the assign leave to Unique default employee
And I select To Date that matches the assign leave to Unique default employee
And I select on All from show leave with the status
And I enter the Unique default employee name
# this is what i entered: Russel Hamilton"
And I select Sub Unit that matches the Unique default employee credentials
Then Click Search
And Verify that Unique default employee name appears
And Verify leave type displays as the given Leave Type Assigned Unique default employee
And Verify Number of days matches the amount of assigned leave given for Unique default employee



 