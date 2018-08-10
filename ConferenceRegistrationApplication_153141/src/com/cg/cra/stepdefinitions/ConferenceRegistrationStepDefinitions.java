package com.cg.cra.stepdefinitions;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.cra.beans.PaymentDetailsPage;
import com.cg.cra.beans.PersonalDetailsPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;

public class ConferenceRegistrationStepDefinitions {
	
	private WebDriver driver;
	private PersonalDetailsPage personalDetailsPage;
	private PaymentDetailsPage paymentDetailsPage;
	
@Before(order=1)
public void setupStepEnv() {
	System.setProperty("webdriver.chrome.driver", "D:\\G_VamshiKrishna-141\\Softwares\\chromedriver.exe");
	System.out.println("setupStepEnv is called");
}

@Given("^User opens 'ConferenceRegistration' page$")
public void user_opens_ConferenceRegistration_page() throws Throwable {
	driver=new ChromeDriver();
	personalDetailsPage=new PersonalDetailsPage();
	driver.get("D:\\Users\\ADM-IG-HWDLAB1C\\Desktop\\MPT Set 1\\MPT Set 1\\ConferenceRegistartion.html");
	PageFactory.initElements(driver,personalDetailsPage);
}


@When("^he verifies titlea$")
public void he_verifies_titlea() throws Throwable {
	String expected="Conference Registartion";
	String actual=driver.getTitle();
	assertEquals(expected, actual);
}


@When("^clicks 'Next' without entering FirstName$")
public void clicks_Next_without_entering_FirstName() throws Throwable {
	 Thread.sleep(1000);
	personalDetailsPage.setNext();
}

@Then("^'Please fill the First Name' message must be displayed$")
public void please_fill_the_First_Name_message_must_be_displayed() throws Throwable {
	String expectedMessage="Please fill the First Name";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000); 
	driver.switchTo().alert().dismiss();
}

@When("^he enters a valid FirstName$")
public void he_enters_a_valid_FirstName() throws Throwable {
   personalDetailsPage.setFirstName("vamshi");
   Thread.sleep(1000);
}

@When("^he clicks 'Next' without entering LastName$")
public void he_clicks_Next_without_entering_LastName() throws Throwable {
	 Thread.sleep(1000);
	personalDetailsPage.setNext();
}

@Then("^'Please fill the Last Name' message must be displayed$")
public void please_fill_the_Last_Name_message_must_be_displayed() throws Throwable {
	String expectedMessage="Please fill the Last Name";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000); 
	driver.switchTo().alert().dismiss();
}

@When("^he enters a valid LastName$")
public void he_enters_a_valid_LastName() throws Throwable {
    personalDetailsPage.setLastName("Krishna");
    Thread.sleep(1000);
}

@When("^he clicks 'Next' without entering eMail$")
public void he_clicks_Next_without_entering_eMail() throws Throwable {
	 Thread.sleep(1000);
	personalDetailsPage.setNext();
}

@Then("^'Please fill the Email' message must be displayed$")
public void please_fill_the_Email_message_must_be_displayed() throws Throwable {
	String expectedMessage="Please fill the Email";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000); 
	driver.switchTo().alert().dismiss();
}

@When("^he enters a valid eMail$")
public void he_enters_a_valid_eMail() throws Throwable {
  personalDetailsPage.setEmail("vams@gmail.com");
  Thread.sleep(1000);
}

@When("^he clicks 'Next' without entering Contact Number$")
public void he_clicks_Next_without_entering_Contact_Number() throws Throwable {
	 Thread.sleep(1000);
	personalDetailsPage.setNext();
}

@Then("^'Please fill the Contact No' message must be displayed$")
public void please_fill_the_Contact_No_message_must_be_displayed() throws Throwable {
	String expectedMessage="Please fill the Contact No.";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
	driver.switchTo().alert().dismiss();
}

@When("^he enters a valid contactNumber$")
public void he_enters_a_valid_contactNumber() throws Throwable {
   personalDetailsPage.setPhonenumber("9912905423");
   Thread.sleep(1000);
}

@When("^he clicks 'Next' without selecting Number of People$")
public void he_clicks_Next_without_selecting_Number_of_People() throws Throwable {
	 Thread.sleep(1000);
	personalDetailsPage.setNext();
}

@Then("^'Please fill the Number of people attending' message must be displayed$")
public void please_fill_the_Number_of_people_attending_message_must_be_displayed() throws Throwable {
	String expectedMessage="Please fill the Number of people attending";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
	 driver.switchTo().alert().dismiss();
}

@When("^he selects the Number of People atteding for the Conference$")
public void he_selects_the_Number_of_People_atteding_for_the_Conference() throws Throwable {
	Thread.sleep(1000);
	personalDetailsPage.setNumberOfPeople("3");
}

@When("^he clicks 'Next' without entering Building Name & Room No$")
public void he_clicks_Next_without_entering_Building_Name_Room_No() throws Throwable {
	Thread.sleep(1000);
	personalDetailsPage.setNext();
}

@Then("^'Please fill the Building & Room No' message must be displayed$")
public void please_fill_the_Building_Room_No_message_must_be_displayed() throws Throwable {
	String expectedMessage="Please fill the Building & Room No";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
	 driver.switchTo().alert().dismiss();
}

@When("^he enters Building Name & Room No$")
public void he_enters_Building_Name_Room_No() throws Throwable {
	Thread.sleep(1000);
	personalDetailsPage.setAddress1("Manas building lab1c");
}

@When("^he clicks 'Next' without entering Area name$")
public void he_clicks_Next_without_entering_Area_name() throws Throwable {
	Thread.sleep(1000);
	personalDetailsPage.setNext();
}

@Then("^'Please fill the Area name' message must be displayed$")
public void please_fill_the_Area_name_message_must_be_displayed() throws Throwable {
	String expectedMessage="Please fill the Area name";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
	 driver.switchTo().alert().dismiss();
}

@When("^he enters Area Name$")
public void he_enters_Area_Name() throws Throwable {
	Thread.sleep(1000);
	personalDetailsPage.setAddress2("Hinjewadi Phase 3");
}

@When("^he clicks 'Next' without selecting city$")
public void he_clicks_Next_without_selecting_city() throws Throwable {
	Thread.sleep(1000);
	personalDetailsPage.setNext();
}

@Then("^'Please select city' message must be displayed$")
public void please_select_city_message_must_be_displayed() throws Throwable {
	String expectedMessage="Please select city";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
	 driver.switchTo().alert().dismiss();
}

@When("^he selects a city$")
public void he_selects_a_city() throws Throwable {
	Thread.sleep(1000);
	personalDetailsPage.setCity("Pune");
}

@When("^he clicks 'Next' without selecting state$")
public void he_clicks_Next_without_selecting_state() throws Throwable {
	Thread.sleep(1000);
	personalDetailsPage.setNext();
}

@Then("^'Please select state' message must be displayed$")
public void please_select_state_message_must_be_displayed() throws Throwable {
	String expectedMessage="Please select state";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
	 driver.switchTo().alert().dismiss();
}

@When("^he selects a State$")
public void he_selects_a_State() throws Throwable {
	Thread.sleep(1000);
	personalDetailsPage.setState("Maharashtra");
}

@When("^he clicks 'Next' without entering membership status$")
public void he_clicks_Next_without_entering_membership_status() throws Throwable {
	Thread.sleep(1000);
	personalDetailsPage.setNext();
}

@Then("^'Please Select MemeberShip status' message must be displayed$")
public void please_Select_MemeberShip_status_message_must_be_displayed() throws Throwable {
	String expectedMessage="Please Select MemeberShip status";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
	 driver.switchTo().alert().dismiss();
}

@When("^he choses his Membership status$")
public void he_choses_his_Membership_status() throws Throwable {
	Thread.sleep(1000);
	personalDetailsPage.setMember1000();
}

@When("^he clicks 'Next'$")
public void he_clicks_Next() throws Throwable {
	Thread.sleep(1000);
	personalDetailsPage.setNext();
}

@Then("^'Personal details are validated\\.' message must be displayed$")
public void personal_details_are_validated_message_must_be_displayed() throws Throwable {
	String expectedMessage="Personal details are validated.";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
}

@When("^he clicks ok$")
public void he_clicks_ok() throws Throwable {
	Thread.sleep(1000);
	 driver.switchTo().alert().dismiss();
}

@Then("^he is Redirected to Payment Page$")
public void he_is_Redirected_to_Payment_Page() throws Throwable {
   
}

@When("^he verifies titleb$")
public void he_verifies_titleb() throws Throwable {
	String expected="Payment Details";
	String actual=driver.getTitle();
	assertEquals(expected, actual);
	Thread.sleep(1000);
}

@When("^clicks 'Make Payment' without entering cardholdername$")
public void clicks_Make_Payment_without_entering_cardholdername() throws Throwable {
 paymentDetailsPage= new PaymentDetailsPage();
 PageFactory.initElements(driver,paymentDetailsPage);
 paymentDetailsPage.MakePayment();
}

@Then("^'Please fill the Card holder name' is displayed$")
public void please_fill_the_Card_holder_name_is_displayed() throws Throwable {
	String expectedMessage="Please fill the Card holder name";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
	 driver.switchTo().alert().dismiss();
}

@When("^he enters cardholder name$")
public void he_enters_cardholder_name() throws Throwable {
	Thread.sleep(1000);
	paymentDetailsPage.setCardHolderName("vamshi");
}

@When("^he clicks 'Make Payment' without entering debitcardnumber$")
public void he_clicks_Make_Payment_without_entering_debitcardnumber() throws Throwable {
	 Thread.sleep(1000);
	 paymentDetailsPage.MakePayment();
}

@Then("^'Please fill the Debit card Number' is displayed$")
public void please_fill_the_Debit_card_Number_is_displayed() throws Throwable {
	String expectedMessage="Please fill the Debit card Number";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
	 driver.switchTo().alert().dismiss();
}

@When("^he enters Debit Card Number$")
public void he_enters_Debit_Card_Number() throws Throwable {
	Thread.sleep(1000);
	paymentDetailsPage.setDebitCardNumber("1234567897456321");
}

@When("^he clicks 'Make Payment' without entering cvv$")
public void he_clicks_Make_Payment_without_entering_cvv() throws Throwable {
	Thread.sleep(1000);
	paymentDetailsPage.MakePayment();
}

@Then("^'Please fill the CVV' is displayed$")
public void please_fill_the_CVV_is_displayed() throws Throwable {
	String expectedMessage="Please fill the CVV";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
	 driver.switchTo().alert().dismiss();
}

@When("^he enters cvv$")
public void he_enters_cvv() throws Throwable {
	Thread.sleep(1000);
	paymentDetailsPage.setCvv("123");
}

@When("^he clicks 'Make Payment' without entering expiry month$")
public void he_clicks_Make_Payment_without_entering_expiry_month() throws Throwable {
 Thread.sleep(1000);
 paymentDetailsPage.MakePayment();
}

@Then("^'Please fill expiration month' is displayed$")
public void please_fill_expiration_month_is_displayed() throws Throwable {
	String expectedMessage="Please fill expiration month";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
	 driver.switchTo().alert().dismiss();
}

@When("^he enteres month$")
public void he_enteres_month() throws Throwable {
 Thread.sleep(1000);
 paymentDetailsPage.setMonth("12");
}

@When("^he clicks 'Make Payment' without entering expiry year$")
public void he_clicks_Make_Payment_without_entering_expiry_year() throws Throwable {
	Thread.sleep(1000);
	paymentDetailsPage.MakePayment();
}

@Then("^'Please fill expiration year' is displayed$")
public void please_fill_expiration_year_is_displayed() throws Throwable {
	String expectedMessage="Please fill the expiration year";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	 Thread.sleep(1000);
	 driver.switchTo().alert().dismiss();
}

@Then("^he enters Expiration Year$")
public void he_enters_Expiration_Year() throws Throwable {
  	Thread.sleep(1000);
	paymentDetailsPage.setYear("2019");
}

@Then("^clicks Make Payment$")
public void clicks_Make_Payment() throws Throwable {
    Thread.sleep(1000);
    paymentDetailsPage.MakePayment();
}

@Then("^'Conference Room is Successfully Done' message must be displayed$")
public void conference_Room_is_Successfully_Done_message_must_be_displayed() throws Throwable {
	String expectedMessage="Conference Room Booking successfully done!!!";
	String actualMessage=driver.switchTo().alert().getText();
	Assert.assertEquals(expectedMessage, actualMessage);
	driver.close();
}

}
