package com.capgemini.tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.capgemini.pages.CapgeminiHomePage;
import com.capgemini.pages.CapgeminiSignInPage;

public class TalentCapgemeniTest extends BaseDriver{

	@Test(priority = 1)
	public void navigateToTalentPage() {
		driver.get("https://sso.capgemini.com/opensso/XUI/#login/");
		CapgeminiHomePage homePage=new CapgeminiHomePage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.visibilityOf(homePage.getAboutUsElement()));
		Assert.assertTrue(homePage.getAboutUsElement().isDisplayed());
		//homePage.getEmployeeBtnElement().click();
		homePage.getLoginElement().click();
		
	}
	@Test(priority = 2)
	public void enterLoginDetails() {
		CapgeminiSignInPage signPage=new CapgeminiSignInPage(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		 wait.until(ExpectedConditions.visibilityOf(signPage.getSignInTitleEleElement()));
		
		Assert.assertTrue(signPage.getSignInTitleEleElement().isDisplayed());
		signPage.enterSignInDetails("", "");
	}
}
