package com.excelsoft.selenium.webdriver.alert;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.excelsoft.selenium.webdriver.base.BaseTest;

public class FileUploadTest extends BaseTest {

	@Test
	public void testFileUpload() {
		var fileUploadPage = homePage.clickFileUpload();
		fileUploadPage.uploadFile("C:\\dev\\eclipse_workspace\\selenium-training\\webdriver\\resources\\chromedriver.exe");
		fileUploadPage.clickUploadButton();
		assertEquals("Upload file incorrect", "chromedriver.exe", fileUploadPage.getUploadedFile());
	}
}
