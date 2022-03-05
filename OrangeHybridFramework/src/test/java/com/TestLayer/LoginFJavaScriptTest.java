package com.TestLayer;




//import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class LoginFJavaScriptTest {
	WebDriver driver;

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//AllDrivers//chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test(priority = 1)
	public void openUrlByJs() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.location='https://opensource-demo.orangehrmlive.com/';");
	}

	@Test(priority = 2)
	public void loginFunctionality() {
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement username = driver.findElement(By.id("txtUsername"));
		js.executeScript("arguments[0].value='Admin';", username);

		WebElement password = driver.findElement(By.id("txtPassword"));
		js.executeScript("arguments[0].value='admin123';", password);

		WebElement loginbutton = driver.findElement(By.id("btnLogin"));
		js.executeScript("arguments[0].click();", loginbutton);

	}

	@Test(priority = 3)
	public void captureTitle() {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		String actualTItle = js.executeScript("return document.title;").toString();
		System.out.println(actualTItle);

		Assert.assertEquals(actualTItle, "OrangeHRM");

		String actualUrl = js.executeScript("return document.URL;").toString();

		System.out.println(actualUrl);

	}

}
