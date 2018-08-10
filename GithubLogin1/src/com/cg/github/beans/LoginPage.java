package com.cg.github.beans;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	@FindBy(how=How.ID, id="login_field")
	WebElement username;
	
	@FindBy(how=How.ID, id="password")
	WebElement password;
	
	@FindBy(className="btn")
	WebElement button;
	
	public LoginPage() {}
	
	public void setUsername(String username) {
		this.username.sendKeys(username);
	}
	
	public String getUsername() {
		return this.username.getAttribute("value");
	}
	
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public String getPassword(){
		return this.password.getAttribute("value");
	}
	public void clickSubmitButton() {
		button.submit();
	}
	
}
