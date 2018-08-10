package com.cg.html.elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverHTMLElements{

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\G_VamshiKrishna-141\\Softwares\\chromedriver.exe");
		checkBoxTest();
		radioButtonTest();	
		selectTest();
	}

private static void checkBoxTest()throws InterruptedException{
	WebDriver driver= new ChromeDriver();
	driver.get("D:\\G_VamshiKrishna-141\\Module 3\\checkboxes.html");
	WebElement checkbox=driver.findElement(By.id("mayoCheckbox"));
	Thread.sleep(3000);
	checkbox.click();
	if(checkbox.isSelected())
		System.out.println("Value of checkBox:-"+checkbox.getAttribute("value"));
}
private static void radioButtonTest()throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("D:\\G_VamshiKrishna-141\\Module 3\\radioButtons.html");
	By elements = By.name("color");
	List<WebElement> radioButtons = driver.findElements(elements);
	WebElement radioBtn=radioButtons.get(1);
	radioBtn.click();
	
	for(WebElement radioButton : radioButtons) {
		if(radioButton.isSelected())
			System.out.println("value of radiobutton: "+radioButton.getAttribute("value"));
	}

}
private static void selectTest() {
	WebDriver driver= new ChromeDriver();
	driver.get("D:\\G_VamshiKrishna-141\\Module 3\\selectList.html");
	WebElement selectElement = driver.findElement(By.id("select1"));
	Select select = new Select(selectElement);
	select.selectByVisibleText("Maybe");
}
}
