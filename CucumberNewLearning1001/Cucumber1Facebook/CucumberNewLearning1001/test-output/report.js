$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/User/Desktop/Documents Folder/SeleniumLearning/CucumberNewLearning1001/src/test/java/featureFile/fileFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Facebook Login feature",
  "description": "",
  "id": "facebook-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 2,
      "value": "#\twithout example keyword"
    },
    {
      "line": 3,
      "value": "#\tScenario: Facebook Login Test_Scenario"
    },
    {
      "line": 4,
      "value": "#\tGiven User is already on Login Page"
    },
    {
      "line": 5,
      "value": "#\tWhen title of login page is facebook"
    },
    {
      "line": 6,
      "value": "#\tThen User enters \"junpyojandidogs@gmail.com\" and \"Knivetha@16\""
    },
    {
      "line": 7,
      "value": "#\tThen user clicks on LogIn button"
    },
    {
      "line": 8,
      "value": "#\tAnd user is on home page"
    }
  ],
  "line": 10,
  "name": "Facebook Login user",
  "description": "",
  "id": "facebook-login-feature;facebook-login-user",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "User is already on Login Page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "title of login page is facebook",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "junpyojandidogs@gmail.com",
        "Knivetha@16"
      ],
      "line": 15
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user clicks on LogIn button",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_already_on_login_page()"
});
formatter.result({
  "duration": 14989822519,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_login_pages()"
});
formatter.result({
  "duration": 11482134,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.enter_user_pass(DataTable)"
});
formatter.result({
  "duration": 721289152,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_logIn_Button()"
});
formatter.result({
  "duration": 9708549974,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_home_page()"
});
formatter.result({
  "duration": 1059259305,
  "status": "passed"
});
});