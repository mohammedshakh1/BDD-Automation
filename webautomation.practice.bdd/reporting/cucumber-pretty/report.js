$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("home.feature");
formatter.feature({
  "line": 3,
  "name": "home.feature",
  "description": "",
  "id": "home.feature",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@FunctionalTest"
    }
  ]
});
formatter.before({
  "duration": 4627542576,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "ContactUs text",
  "description": "",
  "id": "home.feature;contactus-text",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is already on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "get text from CotactUs",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "bat should have text",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.user_is_already_on_home_page()"
});
formatter.result({
  "duration": 92288797,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.get_text_from_bat()"
});
formatter.result({
  "duration": 57352343,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.bat_should_have_text()"
});
formatter.result({
  "duration": 20571472,
  "status": "passed"
});
formatter.after({
  "duration": 78691574,
  "status": "passed"
});
});