package com.StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login
{
WebDriver driver;
@Given("User is on Login page")
public void user_is_on_login_page() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pkshirsagar\\Desktop\\Selenium setup\\chromedriver_win32\\chromedriver.exe");
    driver= new ChromeDriver();
    driver.get("https://www.facebook.com");
}

@When("Enter valid username and Password")
public void enter_valid_username_and_password() 
{
	driver.findElement(By.id("email")).sendKeys("9028795092");
	driver.findElement(By.id("pass")).sendKeys("Pooja1992@");
}

@Then("Login is Succesful and user is on login page")
public void login_is_succesful_and_user_is_on_login_page() 
{
	driver.quit();
}


}
