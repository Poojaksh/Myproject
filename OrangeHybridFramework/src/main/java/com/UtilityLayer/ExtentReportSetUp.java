package com.UtilityLayer;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.BaseLayer.BaseClass;

public class ExtentReportSetUp extends BaseClass 
{

	public static void getScreenshotFailedTestCases(String methodname) 
	{

		String dateTime = new SimpleDateFormat("_ddMMyyyy_HHmmss_").format(new Date());

		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dist = new File(
				System.getProperty("user.dir") + "//FailTestCaseScreenshot//" + dateTime + methodname + ".png");

		try 
		{
			FileUtils.copyFile(f, dist);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

	public static void getScreenshotPassedTestCases(String methodname)
	{
		String dateTime = new SimpleDateFormat("_ddMMyyyy_HHmmss_").format(new Date());
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dist = new File(
				System.getProperty("user.dir") + "//PassTestCaseScreenshot//" + dateTime + methodname + ".png");

		try 
		{
			FileUtils.copyFile(f, dist);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}

