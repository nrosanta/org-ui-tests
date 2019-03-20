package com.testingfly.stepdefinitions;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features", plugin = { "pretty", "html:target/cucumber-html-report",
		"json:target/cucumber/cucumber.json" }, tags = {}, glue = "com.testingfly.stepdefinitions")
public class RunCukesTest {

}
