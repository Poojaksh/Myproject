
	package com.BaseLayer;

	//import java.time.Duration;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class BaseClass {
		public static WebDriver driver;
		
		public static void initilization() {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkshirsagar\\Desktop\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
			
			driver =new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().deleteAllCookies();
			driver.get("https://opensource-demo.orangehrmlive.com/");
					
		}

	}



