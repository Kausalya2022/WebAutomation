package com.capgemini.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CapgeminiHomePage {
   WebDriver driver=null;
	public CapgeminiHomePage(WebDriver driver) {
		this.driver=driver;
	}
	private By aboutUsEle=By.xpath("//a[text()='ABOUTUS']");
	private By employeeBtn=By.id("callback_0_0");
	private By loginBtn=By.id("loginButton_0");
	
	
	
	
	public WebElement getAboutUsElement() {
		return driver.findElement(aboutUsEle);
	}
	public WebElement getEmployeeBtnElement() {
		return driver.findElement(employeeBtn);
	}
	public WebElement getLoginElement() {
		return driver.findElement(loginBtn);
	}
}
