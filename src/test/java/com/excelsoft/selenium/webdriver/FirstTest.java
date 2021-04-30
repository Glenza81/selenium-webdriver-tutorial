package com.excelsoft.selenium.webdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excelsoft.selenium.webdriver.pages.HomePage;

public class FirstTest {

	private WebDriver driver;
	
	protected HomePage homePage;
	
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		//driver.manage().window().maximize();
		//driver.manage().window().setSize(new Dimension(400,672));
		
//		System.out.println(driver.getTitle());
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println(links.size());
		
		homePage = new HomePage(driver);
		
		
		driver.quit();
	}
	
	public static void main(String[] args) {
		FirstTest test = new FirstTest();
		test.setUp();
	}
}
