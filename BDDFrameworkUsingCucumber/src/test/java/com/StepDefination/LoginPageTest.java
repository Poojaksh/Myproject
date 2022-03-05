package com.StepDefination;



import com.BaseLayer.BaseClass;
import com.PageLayer.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageTest extends BaseClass {
LoginPage loginPage;

	@Given("user on login page")
	public void user_on_login_page() 
	{
	   BaseClass.initilization();
	}
	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() {
	  loginPage =new LoginPage();
	  loginPage.enterUsername("Admin");
	  loginPage.enterPassword("admin123");
	  loginPage.clickOnLogin();
		
	}
	@Then("user is on homepage")
	public void user_is_on_homepage() {
	   System.out.println("User is on HomePage");
	   System.out.println(driver.getTitle());
	}



}
