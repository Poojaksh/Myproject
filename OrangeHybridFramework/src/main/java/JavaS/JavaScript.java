package JavaS;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.BaseLayer.BaseClass;

public class JavaScript {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir") + "//AllBrowserDrivers//chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		JavaScript.genrateAlertPop("user is on Login Page ");
		
		
		String a = driver.switchTo().alert().getText();

		System.out.println(a);

		Thread.sleep(4000);

		Alert alt = driver.switchTo().alert();

		alt.accept();

	}

	public static void genrateAlertPop(String alertText) 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("confirm('"+alertText+"');");
	}
	public static void openUrl(String url) 
	{
		((JavascriptExecutor) driver).executeScript("window.location='"+url+"';");
	}


}










