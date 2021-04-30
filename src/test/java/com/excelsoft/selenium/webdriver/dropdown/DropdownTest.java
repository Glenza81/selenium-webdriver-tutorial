package com.excelsoft.selenium.webdriver.dropdown;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.excelsoft.selenium.webdriver.base.BaseTest;

public class DropdownTest extends BaseTest {

	@Test
	public void testSelectOption() {
		var dropdownPage = homePage.clickDropdown();
		String option = "Option 1";
		dropdownPage.selectFromDropDown(option);
		var selectedOptions = dropdownPage.getSelectedOptions();
		assertNotNull(selectedOptions);
		assertEquals("Incorrect number of selection", 1, selectedOptions.size());
		assertTrue("Option 1 not selected", selectedOptions.contains(option));
	}
}
