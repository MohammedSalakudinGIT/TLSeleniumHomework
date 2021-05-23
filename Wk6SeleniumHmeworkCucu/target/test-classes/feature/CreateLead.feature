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

Scenario Outline: Create multiple lead

When Click on Create Lead link
And Type CompanyName as <companyName>
And Type FirstName as <firstName>
And Type LastName as <lastName>
Then Click Create Lead button
Then Verify Lead is created

Examples:

|companyName|firstName|lastName|
|Google|Sam|Amin|
|Facebook|Peter|Parker|