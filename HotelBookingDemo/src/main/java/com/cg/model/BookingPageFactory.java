package com.cg.model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPageFactory {
	
WebDriver driver;
	
	@FindBy(name="txtFN")
	@CacheLookup
	WebElement firstName;
	
	@FindBy(name="txtLN")
	@CacheLookup
	WebElement lastName;
	
	@FindBy(name="Email")
	@CacheLookup
	WebElement email;
	
	@FindBy(name="Phone")
	@CacheLookup
	WebElement phone;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement city;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement state;
	
	@FindBy(id="txtCardholderName")
	@CacheLookup
	WebElement cardHolder;
	
	@FindBy(id ="txtDebit")
	@CacheLookup
	WebElement cardno;
	
	@FindBy(id ="txtCvv")
	@CacheLookup
	WebElement cvv;
	
	@FindBy(id ="txtMonth")
	@CacheLookup
	WebElement expmonth;
	
	@FindBy(id ="txtYear")
	@CacheLookup
	WebElement expyear;
	
	@FindBy(name="gender")
	@CacheLookup
	WebElement gender1;

	@FindBy(name="gender")
	@CacheLookup
	WebElement gender2;

	@FindBy(name="roomtype")
	@CacheLookup
	WebElement ac;

	@FindBy(name="roomtype")
	@CacheLookup
	WebElement nonac;

	
	@FindBy(className="btn")
	@CacheLookup
	WebElement loginBtn;

	
	public BookingPageFactory()
	{	
	}
	
    public BookingPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
    
    public void setFirstName(String fname) {
    	firstName.sendKeys(fname);
	}
	
	public void setLastName(String lname) {
		lastName.sendKeys(lname);
	}
	
	public void setEmail(String mail) {
		email.sendKeys(mail);
	}
	public void setPhone(String pno) {
		phone.sendKeys(pno);
	}
	
	public void setGender(String gen) {
		if(gen.equalsIgnoreCase("female"))
			gender2.click();
		else
			gender1.click();
	}
	public void setCity(String cityN) {
		city.sendKeys(cityN);
	}

	public void setState(String stateN) {
		state.sendKeys(stateN);
	}

	public void clickLoginButton() {
		loginBtn.click();
	}
	public void setRoomType(String rtype) {
		if(rtype.equalsIgnoreCase("AC"))
			ac.click();
		else
			nonac.click();
	}
	

	public void setCardHolderName(String cardHolderN) {
		cardHolder.sendKeys(cardHolderN);
	}
	public void setCardNo(String cno) {
		cardno.sendKeys(cno);
	}
	public void setCvv(String cvvno) {
		cvv.sendKeys(cvvno);
	}
	public void setExpMonth(String month) {
		expmonth.sendKeys(month);
	}
	public void setExpYear(String year) {
		expyear.sendKeys(year);
	}
	
}
