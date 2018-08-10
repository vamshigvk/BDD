package com.cg.naukri.stepDefinition;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDefinition {
	private WebDriver driver;
	
@Before
public void setupStepEnv() {
	System.setProperty("webdriver.chrome.driver", "D:\\G_VamshiKrishna-141\\Softwares\\chromedriver.exe");
	System.out.println("setupStepEnv is called");
}

@Given("^user wants to access to 'www\\.naukri\\.com'$")
public void user_wants_to_access_to_www_naukri_com() throws Throwable {
	driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
}

@When("^he choses to Register$")
public void he_choses_to_Register() throws Throwable {
  WebElement element1= driver.findElement(By.id("p0widget"));
  WebElement element2= element1.findElement(By.xpath(".//div/div[1]/div/input"));
  element2.click();
}

@When("^he choses I am a Fresher Option$")
public void he_choses_I_am_a_Fresher_Option() throws Throwable {
   WebElement element3=driver.findElement(By.id("flowBifurcation"));
   WebElement element4=element3.findElement(By.xpath(".//div[2]/form/div[1]/div/button"));
   element4.click();
}
@When("^he choses I am a Professinal Option$")
public void he_choses_I_am_a_Professinal_Option() throws Throwable {
	WebElement element3=driver.findElement(By.id("flowBifurcation"));
	WebElement element4=element3.findElement(By.xpath(".//div[2]/form/div[2]/div/button"));
	element4.click();
}

@When("^user Enters a Valid Name$")
public void user_Enters_a_Valid_Name() throws Throwable {
	WebElement element=driver.findElement(By.id("fname"));
	element.sendKeys("manakanaiik");
}

@When("^user Enters Valid e-Mail ID$")
public void user_Enters_Valid_e_Mail_ID() throws Throwable {
	WebElement element=driver.findElement(By.id("email"));
	element.sendKeys("vagudukuiia@gmail.com");
}

@When("^user creates a Valid Password$")
public void user_creates_a_Valid_Password() throws Throwable {
	WebElement element1=driver.findElement(By.id("basicDetailForm"));
	WebElement element2=element1.findElement(By.xpath(".//div[3]/div[1]/div/input"));
	element2.sendKeys("1212112a");
}

@When("^user enters a Valid Mobile-Number$")
public void user_enters_a_Valid_Mobile_Number() throws Throwable {
	WebElement element1=driver.findElement(By.id("basicDetailForm"));
	WebElement element2=element1.findElement(By.xpath(".//div[4]/div[1]/div/input[2]"));
	element2.sendKeys("999098760");
}



@When("^user uploads his Resume$")
public void user_uploads_his_Resume() throws Throwable {
	WebElement element1=driver.findElement(By.id("basicDetailForm"));
	WebElement element2=element1.findElement(By.xpath(".//resman-uploader/div/div[1]/span[1]/input"));
	element2.sendKeys("D:\\G_VamshiKrishna-141\\Module 3\\selectList.pdf");
	}
@When("^user enters his Current Location$")
public void user_enters_his_Current_Location() throws Throwable {
	WebElement element1=driver.findElement(By.id("basicDetailForm"));
	WebElement element2=element1.findElement(By.xpath(".//resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input"));
	element2.sendKeys("Ahmedabad");
	element2.submit();
}
@Then("^he is redirected to Succesfull Registration Page$")
public void he_is_redirected_to_Succesfull_Registration_Page() throws Throwable {
	WebElement element1=driver.findElement(By.id("basicDetailForm"));
	WebElement element2=element1.findElement(By.xpath(".//div[5]/div/div/div[2]/button"));
	element2.click();
}

@When("^user enters his Total Work Experience in months$")
public void user_enters_his_Total_Work_Experience_in_months() throws Throwable {
	WebElement element1=driver.findElement(By.id("basicDetailForm"));
	WebElement element2=element1.findElement(By.xpath(".//resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input"));
	element2.sendKeys("0");
}

@When("^user enters his Total Work Experience in years$")
public void user_enters_his_Total_Work_Experience_in_years() throws Throwable {

	WebElement element3=driver.findElement(By.id("basicDetailForm"));
	WebElement element4=element3.findElement(By.xpath(".//resman-experience/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input"));
	element4.sendKeys("0");
}
}