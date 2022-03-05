package com.PageLayer;


	


	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import com.BaseLayer.BaseClass;

	public class Homepage extends BaseClass {

		@FindBy(xpath="//img[@alt='OrangeHRM']")
		private WebElement logo;
		
		@FindBy(id="menu_admin_viewAdminModule")
		private WebElement adminLink;
		
		public Homepage() {
			PageFactory.initElements(driver, this);
		}
		
		public boolean validateLogo() {
			return logo.isDisplayed();
		}
		public void clickOnAdminLink() {
			adminLink.click();
		}
		public String captureTitle() {
			return driver.getTitle();
		}
		
		
	}



