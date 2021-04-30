package com.excelsoft.selenium.webdriver.utils;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowManager {

	private WebDriver driver;
	private WebDriver.Navigation navigate;
	
	public WindowManager(WebDriver driver) {
		this.driver = driver;
		this.navigate = driver.navigate();
	}
	
	public void goBack() {
		navigate.back();
	}
	
	public void goForward() {
		navigate.forward();
	}

	public void refreshPage() {
		navigate.refresh();
	}
	
	public void goTo(String url) {
		navigate.to(url);
	}

	public void switchToTab(String tabTitle) {
		Set<String> windows = driver.getWindowHandles();
		System.out.println("Number of tabs :" + windows.size());
		windows.forEach(System.out::println);
		
		for (String window : windows) {
			driver.switchTo().window(window);
			if (tabTitle.equals(driver.getTitle())) {
				break;
			}
		}
	}
	
}
