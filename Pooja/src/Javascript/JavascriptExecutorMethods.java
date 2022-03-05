package Javascript;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class JavascriptExecutorMethods {
	static WebDriver driver;

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkshirsagar\\Desktop\\Selenium setup\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		JavascriptExecutorMethods.genrateAlertPop("user is on Login Page ");
		
		
		String a = driver.switchTo().alert().getText();

		System.out.println(a);

	

		Alert alt = driver.switchTo().alert();

		alt.accept();

	}

	public static void genrateAlertPop(String alertText) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("confirm('"+alertText+"');");
	}

}


