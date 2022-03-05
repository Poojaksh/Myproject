package com.PageLayer;

//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

public class LoginPage extends BaseClass 

{
	
	@FindBy(id="txtUsername")
	WebElement Username;
	
	@FindBy(id="txtPassword")
	WebElement Password;
	
	@FindBy(id="btnLogin")
	WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean usernameDisplayedStatus()
	{
		return Username.isDisplayed();
	}
	
	public boolean usernameEnabledStatus()
	{
		return Username.isEnabled();
	}
	
	public void typeUsername(String Uname)
	{
		 Username.sendKeys(Uname);
	}
	
	public String CaptureTet()
	{
		return Username.getAttribute("value");
	}
	
	public void clear()
	{
		Username.clear();
	}
//--------------------------------------------------------	
	public boolean PasswordDisplayedStatus()
	{
		return Password.isDisplayed();
	}
	
	public boolean PasswordEnabledStatus()
	{
		return Password.isEnabled();
	}
	
	public void typePassword(String pass)
	
	{
		Password.sendKeys(pass);
	}
	
	public void clearPass()
	{
		Password.clear();
	}
	
//--------------------------------------------------
	public boolean LoginDisplayedStatus()
	{
		return login.isDisplayed();
	}
	
	public boolean LoginEnabledStatus()
	{
		return login.isEnabled();
	}
	
	public String LoginCaptureTet()
	{
		return login.getAttribute("Value");
	}
	
	

	public void clickOnLoginButton() {
		// TODO Auto-generated method stub
		login.click();
	}

	
}
