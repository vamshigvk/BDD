package com.cg.github.stepdefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.github.beans.LoginPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition{
private WebDriver driver;
private LoginPage loginPage;


@Before(order=1)
public void setupStepEnv() {
	System.setProperty("webdriver.chrome.driver", "D:\\G_VamshiKrishna-141\\Softwares\\chromedriver.exe");
	System.out.println("setupStepEnv is called");
}

@Given("^User is on GitHub login Page$")
public void user_is_on_GitHub_login_Page() throws Throwable {
	driver=new ChromeDriver();
	loginPage= new LoginPage();
	driver.get("https://github.com/login");
	PageFactory.initElements(driver, loginPage);
}

@When("^User enters Invalid username and password$")
public void user_enters_Invalid_username_and_password() throws Throwable {
	loginPage.setUsername("vamshigvk2665");
	loginPage.setPassword("Vamshi9912@");
	loginPage.clickSubmitButton();
}

@Then("^'Incorrect username and password\\.' Message should display$")
public void incorrect_username_and_password_Message_should_display() throws Throwable {
	String actualErrorMessage=driver.findElement(By.xpath("//div[@class='container']")).getText();
	String expectedErrorMessage="Incorrect username or password.";
	assertEquals(expectedErrorMessage, actualErrorMessage);
}

@When("^User enters valid username and password$")
public void user_enters_valid_username_and_password() throws Throwable {
	loginPage.setUsername("vamshigvk");
	loginPage.setPassword("Vamshi9912@#");
	loginPage.clickSubmitButton();
}

@Then("^User should successfully Signin on his GitHub account$")
public void user_should_successfully_Signin_on_his_GitHub_account() throws Throwable {
	driver.get("https://github.com/vamshigvk");
	String actualTitle=driver.getTitle();
	String expectedTitle="vamshigvk (G Vamshi Krishna)";
	assertEquals(expectedTitle,actualTitle);
}
}
