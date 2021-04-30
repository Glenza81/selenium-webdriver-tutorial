package com.excelsoft.selenium.webdriver.login;

import static org.junit.Assert.*;

import org.junit.Test;

import com.excelsoft.selenium.webdriver.base.BaseTest;
import com.excelsoft.selenium.webdriver.pages.LoginPage;
import com.excelsoft.selenium.webdriver.pages.SecureAreaPage;



public class LoginTest extends BaseTest {

	@Test
	public void testSuccessfulLogin() {
		LoginPage loginPage = homePage.clickFormAthentication();
		loginPage.setUsername("tomsmith");
		loginPage.setPassword("SuperSecretPassword!");
		SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
		assertTrue("Alert test is incorrect", 
				secureAreaPage.getAlertText().contains("You logged into a secure area!"));
	}
}
