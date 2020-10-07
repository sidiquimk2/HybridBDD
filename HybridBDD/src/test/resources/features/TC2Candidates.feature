#Author: Masood Sidiqui
Feature: Candidates

@AddCandidates
Scenario: Add Candidates
Given I logged into OrangeHRM
When I click Recruitment Module and click Candidates
And Click Add
And Enter First, Middle, Last Name
And Enter Email and Contact No
And I see Job Vacancy is displayed
And I enter any Keywords and any Comments
And I select a Date Of Application
And I click Save button
Then I see Candidate appears in Candidates History

@SearchCandidates
Scenario: Search Candidates
Given I logged into OrangeHRM
When I click Recruitment Module and click Candidates
And I Select All from Job Title
And I Select All from Vacancy
And I Select All from the Hiring Manager
And I Select All from Status
And I Enter Candidates Name from the previous entry
And Select Date of Application the previous entry
And Select Methods of Application to Manual
And Click the Search
Then I see Candidate is present

