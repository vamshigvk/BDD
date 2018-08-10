package com.cg.main;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MainTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:/Selenium-java/chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement src = driver.findElement(By.id("src"));
		src.sendKeys("Pune Airport");
		Thread.sleep(2000);
		src.sendKeys(Keys.ENTER);
		WebElement dest = driver.findElement(By.id("dest"));
		dest.sendKeys("Hyderabad Airport");
		Thread.sleep(2000);
		dest.sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='rb-calendar_onward_cal']/table/tbody/tr[6]/td[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("search_btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/ul/li[1]/div/div[4]/div")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"8826688\"]/div/div[2]/div[1]")).click();
		Thread.sleep(5000);
		WebElement canvas = driver
				.findElement(By.xpath("//*[@id=\"rt_8826688\"]/div/div/div/div[2]/div[2]/div[2]/canvas"));
		Thread.sleep(5000);
		Actions actionBuilder = new Actions(driver);
		actionBuilder.moveToElement(canvas, 60, 30).click().build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[1]/ul/li[1]/span[2]/div"))
				.click();
		driver.findElement(By.xpath(
				"//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[1]/div[2]/div/div/div/div[2]/ul/li[1]/span[2]/div"))
				.click();
		driver.findElement(By.xpath("//*[@id=\"8826688\"]/div[2]/div[2]/div[2]/div[2]/div[2]/div/div[6]/button"))
				.click();
		Thread.sleep(2000);
		WebElement name = driver.findElement(By.xpath("//*[@id=\"seatno-04\"]"));
		name.sendKeys("Thummala Raswini");
		name.sendKeys(Keys.ENTER);

		driver.findElement(By.xpath("//*[@id=\"23_0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"seatno-01\"]")).sendKeys("21");
		Thread.sleep(2000);
		WebElement email = driver.findElement(By.xpath("//*[@id=\"seatno-05\"]"));
		email.sendKeys("raswinireddy@gmail.com");
		email.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"seatno-06\"]")).sendKeys("8019413949");
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[4]/div/div/div[2]/div[2]/input")).click();
	}
}
