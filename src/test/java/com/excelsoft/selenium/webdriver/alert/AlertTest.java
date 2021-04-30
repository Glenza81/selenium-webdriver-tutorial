package com.excelsoft.selenium.webdriver.alert;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.excelsoft.selenium.webdriver.base.BaseTest;

public class AlertTest extends BaseTest {

	@Test
	public void testAcceptAlert() {
		var alertsPage = homePage.clickJavaScriptAlerts();
		alertsPage.triggerAlert();
		alertsPage.alert_clickAccept();
		assertEquals("result text incorrect", "You successfuly clicked an alert", alertsPage.getResult());
	}
	
	@Test
	public void testGetTextFromAlert() {
		var alertsPage = homePage.clickJavaScriptAlerts();
		alertsPage.triggerConfirm();
		String alertText = alertsPage.alert_getText();
		alertsPage.alert_clickDismiss();
		assertEquals("Alert text incorrect", "I am a JS Confirm", alertText);
	}

	@Test
	public void testSetInputInAlert() {
		var alertsPage = homePage.clickJavaScriptAlerts();
		alertsPage.triggerPrompt();
		String text = "You rocks!";
		alertsPage.alert_setInput(text);
		alertsPage.alert_clickAccept();
		assertEquals("result text incorrect", "You entered: " + text, alertsPage.getResult());
	}

}
