#Author: Masood Sidiqui
@TC1
Feature: Customers and Report

Background: 
Given I logged into OrangeHRM

@AddCustomer
Scenario: Add Customers

When I am on Time Module
And I click Project info
And I select Customers
And I click on Add button
And Customer Name and Description
And I click Save
Then I see that the customer is displayed in the Customers table

@AddProject
Scenario: Add Project
When I am on Time Module
And I click Project info
And I select Projects
And I click project Add button
And I enter customer name from the previous entry
And I add the project name
And I select Project admin from default employees
And I Click Save button
Then I see project details is saved

@FindProject
Scenario: Find Project
When I am on Time Module
And I click Project info
And I click on Projects
And I enter Customer name from the previous entry
And I enter Project name from the previous entry
And Click on Search
Then My customer name and project name displayed
























