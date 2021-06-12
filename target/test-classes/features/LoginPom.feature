Feature: Validating TechFios User With Login Functionalities part1

Background: 
Given User should be on techfios login page

Scenario Outline: User should able login with valid credentials
When User enter "<username>" and "<password>"  
And User clicks on signin button
Then User should land on Dashboard Page

Examples:
|username         |password|
|demo@techfios.com|abc123|

 