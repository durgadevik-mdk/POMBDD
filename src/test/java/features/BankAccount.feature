@BackAccountscenario
Feature: Validating TechFios User With Login Functionalities 

Background: 
	Given User should be on techfios login page first and create an account 


Scenario Outline: User should able to login and create an BankAccount 

	When  User enter their "<username>" and "<password>" 
	And  User clicks on signin button on the page 
	Then  User should be verified land on Dashboard Page 
	When User click on Bank and Cash tab 
	When User click on New Account tab 
	Then User Should verify and land on NewAccount Page 
	When User typein the "<accountTitle>"and"<description>"and <initialBalance> and <accountNumber> and "<contactPerson>" and <phone> and "<interBankingUrl>" 
	And User clicks on submit button on the page 
	Then User should verify is account created is true 
	
	Examples: 
	
		|username         |password|accountTitle|description       |initialBalance      |accountNumber               |contactPerson   |phone       |interBankingUrl|
		|demo@techfios.com|abc123  |Launch5     | NewLaunchAccount1|10000	            |2473910                     |Vivek           |8483918616  |chase|
		
		
	