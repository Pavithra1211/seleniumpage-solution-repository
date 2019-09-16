$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/workspace/MyStoreBDD/src/main/java/Features/Mystore.feature");
formatter.feature({
  "line": 1,
  "name": "Validating My Store app",
  "description": "",
  "id": "validating-my-store-app",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Validate create account functionality",
  "description": "",
  "id": "validating-my-store-app;validate-create-account-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Create_Account"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launched the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user creates an account with \u003c\"Email\"\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Account should be created",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "validating-my-store-app;validate-create-account-functionality;",
  "rows": [
    {
      "cells": [
        "Email"
      ],
      "line": 10,
      "id": "validating-my-store-app;validate-create-account-functionality;;1"
    },
    {
      "cells": [
        "Testmail@test.com"
      ],
      "line": 11,
      "id": "validating-my-store-app;validate-create-account-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Validate create account functionality",
  "description": "",
  "id": "validating-my-store-app;validate-create-account-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@Create_Account"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launched the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user creates an account with \u003c\"Email\"\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Account should be created",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});