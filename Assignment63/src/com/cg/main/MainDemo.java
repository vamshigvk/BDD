package com.cg.main;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.cg.test.AmazonPage;

public class MainDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:/Selenium-java/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://www.amazon.in");
		driver.manage().window().maximize();

		AmazonPage page = PageFactory.initElements(driver, AmazonPage.class);

		page.getSearchImg().click();
		AmazonPage.product1(driver).click();
		AmazonPage.getWindow(driver);
		AmazonPage.addToCart(driver).click();

		page.getAmazonLogo().click();
		page.getSearchImg().click();
		AmazonPage.product2(driver).click();
		AmazonPage.getWindow(driver);
		AmazonPage.addToCart(driver).click();

		page.getAmazonLogo().click();
		page.getSearchImg().click();
		AmazonPage.product3(driver).click();
		AmazonPage.getWindow(driver);
		AmazonPage.addToCart(driver).click();

		page.getAmazonLogo().click();
		page.getSearchImg().click();
		AmazonPage.product4(driver).click();
		AmazonPage.getWindow(driver);
		AmazonPage.addToCart(driver).click();

		page.getAmazonLogo().click();
		page.getSearchImg().click();
		AmazonPage.product5(driver).click();
		AmazonPage.getWindow(driver);
		AmazonPage.addToCart(driver).click();

		page.getCheckOut().click();
		page.getuName().sendKeys("9640178686");
		page.getContinueButton().click();
		page.getPassword().sendKeys("saisree@169");
		page.getLoginButton().click();
		
		AmazonPage.addAddress(driver).click();
		AmazonPage.finalCheckOut(driver).click();
	}
}
