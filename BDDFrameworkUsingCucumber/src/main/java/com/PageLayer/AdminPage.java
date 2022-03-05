package com.PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.BaseLayer.BaseClass;

import UtilsLayer.SelectClassMethods;

//import UtilsLayer.SelectClassMethods;

public class AdminPage extends BaseClass {

	@FindBy(name="btnAdd")
	private WebElement adminAddBtn;
	
	@FindBy(id="systemUser_userType")
	private WebElement userRole;
	
	@FindBy(id="systemUser_employeeName_empName")
	private WebElement empName;
	
	@FindBy(id="systemUser_userName")
	private WebElement userName;
	
	@FindBy(id="systemUser_status")
	private WebElement status;
	
	@FindBy(id="systemUser_password")
	private WebElement password;
	
	@FindBy(id="systemUser_confirmPassword")
	private WebElement confirmPassword;
	
	
	public AdminPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnAddAdminBtn() {
		adminAddBtn.click();
	}
	
	public void selectUserRole(String role) {
		SelectClassMethods.selectDropdownByVisibleText(userRole, role);
	}
	
	public void enterEmpName(String name) {
		empName.sendKeys(name);
	}
	public void enterUserName(String uname) {
		userName.sendKeys(uname);
	}
	
	public void selectStatus(String givenStatus) {
		SelectClassMethods.selectDropdownByVisibleText(status, givenStatus);
	}
	public void enterPassword(String pwd) {
		password.sendKeys(pwd);
	}
	public void enterConfirmPassword(String crmPwd) {
		confirmPassword.sendKeys(crmPwd);
	}
	
	
	
	
	
	
	
}
