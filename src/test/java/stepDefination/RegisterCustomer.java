package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class RegisterCustomer {
	
	WebDriver driver = null;

	@Given("^use navigates to AMSBE$")
	public void goToAMSBE() {
		driver = new ChromeDriver();
		driver.navigate().to("https://fan-uat.nextop.asia:7777/backend/account/Login");
	}

	@When("^I enter username as \"(.*?)\" and password as \"(.*?)\"$")
	public void I_enter_username_as_and_password_as(String arg1, String arg2) {
		driver.findElement(By.id("username_id")).sendKeys(arg1);
		driver.findElement(By.id("password")).sendKeys(arg2);
		driver.findElement(By.id("but_login")).click();
	}

	@Then("^I verify login is successful$")
	public void validateRelogin() {
		Assert.assertEquals("https://fan-uat.nextop.asia:7777/backend/account/account-info-init", driver.getCurrentUrl());
//		driver.close();
	}

}

