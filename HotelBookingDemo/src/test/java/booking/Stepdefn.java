package booking;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cg.model.BookingPageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefn {
	
	BookingPageFactory bookingPage;
	WebDriver driver;
	
	@Given("^User is on hotel booking page$")
	public void user_is_on_hotel_booking_page() throws Throwable {
		driver = new FirefoxDriver();
		driver.get("D:\\BDD\\HotelBookingDemo\\hotelbooking.html");
		//creating object of LoginPageFactory
		bookingPage = new BookingPageFactory(driver);
		System.out.println("Page loaded in browser");
	}

	@When("^Firstname is blank$")
	public void firstname_is_blank() throws Throwable {
	   bookingPage.setFirstName("");
	   bookingPage.clickLoginButton();
	}

	@Then("^Display Error Message 'Please enter Firstname'$")
	public void display_Error_Message_Please_enter_Firstname() throws Throwable {
		String actualErrorMsg = driver.switchTo().alert().getText();
		String expErrorMsg = "Please fill the First Name";
		assertEquals(expErrorMsg, actualErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Firstname is given but lastname is blank$")
	public void firstname_is_given_but_lastname_is_blank() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display Error Message 'Please enter Lastname'$")
	public void display_Error_Message_Please_enter_Lastname() throws Throwable {
		String actualErrorMsg = driver.switchTo().alert().getText();
		String expErrorMsg = "Please fill the Last Name";
		assertEquals(expErrorMsg, actualErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Email is blank$")
	public void email_is_blank() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please enter email'$")
	public void display_alert_Please_enter_email() throws Throwable {
		String actualErrorMsg = driver.switchTo().alert().getText();
		String expErrorMsg = "Please fill the Email";
		assertEquals(expErrorMsg, actualErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Mobile Number is blank$")
	public void mobile_Number_is_blank() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("Swetha.panga@capgemini.com");
		bookingPage.setPhone("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Please enter mobile number'$")
	public void display_alert_Please_enter_mobile_number() throws Throwable {
		String actualErrorMsg = driver.switchTo().alert().getText();
		String expErrorMsg = "Please fill the Mobile No.";
		assertEquals(expErrorMsg, actualErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Invalid email is entered$")
	public void invalid_email_is_entered() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("shajgd");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Invalid email'$")
	public void display_alert_Invalid_email() throws Throwable {
		String expErrMsg = "Please enter valid Email Id.";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^Invalid Mobile Number is entered$")
	public void invalid_Mobile_Number_is_entered() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("Swetha.panga@capgemini.com");
		bookingPage.setPhone("2123546556");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'Invalid Mobile Number'$")
	public void display_alert_Invalid_Mobile_Number() throws Throwable {
		String expErrMsg = "Please enter valid Contact no.";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();
	}

	@When("^gender not selected$")
	public void gender_not_selected() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("Swetha.panga@capgemini.com");
		bookingPage.setPhone("8179323885");
		//bookingPage.setGender("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'select gender'$")
	public void display_alert_select_gender() throws Throwable {
		String expErrMsg = "Please Select the Gender";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}

	
	@When("^city is not selected$")
	public void city_is_not_selected() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("Swetha.panga@capgemini.com");
		bookingPage.setPhone("8179323885");
		bookingPage.setGender("Female");
		//bookingPage.setCity("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'select a city'$")
	public void display_alert_select_a_city() throws Throwable {
		String expErrMsg = "Please select city";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}

	@When("^state is not selected$")
	public void state_is_not_selected() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("Swetha.panga@capgemini.com");
		bookingPage.setPhone("8179323885");
		bookingPage.setGender("Female");
		bookingPage.setCity("Pune");
	//	bookingPage.setState("");
		bookingPage.clickLoginButton();
	}

	@Then("^Display alert 'select a state'$")
	public void display_alert_select_a_state() throws Throwable {
		String expErrMsg = "Please select state";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}
	@When("^room type is not selected$")
	public void room_type_is_not_selected() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("Swetha.panga@capgemini.com");
		bookingPage.setPhone("8179323885");
		bookingPage.setGender("Female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Maharashtra");
//		bookingPage.setRoomType("");;
		bookingPage.clickLoginButton();

	}

	@Then("^Display alert 'select room type'$")
	public void display_alert_select_room_type() throws Throwable {
	}


	@When("^CardHolder name is not entered$")
	public void cardholder_name_is_not_entered() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("Swetha.panga@capgemini.com");
		bookingPage.setPhone("8179323885");
		bookingPage.setGender("Female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Maharashtra");
		bookingPage.setRoomType("AC");;
		bookingPage.setCardHolderName("");
		bookingPage.clickLoginButton();

	}

	@Then("^Display alert 'enter card holder name'$")
	public void display_alert_enter_card_holder_name() throws Throwable {
		String expErrMsg = "Please fill the Card holder name";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}

	@When("^card number is not entered$")
	public void card_number_is_not_entered() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("Swetha.panga@capgemini.com");
		bookingPage.setPhone("8179323885");
		bookingPage.setGender("Female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Maharashtra");
		bookingPage.setRoomType("AC");;
		bookingPage.setCardHolderName("Swetha");
		bookingPage.setCardNo("");
		bookingPage.clickLoginButton();

	}

	@Then("^Display alert 'enter card number'$")
	public void display_alert_enter_card_number() throws Throwable {
		String expErrMsg = "Please fill the Debit card Number";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}

	@When("^cvv is not entered$")
	public void cvv_is_not_entered() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("Swetha.panga@capgemini.com");
		bookingPage.setPhone("8179323885");
		bookingPage.setGender("Female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Maharashtra");
		bookingPage.setRoomType("AC");;
		bookingPage.setCardHolderName("Swetha");
		bookingPage.setCardNo("9876543");
		bookingPage.setCvv("");
		bookingPage.clickLoginButton();

	}

	@Then("^Display alert 'enter cvv code'$")
	public void display_alert_enter_cvv_code() throws Throwable {
		String expErrMsg = "Please fill the CVV";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}

	@When("^expiry month is not entered$")
	public void expiry_month_is_not_entered() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("Swetha.panga@capgemini.com");
		bookingPage.setPhone("8179323885");
		bookingPage.setGender("Female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Maharashtra");
		bookingPage.setRoomType("AC");;
		bookingPage.setCardHolderName("Swetha");
		bookingPage.setCardNo("9876543");
		bookingPage.setCvv("700");
		bookingPage.setExpMonth("");
		bookingPage.clickLoginButton();

	}

	@Then("^Display alert 'enter month expiry'$")
	public void display_alert_enter_month_expiry() throws Throwable {
		String expErrMsg = "Please fill expiration month";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}

	@When("^expiry year is not entered$")
	public void expiry_year_is_not_entered() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("Swetha.panga@capgemini.com");
		bookingPage.setPhone("8179323885");
		bookingPage.setGender("Female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Maharashtra");
		bookingPage.setRoomType("AC");;
		bookingPage.setCardHolderName("Swetha");
		bookingPage.setCardNo("9876543");
		bookingPage.setCvv("700");
		bookingPage.setExpMonth("12");
		bookingPage.setExpYear("");
		bookingPage.clickLoginButton();

	}

	@Then("^Display alert 'enter year expiry'$")
	public void display_alert_enter_year_expiry() throws Throwable {
		String expErrMsg = "Please fill the expiration year";
		String actErrorMsg = driver.switchTo().alert().getText();
		assertEquals(expErrMsg, actErrorMsg);
		driver.switchTo().alert().accept();
		driver.close();

	}
	@When("^user enters all valid details$")
	public void user_enters_all_valid_details() throws Throwable {
		bookingPage.setFirstName("Swetha");
		bookingPage.setLastName("Panga");
		bookingPage.setEmail("Swetha.panga@capgemini.com");
		bookingPage.setPhone("8179323885");
		bookingPage.setGender("Female");
		bookingPage.setCity("Pune");
		bookingPage.setState("Maharashtra");
		bookingPage.setRoomType("AC");;
		bookingPage.setCardHolderName("Swetha");
		bookingPage.setCardNo("9876543");
		bookingPage.setCvv("700");
		bookingPage.setExpMonth("12");
		bookingPage.setExpYear("2020");
		bookingPage.clickLoginButton();
 
	}

	@Then("^go to Registration success Page$")
	public void go_to_Registration_success_Page() throws Throwable {
		driver.navigate().to("D:\\BDD\\HotelBookingDemo\\success.html");	 
	}



}
