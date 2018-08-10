package com.cg.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverDemo {
	public static void main(String[] args) {
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\G_VamshiKrishna-141\\Softwares\\chromedriver.exe");
			
			WebDriver driver= new ChromeDriver();
			driver.get("https://www.google.com");
			
			WebElement searchField= driver.findElement(By.id("lst-ib"));
			searchField.sendKeys("pluralsight");
			searchField.submit();

			WebElement imagesLink = driver.findElement(By.linkText("Images"));
			imagesLink.click();

//			WebElement searchField1= driver.findElement(By.id("gsr"));
//			searchField1.click();
			
			WebElement imageElement = driver.findElements(By.cssSelector("a[class=rg_l]")).get(0);
			
			WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
			imageLink.click();
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}