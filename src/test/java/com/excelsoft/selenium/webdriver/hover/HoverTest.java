package com.excelsoft.selenium.webdriver.hover;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.excelsoft.selenium.webdriver.base.BaseTest;
import com.excelsoft.selenium.webdriver.pages.HoversPage.FigureCaption;

public class HoverTest extends BaseTest {

	@Test
	public void testHoverUser1() {
		var hoversPage = homePage.clickHovers();
		FigureCaption caption = hoversPage.hoverOverFigure(1);
		assertTrue("Caption not displayed", caption.isCaptionDisplayed());
		assertEquals("Caption title incorrect", "name: user1", caption.getTitle());
		assertEquals("Caption Link text incorrect", "View profile", caption.getLinkText());
		assertTrue("Caption Link incorrect", caption.getLink().endsWith("/users/1"));
	}
	
}
