$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Validate-Home-Page.feature");
formatter.feature({
  "name": "Validate Home Page",
  "description": "  I want to validate the home page",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@debug"
    }
  ]
});
formatter.scenario({
  "name": "Validate home page",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@debug"
    },
    {
      "name": "@debug"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to \"http://www.namaonline.org\"",
  "keyword": "Given "
});
formatter.match({
  "location": "HomeSteps.i_navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on the home page",
  "keyword": "When "
});
formatter.match({
  "location": "HomeSteps.i_click_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I validate that the page title is \"Welcome to North American Manipur Association!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "HomeSteps.i_validate_that_the_page_title_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});