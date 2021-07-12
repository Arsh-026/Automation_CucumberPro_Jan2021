$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TF_Test.feature");
formatter.feature({
  "line": 2,
  "name": "Set color background",
  "description": "",
  "id": "set-color-background",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@TF_Test"
    },
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "duration": 3215847200,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "White background color button test",
  "description": "",
  "id": "set-color-background;white-background-color-button-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Scenario2"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user click the button",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "the background color will change to white",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_defs.user_click_the_button()"
});
formatter.result({
  "duration": 113412400,
  "status": "passed"
});
formatter.match({
  "location": "Step_defs.the_background_color_will_change_to_white()"
});
formatter.result({
  "duration": 18000,
  "status": "passed"
});
formatter.after({
  "duration": 2187593300,
  "status": "passed"
});
});