Feature: To create Lead

Background:

Given Launch Chrome Browser
When Load URL 'http://leaftaps.com/opentaps'
And Type Username as 'DemoSalesManager'
And Type Password as 'crmsfa'
And Click Login Button
And Verify Login is successful
And Click CRM link
And Click Leads tab

Scenario Outline: Edit Lead (Positive)

When Click on Find Lead link
And Click on phone number tab
And Type Phone number on search box as <phoneNumber>
And Click on Find Leads button
And Click on first lead record from search result
And Click on Edit button
And Type updated company name as <companyName>
And Click on Update button
Then Verify Lead is created


	Examples:

|phoneNumber|companyName|
|98|Google|
|0|Facebook|
