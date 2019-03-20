package com.testingfly.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BaseClass {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[3]/h2")
	private WebElement page_Heading;

	@FindBy(how = How.XPATH, using = "/html/body/form/div[3]/div[2]/div/ul/li[1]/a/span")
	private WebElement homeLink;

	public String validate_Heading() {
		return this.page_Heading.getText();
	}

	public void refresh() {
		homeLink.click();
	}

}
