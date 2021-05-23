Feature: To login into Leaf taps application

Scenario: Login (Positive)

Given Launch Chrome Browser
When Load URL 'http://leaftaps.com/opentaps'
And Type Username as 'DemoSalesManager'
And Type Password as 'crmsfa'
And Click Login Button
And Verify Login is successful
And Click CRM link
And Click Leads tab

	