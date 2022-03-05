package com.StepDefination;

import com.BaseLayer.BaseClass;
import com.PageLayer.AdminPage;
import com.PageLayer.Homepage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AdminPageTest extends BaseClass {
	
	@When("user click on AdminPage")
	public void user_click_on_admin_page() {
		new Homepage().clickOnAdminLink();
	}

	@Then("user click on Add button")
	public void user_click_on_add_button() {
		new AdminPage().clickOnAddAdminBtn();
	}

	@Then("user enter all add employee details")
	public void user_enter_all_add_employee_details() {
		AdminPage adminPage=new AdminPage();
		adminPage.selectUserRole("Admin");
		adminPage.enterEmpName("Raghav");
		adminPage.enterUserName("raghav123");
		adminPage.selectStatus("Enabled");
		adminPage.enterPassword("hello123");
		adminPage.enterConfirmPassword("hello123");
	}

}
