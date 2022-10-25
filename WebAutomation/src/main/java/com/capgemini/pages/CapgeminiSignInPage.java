package com.capgemini.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CapgeminiSignInPage {
   WebDriver driver=null;
	public CapgeminiSignInPage(WebDriver driver) {
		this.driver=driver;
	}
	private By signInTitleEle=By.xpath("//h1[text()='Sign in']");
	private By idTokenEle=By.id("idToken1");
	private By passwordEle=By.id("idToken2");
	private By loginBtn=By.id("loginButton_0");
	
	
	
	public WebElement getSignInTitleEleElement() {
		return driver.findElement(signInTitleEle);
	}
	public WebElement getIdTokenElement() {
		return driver.findElement(idTokenEle);
	}
	public WebElement getpasswordElement() {
		return driver.findElement(passwordEle);
	}
	public WebElement getLoginBtn() {
		return driver.findElement(loginBtn);
	}
	public void enterSignInDetails(String token,String pwd) {
		getIdTokenElement().sendKeys(token);
		getpasswordElement().sendKeys(pwd);
		getLoginBtn().click();
	}
}
