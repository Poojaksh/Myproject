package com.StepDefination;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.BaseLayer.BaseClass;
import com.PageLayer.Homepage;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;

public class HomepageTest extends BaseClass {
	final private Homepage homepage = new Homepage();
	
	@Then("user validate logo of the application")
	public void user_validate_logo_of_the_application() {
		assertEquals(homepage.validateLogo(), true);;
		
	   	}
	@Then("user validate title of the applicagtion")
	public void user_validate_title_of_the_applicagtion() {
	  String actualTitle =homepage.captureTitle();
	  assertEquals("OrangeHRM", actualTitle);
	}
	
	@After
	public void tearDown() {
		driver.close();
	}
	
}
