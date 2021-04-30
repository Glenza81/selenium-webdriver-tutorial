package com.excelsoft.selenium.webdriver.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	private WebDriver driver;
	
//	private By formAuthenticationLink = By.linkText("Form Authentication");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage clickFormAthentication() {
		clickLink("Form Authentication");
		return new LoginPage(driver);
	}
	
	public DropdownPage clickDropdown() {
		clickLink("Dropdown");
		return new DropdownPage(driver);
	}

	public HoversPage clickHovers() {
		clickLink("Hovers");
		return new HoversPage(driver);
	}
	
	public AlertsPage clickJavaScriptAlerts() {
		clickLink("JavaScript Alerts");
		return new AlertsPage(driver);
	}

	public FileUploadPage clickFileUpload() {
		clickLink("File Upload");
		return new FileUploadPage(driver);
	}

	public DynamicLoadingPage clickDynamicLoading() {
		clickLink("Dynamic Loading");
		return new DynamicLoadingPage(driver);
	}

	public MultipleWindowsPage clickMultipleWindows() {
		clickLink("Multiple Windows");
		return new MultipleWindowsPage(driver);
	}

	private void clickLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
}
