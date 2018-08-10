package com.cg.naukri.stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.cg.naukri.beans.RegistrationPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDefinition {
	private WebDriver driver;
	private RegistrationPage registrationPage;
	
@Before
public void setupStepEnv() {
	System.setProperty("webdriver.chrome.driver", "D:\\G_VamshiKrishna-141\\Softwares\\chromedriver.exe");
	System.out.println("setupStepEnv is called");
}

@Given("^user wants to access to 'www\\.naukri\\.com'$")
public void user_wants_to_access_to_www_naukri_com() throws Throwable {
	driver=new ChromeDriver();
	registrationPage=new RegistrationPage();
	driver.get("https://www.naukri.com/");
	PageFactory.initElements(driver, registrationPage);
}

@When("^he choses to Register$")
public void he_choses_to_Register() throws Throwable {
	registrationPage.clickRegisterWithUsbutton();
	
}


@When("^he choses I am a Professinal Option$")
public void he_choses_I_am_a_Professinal_Option() throws Throwable {
	registrationPage.experienceRegistration();
}

@When("^professonial Enters his personal details$")
public void professonial_Enters_his_personal_details() throws Throwable {
   registrationPage.setFname("profesismd");
   registrationPage.setEmail("vamihsk010@gmail.com");
   registrationPage.setPassword("vamshigvk");
   registrationPage.setMobilenumber("2013211230");
   registrationPage.setExpInYears("2");
   registrationPage.setExpInMonths("10");
   registrationPage.setResume("D:\\G_VamshiKrishna-141\\Module 3\\selectList.html");
   registrationPage.clickSubmitButton();
}


@When("^he choses I am a Fresher Option$")
public void he_choses_I_am_a_Fresher_Option() throws Throwable {
   registrationPage.fresherRegistration();
}

@When("^user Enters his Personal details$")
public void user_Enters_his_Personal_details() throws Throwable {
   registrationPage.setFname("vamshikrishnagvk");
   registrationPage.setEmail("vamihskvg@gmail.com");
   registrationPage.setPassword("vamshigvk");
   registrationPage.setMobilenumber("1233211230");
   registrationPage.setLocation("Ahmedabad");
   registrationPage.setResume("D:\\G_VamshiKrishna-141\\Module 3\\selectList.html");
   registrationPage.clickSubmitButton();
}

@Then("^he is redirected to Succesfull Registration Page$")
public void he_is_redirected_to_Succesfull_Registration_Page() throws Throwable {
    String expected="Resume Manager - Post Resume Online - Submit your CV - Naukri.com";
    String actual=driver.getTitle();
    assertEquals(expected, actual);
}

@When("^user clicks register now button$")
public void user_clicks_register_now_button() throws Throwable {
  registrationPage.clickSubmitButton();
}

@Then("^'Please specify your email ID' 'Please specify a password' 'Please specify your mobile number' 'Please type your city name in the text box' Messages should display$")
public void please_specify_your_email_ID_Please_specify_a_password_Please_specify_your_mobile_number_Please_type_your_city_name_in_the_text_box_Messages_should_display() throws Throwable {
   String expected="Please specify your email ID";
   String actual=driver.findElement(By.xpath("//*[@id=\"email_err\"]")).getText();
   assertEquals(expected, actual);
}



}
