package com.cg.bdd.stepDefinition;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {

	private WebDriver driver;

@Before(order=1)
public void setupStepEnv1() {
	System.setProperty("webdriver.chrome.driver", "D:\\G_VamshiKrishna-141\\Softwares\\chromedriver.exe");
	System.out.println("setupStepEnv1 is called");
}

@Before(order=2)
public void setupStepEnv2() {
	System.out.println("setupStepEnv2 is called");	
}

@Given("^user want to access 'www\\.google\\.com'$")
public void user_want_to_access_www_google_com() throws Throwable {
	driver=new ChromeDriver();
	throw new PendingException();
}

@When("^user will open google chrome$")
public void user_will_open_google_chrome() throws Throwable {
	driver.get("https://www.google.com");
	throw new PendingException();
}

@When("^will enter 'www\\.google\\.com'$")
public void will_enter_www_google_com() throws Throwable {

	throw new PendingException();
}

@Then("^display homepage of 'www\\.google\\.com'$")
public void display_homepage_of_www_google_com() throws Throwable {
	String actualTitle=driver.getTitle();
	Assert.assertEquals("Google", actualTitle);
    throw new PendingException();
}
}