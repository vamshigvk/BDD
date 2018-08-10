package com.cg.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AmazonPage {

	@FindBy(how = How.ID, using = "nav-logo")
	WebElement amazonLogo;

	@FindBy(how = How.XPATH, using = "//*[@id=\"1bf73d3a\"]/span/div/div[1]/a/img")
	WebElement searchImg;

	@FindBy(how = How.XPATH, using = "//*[@id=\"hlb-ptc-btn-native\"]")
	WebElement checkOut;

	@FindBy(how = How.NAME, using = "email")
	WebElement uName;

	@FindBy(how = How.NAME, using = "password")
	WebElement password;

	@FindBy(how = How.ID, using = "continue")
	WebElement continueButton;

	@FindBy(how = How.ID, using = "signInSubmit")
	WebElement loginButton;

	public static WebElement element = null;

	public static WebElement product1(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"result_0\"]/div/div[2]/div/div/a/img"));
		return element;
	}

	public static WebElement product2(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"result_1\"]/div/div[2]/div/div/a/img"));
		return element;
	}

	public static WebElement product3(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"result_2\"]/div/div[2]/div/div/a/img"));
		return element;
	}

	public static WebElement product4(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"result_4\"]/div/div[2]/div/div/a/img"));
		return element;
	}

	public static WebElement product5(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"result_5\"]/div/div[2]/div/div/a/img"));
		return element;
	}

	public static WebDriver getWindow(WebDriver driver) {
		driver.getWindowHandle();
		for (String with : driver.getWindowHandles()) {
			driver.switchTo().window(with);
		}
		return driver;
	}

	public static WebElement addToCart(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		element = driver.findElement(By.id("add-to-cart-button"));
		return element;
	}

	public static WebElement addAddress(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"address-book-entry-0\"]/div[2]/span/a"));
		return element;
	}

	public static WebElement finalCheckOut(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"shippingOptionFormId\"]/div[3]/div/div/span[1]/span/input"));
		return element;
	}

	public WebElement getAmazonLogo() {
		return amazonLogo;
	}

	public WebElement getSearchImg() {
		return searchImg;
	}

	public static WebElement getElement() {
		return element;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getuName() {
		return uName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getContinueButton() {
		return continueButton;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
}
