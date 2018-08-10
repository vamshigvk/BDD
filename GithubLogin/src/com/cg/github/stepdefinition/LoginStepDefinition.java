package com.cg.github.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition{
private WebDriver driver;

@Before(order=1)
public void setupStepEnv() {
	System.setProperty("webdriver.chrome.driver", "D:\\G_VamshiKrishna-141\\Softwares\\chromedriver.exe");
	System.out.println("setupStepEnv is called");
}

@Given("^the user wants to access 'https://www\\.github\\.com/login'$")
public void the_user_wants_to_access_https_www_github_com_login() throws Throwable {
	driver=new ChromeDriver();
	driver.get("https://github.com/login");
}

@When("^the entered username is valid$")
public void the_entered_username_is_valid() throws Throwable {
	WebElement username1=driver.findElement(By.id("login_field"));
	username1.sendKeys("vamshigvk");
}

@When("^the entered password is valid$")
public void the_entered_password_is_valid() throws Throwable {
	WebElement password1 = driver.findElement(By.id("password"));
	password1.sendKeys("Vamshi9912@#");
	password1.submit();
}

@Then("^the user must be redirected to his repositories page$")
public void the_user_must_be_redirected_to_his_repositories_page() throws Throwable {
	String actual=driver.getTitle();
	assertEquals("GitHub", actual);
}

@When("^the entered username is Invalid$")
public void the_entered_username_is_Invalid() throws Throwable {
	WebElement username2=driver.findElement(By.id("login_field"));
	username2.sendKeys("99129054");
}

@Then("^the user must be redirected to 'https://www\\.github\\.com/login' to re-enter login credentials$")
public void the_user_must_be_redirected_to_https_www_github_com_login_to_re_enter_login_credentials() throws Throwable {
	driver.get("https://github.com/login");
	String  actual=driver.getTitle();
	assertEquals("Sign in to GitHub · GitHub", actual);
}

@When("^the entered password is Invalid$")
public void the_entered_password_is_Invalid() throws Throwable {
	WebElement password2 = driver.findElement(By.id("password"));
	password2.sendKeys("Vamshi99");
	password2.submit();
}

}
