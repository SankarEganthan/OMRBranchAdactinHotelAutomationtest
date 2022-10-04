package org.stepdefinition;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {
	@Given("User is on the adactin page")
	public void userIsOnTheAdactinPage() {
		getDriver();
		enterUrl("http://adactinhotelapp.com/index.php");
		maximizeWindow();
	}
	@When("User should perform login {string} and {string}")
	public void userShouldPerformLoginAnd(String userName, String password) {
		WebElement element = elementFindById("username");
		element.sendKeys(userName);
		WebElement element2 = elementFindById("password");
		element2.sendKeys(password);
		WebElement element3 = elementFindById("login");
		element3.click();
	    
	}
	@Then("User should verify success msg after login {string}")
	public void userShouldVerifySuccessMsgAfterLogin(String string) {
		
	    
	}

}
