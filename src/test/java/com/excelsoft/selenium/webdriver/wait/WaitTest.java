package com.excelsoft.selenium.webdriver.wait;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.excelsoft.selenium.webdriver.base.BaseTest;

public class WaitTest extends BaseTest {

	@Test
	public void testWaitUntilHidden() {
		var loadingPage = homePage.clickDynamicLoading().clickExample1();
		loadingPage.clickStart();
		assertEquals("Loaded text incorrect", "Hello World!", loadingPage.getLoadedText());
	}
	
	@Test
    public void testWaitUntilVisible(){
        var loadingPage = homePage.clickDynamicLoading().clickExample2();
        loadingPage.clickStart();
        assertEquals("Loaded text incorrect", "Hello World!", loadingPage.getLoadedText());
    }
}
