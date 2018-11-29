package login;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.cg.model.LoginPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefN {
	LoginPageFactory loginPage;
	
	WebDriver driver;
	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Throwable {
		//System.setProperty("webdriver.chrome.driver", "D:\\BDD");
		driver = new FirefoxDriver();
		driver.get("D:\\BDD\\HotelBookingDemo\\login.html");
		loginPage = new LoginPageFactory(driver);
		System.out.println("Page Loaded in Browser");
	}

	@When("^username and password is blank$")
	public void username_and_password_is_blank() throws Throwable {
		loginPage.setUserName("");
		loginPage.setPassword("");
		loginPage.clickLoginButton();
	}

	@Then("^Display error message 'Please enter Username'$")
	public void display_error_message_Please_enter_Username() throws Throwable {
		String actualErrMsg = loginPage.getUserNameError();
		String expErrorMsg = "* Please enter userName.";
		Assert.assertEquals(expErrorMsg, actualErrMsg);
		driver.close();
	}
	@When("^username is given but password is blank$")
	public void username_is_given_but_password_is_blank() throws Throwable {
		loginPage.setUserName("Swetha");
		loginPage.setPassword("");
		loginPage.clickLoginButton();
	}

	@Then("^Display error message 'Please enter password'$")
	public void display_error_message_Please_enter_password() throws Throwable {
		String actualErrorMsg = loginPage.getPasswordError();
		String expErrorMsg = "* Please enter password.";
		Assert.assertEquals(expErrorMsg, actualErrorMsg);
		driver.close();
	}
	@When("^username and password are invalid$")
	public void username_and_password_are_invalid() throws Throwable {
		loginPage.setUserName("swetha");
		loginPage.setPassword("swetha");
		loginPage.clickLoginButton();
	}

	@Then("^Display alert message 'Invalid login'$")
	public void display_alert_message_Invalid_login() throws Throwable {
		String actualErrorMsg = driver.switchTo().alert().getText();
		String expErrorMsg = "Invalid login! Please try again!";
		Assert.assertEquals(expErrorMsg, actualErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}
	@When("^username and password are valid$")
	public void username_and_password_are_valid() throws Throwable {
		loginPage.setUserName("Swetha");
		loginPage.setPassword("Swetha");
		loginPage.clickLoginButton();
	}

	@Then("^go to registration form$")
	public void go_to_registration_form() throws Throwable {
		driver.navigate().to("D:\\BDD\\HotelBookingDemo\\hotelbooking.html");
	}

	

}
