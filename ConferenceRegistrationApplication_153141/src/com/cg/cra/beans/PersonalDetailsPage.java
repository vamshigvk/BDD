package com.cg.cra.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class PersonalDetailsPage {

	@FindBy(id="txtFirstName")
	private WebElement firstName;
	
	@FindBy(id="txtLastName")
	private WebElement lastName;
	
	@FindBy(id="txtEmail")
	private WebElement email;
	
	@FindBy(id="txtPhone")
	private WebElement phonenumber;
	
	@FindBy(name="size")
	private WebElement numberOfPeople;
	
	@FindBy(name="Address")
	private WebElement address1;
	
	@FindBy(name="Address2")
	private WebElement address2;
	
	@FindBy(name="city")
	private WebElement city;
	
	@FindBy(name="state")
	private WebElement state;
	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[12]/td[2]/input")
	private WebElement member1000;
	
	@FindBy(how=How.XPATH,xpath="/html/body/form/table/tbody/tr[13]/td[2]/input")
	private WebElement nonMember1500;
	
	@FindBy(how=How.XPATH, xpath="/html/body/form/table/tbody/tr[14]/td/a")
	private WebElement next;
	
	

	public PersonalDetailsPage() {}

	public String getFirstName() {
		return this.firstName.getAttribute("value");
	}

	public void setFirstName(String firstName) {
		this.firstName.sendKeys(firstName);
	}

	public String getLastName() {
		return this.lastName.getAttribute("value");
	}

	public void setLastName(String lastName) {
		this.lastName.sendKeys(lastName);
	}

	public String getEmail() {
		return this.email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public String getPhonenumber() {
		return this.phonenumber.getAttribute("value");
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber.sendKeys(phonenumber);
	}


	public void setNumberOfPeople(String number) {
		Select sel=new Select(numberOfPeople);
		sel.selectByVisibleText(number);
	}

	public String getAddress1() {
		return this.address1.getAttribute("value");
	}

	public void setAddress1(String address1) {
		this.address1.sendKeys(address1);
	}

	public String getAddress2() {
		return this.address2.getAttribute("value");
	}

	public void setAddress2(String address2) {
		this.address2.sendKeys(address2);
	}

	
	public void setCity(String name1) {
		Select sel=new Select(city);
		sel.selectByVisibleText(name1);
	}


	public void setState(String name2) {
		Select sel=new Select(state);
		sel.selectByVisibleText(name2);
	}

	public void setMember1000() {
		this.member1000.click();
	}

	public void setNonMember1500() {
		this.nonMember1500.click();
	}

	public void setNext() {
		next.click();
	}
}
