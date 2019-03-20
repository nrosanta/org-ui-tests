package com.testingfly.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.testingfly.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HomeSteps {
	public WebDriver driver;
	HomePage hp;

	public HomeSteps() {
		this.driver = Hook.driver;
		System.out.println("**********called hook");
	}

	@Given("^I navigate to \"([^\"]*)\"$")
	public void i_navigate_to(String url) throws Throwable {
		driver.get(url);
	}

	@When("^I click on the home page$")
	public void i_click_on_the_home_page() throws Throwable {
		hp = new HomePage(driver);
		hp.refresh();

	}

	@Then("^I validate that the page title is \"([^\"]*)\"$")
	public void i_validate_that_the_page_title_is(String arg1) throws Throwable {
		Assert.assertEquals("Welcome to North American Manipur Association!", hp.validate_Heading());
	}

}
