package com.cucumberreport;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;

public class CucumberReport {
	WebDriver driver = null ;
	
	@Given("^I have to open the browser$")
	public void openBrowser() {
		driver = new FirefoxDriver();
	}
	@When("^I opened the Facebook website")
	public void goToFacebook() {
		driver.navigate().to("https://www.facebook.com/");
	}
	
	@Then("^Login button should exist$")
	public void loginButton() {
		if(driver.findElement(By.id("u_0_v")).isEnabled()) {
			System.out.println("Test 1 Pass");
		}else {
			System.out.println("Test 1 Fail");
		}
	}
	@Then("^Forgot password link should exist$")
	public void forgotPWD() {
		if(driver.findElement(By.id("")).isEnabled()) {
			System.out.println("Test 1 Pass");
		}else {
			System.out.println("Test 1 Fail");
		}
	}
}
