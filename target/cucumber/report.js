$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/BankAccount.feature");
formatter.feature({
  "line": 2,
  "name": "Validating TechFios User With Login Functionalities",
  "description": "",
  "id": "validating-techfios-user-with-login-functionalities",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@BackAccountscenario"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "User should able to login and create an BankAccount",
  "description": "",
  "id": "validating-techfios-user-with-login-functionalities;user-should-able-to-login-and-create-an-bankaccount",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 10,
  "name": "User enter their \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on signin button on the page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should be verified land on Dashboard Page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on Bank and Cash tab",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User click on New Account tab",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User Should verify and land on NewAccount Page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User typein the \"\u003caccountTitle\u003e\"and\"\u003cdescription\u003e\"and \u003cinitialBalance\u003e and \u003caccountNumber\u003e and \"\u003ccontactPerson\u003e\" and \u003cphone\u003e and \"\u003cinterBankingUrl\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User clicks on submit button on the page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should verify is account created is true",
  "keyword": "Then "
});
formatter.examples({
  "line": 20,
  "name": "",
  "description": "",
  "id": "validating-techfios-user-with-login-functionalities;user-should-able-to-login-and-create-an-bankaccount;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "interBankingUrl"
      ],
      "line": 22,
      "id": "validating-techfios-user-with-login-functionalities;user-should-able-to-login-and-create-an-bankaccount;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "Launch5",
        "NewLaunchAccount1",
        "10000",
        "2473910",
        "Vivek",
        "8483918616",
        "chase"
      ],
      "line": 23,
      "id": "validating-techfios-user-with-login-functionalities;user-should-able-to-login-and-create-an-bankaccount;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3825649600,
  "status": "passed"
});
formatter.before({
  "duration": 2328933400,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User should be on techfios login page first and create an account",
  "keyword": "Given "
});
formatter.match({
  "location": "BankAccounrStepdef.user_should_be_on_techfios_login_page_first_and_create_an_account()"
});
formatter.result({
  "duration": 1363350400,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "User should able to login and create an BankAccount",
  "description": "",
  "id": "validating-techfios-user-with-login-functionalities;user-should-able-to-login-and-create-an-bankaccount;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@BackAccountscenario"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "User enter their \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on signin button on the page",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User should be verified land on Dashboard Page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User click on Bank and Cash tab",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User click on New Account tab",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User Should verify and land on NewAccount Page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User typein the \"Launch5\"and\"NewLaunchAccount1\"and 10000 and 2473910 and \"Vivek\" and 8483918616 and \"chase\"",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "User clicks on submit button on the page",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "User should verify is account created is true",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 18
    },
    {
      "val": "abc123",
      "offset": 42
    }
  ],
  "location": "BankAccounrStepdef.user_enter_their_and(String,String)"
});
formatter.result({
  "duration": 246004400,
  "status": "passed"
});
formatter.match({
  "location": "BankAccounrStepdef.user_clicks_on_signin_button_on_the_page()"
});
formatter.result({
  "duration": 1939504400,
  "status": "passed"
});
formatter.match({
  "location": "BankAccounrStepdef.user_should_be_verified_land_on_Dashboard_Page()"
});
formatter.result({
  "duration": 9793300,
  "status": "passed"
});
formatter.match({
  "location": "BankAccounrStepdef.user_click_on_Bank_and_Cash_tab()"
});
formatter.result({
  "duration": 72717700,
  "status": "passed"
});
formatter.match({
  "location": "BankAccounrStepdef.user_click_on_New_Account_tab()"
});
formatter.result({
  "duration": 1195548200,
  "status": "passed"
});
formatter.match({
  "location": "BankAccounrStepdef.user_Should_verify_and_land_on_NewAccount_Page()"
});
formatter.result({
  "duration": 9370800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Launch5",
      "offset": 17
    },
    {
      "val": "NewLaunchAccount1",
      "offset": 29
    },
    {
      "val": "10000",
      "offset": 51
    },
    {
      "val": "2473910",
      "offset": 61
    },
    {
      "val": "Vivek",
      "offset": 74
    },
    {
      "val": "8483918616",
      "offset": 85
    },
    {
      "val": "chase",
      "offset": 101
    }
  ],
  "location": "BankAccounrStepdef.user_typein_the_and_and_and_and_and_and(String,String,int,int,String,int,String)"
});
formatter.result({
  "duration": 766461800,
  "status": "passed"
});
formatter.match({
  "location": "BankAccounrStepdef.user_clicks_on_submit_button_on_the_page()"
});
formatter.result({
  "duration": 931248500,
  "status": "passed"
});
formatter.match({
  "location": "BankAccounrStepdef.user_should_verify_is_account_created_is_true()"
});
