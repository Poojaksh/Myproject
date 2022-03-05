package com.UtilityLayer;




import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import com.BaseLayer.BaseClass;

public class JavaScriptExecutormethods extends BaseClass
{
	public static void openUrl(String url) 
	{
		((JavascriptExecutor) driver).executeScript("window.location='" + url + "';");
	}
	
	public static void clickOnElement(WebElement wb) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", wb);
	}

	public static void sendDataInTextBox(WebElement wb, String data) {
		((JavascriptExecutor) driver).executeScript("arguments[0].value='" + data + "';", wb);
	}

	public static String captureTitle() {
		return ((JavascriptExecutor) driver).executeScript("return document.title;").toString();
	}

	public static String captureUrl() {
		return ((JavascriptExecutor) driver).executeScript("return document.URL;").toString();
	}

	public static void refreshPage() {
		((JavascriptExecutor) driver).executeScript("history.go(0);");
	}

	public static void genrateAlertPop(String alertText) {
		((JavascriptExecutor) driver).executeScript("confirm('"+alertText+"');");
	}


}




