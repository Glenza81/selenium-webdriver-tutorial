package com.excelsoft.selenium.webdriver.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.excelsoft.selenium.webdriver.listeners.EventReporter;
import com.excelsoft.selenium.webdriver.pages.HomePage;
import com.excelsoft.selenium.webdriver.utils.WindowManager;
import com.google.common.io.Files;

import junit.framework.TestResult;

public class BaseTest {

	//private static WebDriver driver;
	private static EventFiringWebDriver driver;
	
	protected static HomePage homePage;
	
	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new EventFiringWebDriver(new ChromeDriver());
		driver.register(new EventReporter());
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/");
		homePage = new HomePage(driver);
	}
	
	@Before
	public void goHome() {
		driver.get("https://the-internet.herokuapp.com/");
	}
	
	//@After
	public void recordFailure(TestResult result) {
		if (!result.wasSuccessful()) {
			var camera = (TakesScreenshot)driver;
			File screenshot = camera.getScreenshotAs(OutputType.FILE);
			try {
				Files.move(screenshot, new File("resources/screenshot/test.png"));
				//Files.move(screenshot, new File("resources/screenshot/" + result.getClass().getName() + ".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	@AfterClass
	public static void tearDown() {
		driver.quit();
	}

	public WindowManager getWindowManager() {
		return new WindowManager(driver);
	}
}
