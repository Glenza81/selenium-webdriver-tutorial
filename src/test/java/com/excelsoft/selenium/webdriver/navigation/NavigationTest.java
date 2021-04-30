package com.excelsoft.selenium.webdriver.navigation;

import org.junit.Test;

import com.excelsoft.selenium.webdriver.base.BaseTest;

public class NavigationTest extends BaseTest {

	//@Test
	public void testNavigator() {
		homePage.clickDynamicLoading().clickExample1();
		getWindowManager().goBack();
		getWindowManager().refreshPage();
		getWindowManager().goForward();
		getWindowManager().goTo("https://google.com");
	}
	
	@Test
	public void testSwitchTab() {
		homePage.clickMultipleWindows().clickHere();
		getWindowManager().switchToTab("New Window");
	}
}
