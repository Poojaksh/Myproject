package com.TestLayer;

//import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;
import com.UtilityLayer.ExtentReportListener;
import com.UtilityLayer.ExtentReportSetUp;
import com.UtilityLayer.ExtentReportSetUpspark;

import junit.framework.Assert;

public class LoginPageTest  extends BaseClass
{	
	LoginPage login;
	@BeforeClass
	public void setup()
	{
		BaseClass.initialization();
		login = new LoginPage();	
	}
	
	@Test(priority=1)
	public void DisplayedUser() throws Exception
	{
			boolean DispStatus =  login.usernameDisplayedStatus();
			Assert.assertEquals(true, DispStatus);
			 
			boolean Enabledstatus=login.usernameEnabledStatus();
			Assert.assertEquals(true, Enabledstatus);	
			
			login.typeUsername("Admin");
			 
			//Thread.sleep(2000);
			String str=	login.CaptureTet();
			Assert.assertEquals("Admin", str);
	}
	
//--------------------------------------------------------
	
	@Test(priority=2)
	public void DisplayedPass()
	{
	   boolean DispStatusPass =  login.PasswordDisplayedStatus();
		Assert.assertEquals(true, DispStatusPass);
		 
		boolean EnabledstatusPass=login.PasswordEnabledStatus();
		Assert.assertEquals(true, EnabledstatusPass);	
			
		login.typePassword("admin123");
		ExtentReportSetUp.getScreenshotFailedTestCases("OrangeHRM");
		ExtentReportSetUp.getScreenshotPassedTestCases("Orange H");
	}
	
//----------------------------------------------------
	@Test(priority=3)
	public void Loginbtn()
	{
	   boolean DispStatuslogin =  login.LoginDisplayedStatus();
		Assert.assertEquals(true, DispStatuslogin);
		 
		boolean Enabledstatuslogin=login.LoginEnabledStatus();
		Assert.assertEquals(true, Enabledstatuslogin);	
			
		login.clickOnLoginButton();
		ExtentReportSetUpspark.extentReportSetUP();
		
	}
//======================================================================	
	@AfterClass()
	public void tearDown()
	{
		driver.close();
	}
	
	
	
	
	
	
	
}
