Feature: Validate if search results are getting displayed

Background: 
Given User is on home page

Scenario: Check if search items are getting shown
When User enters search item "baby toys"
Then Results shown for "baby toys"