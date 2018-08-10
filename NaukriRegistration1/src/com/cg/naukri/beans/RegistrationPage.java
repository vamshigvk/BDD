package com.cg.naukri.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RegistrationPage {
	@FindBy(how=How.XPATH, xpath="//*[@id=\"p0widget\"]/div/div[1]/div/input")
	WebElement registerButton;
	
	@FindBy(how=How.CLASS_NAME, className="fresherCont")
	WebElement fresherButton;
	
	@FindBy(how=How.CLASS_NAME, className="expCont")
	WebElement experienceButton;
	
	
	@FindBy(how=How.ID, id="fname")
	WebElement fname;
	
	@FindBy(how=How.ID, id="email")
	WebElement email;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"basicDetailForm\"]/div[3]/div[1]/div/input")
	WebElement password;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"basicDetailForm\"]/div[4]/div[1]/div/input[2]")
	WebElement mobilenumber;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"basicDetailForm\"]/resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input")
	WebElement location;
	
	@FindBy(how=How.XPATH, xpath="//*[@id=\"basicDetailForm\"]/resman-uploader/div/div[1]/span[1]/input") 
	WebElement resume;
	
	@FindBy(className="primary-btn")
	WebElement submitButton;
	
	@FindBy(how=How.NAME, name="expYear")
	WebElement experienceInYears;
	
	@FindBy(how=How.NAME, name="expMonth")
	WebElement experienceInMonths;
	
	
	public RegistrationPage() {}
	
	public void clickRegisterWithUsbutton() {
		registerButton.click();
	}
	
	public void fresherRegistration() {
		fresherButton.click();
		}
		
	public void experienceRegistration() {
		experienceButton.click();
	}
	
	public String getFname() {
		return this.fname.getAttribute("value");
	}

	public void setFname(String fname) {
		this.fname.sendKeys(fname);
	}

	public String getEmail() {
		return this.email.getAttribute("value");
	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public String getPassword() {
		return this.password.getAttribute("value");
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public String getMobilenumber() {
		return this.mobilenumber.getAttribute("value");
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber.sendKeys(mobilenumber);
	}

	public String getLocation() {
		return this.location.getAttribute("value");
	}

	public void setLocation(String location) {
		this.location.sendKeys(location);
	}

	public void setExpInMonths(String experienceInMonths) {
		this.experienceInMonths.sendKeys(experienceInMonths);
	}
	
	public String getExperienceInMonths() {
		return this.experienceInMonths.getAttribute("value");
	}
	
	public void setExpInYears(String experienceInYears) {
		this.experienceInMonths.sendKeys(experienceInYears);
	}
	
	public String getExperienceInYears() {
		return this.experienceInYears.getAttribute("value");
	}
	
	public String getResume() {
		return this.resume.getAttribute("value");
	}

	public void setResume(String resume) {
		this.resume.sendKeys(resume);;
	}

	public void clickSubmitButton() {
		submitButton.click();
	}		
}
