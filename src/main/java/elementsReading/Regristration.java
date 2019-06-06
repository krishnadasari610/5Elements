package elementsReading;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Regristration {

	@FindBy(name = "gender")
	List<WebElement> selectGender;
	@FindBy(name = "firstname")
	WebElement enterFirstName;
	@FindBy(name = "lastname")
	WebElement enterLastName;
	@FindBy(id = "dob")
	WebElement selectDob;
	@FindBy(name = "email_address")
	WebElement enterEmailId;
	@FindBy(name = "company")
	WebElement enterCompanyName;
	@FindBy(name = "street_address")
	WebElement enterStreetAddress;
	@FindBy(name = "suburb")
	WebElement enterSuburb;
	@FindBy(name = "city")
	WebElement enterCityName;
	@FindBy(name = "postcode")
	WebElement enterZipCode;
	@FindBy(name = "state")
	WebElement enterState;
	@FindBy(name = "country")
	WebElement selectCountry;
	@FindBy(name = "telephone")
	WebElement enterPhoneNumber;
	@FindBy(name = "password")
	WebElement enterPassword;
	@FindBy(name = "confirmation")
	WebElement confirmPassword;
	@FindBy(xpath = "//*[@id=\"tdb4\"]/span[2]")
	WebElement clickBtn;

	// create constructor for each Registration

	public Regristration(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void selectGender() {

		selectGender.get(0).click();

	}

	public void firstName(String fname) {
		enterFirstName.sendKeys(fname);
	}

	public void lastName(String lName) {
		enterLastName.sendKeys(lName);
	}

	public void dateOfBirth(String dob) {
		selectDob.sendKeys(dob);
	}

	public void enterEmailId(String email) {
		enterEmailId.sendKeys(email);
	}

	public void companyName(String cName) {
		enterCompanyName.sendKeys(cName);
	}

	public void streeAddr(String sAddress) {
		enterStreetAddress.sendKeys(sAddress);
	}

	public void enterSub(String sBurb) {
		enterSuburb.sendKeys(sBurb);
	}

	public void enterPostCode(String pCode) {
		enterZipCode.sendKeys(pCode);
	}

	public void enterCity(String ctName) {
		enterCityName.sendKeys(ctName);
	}

	public void state(String sName) {
		enterState.sendKeys(sName);
	}

	public void country(String cName) {
		selectCountry.sendKeys(cName);
		//Select countryName = new Select(selectCountry);
		//countryName.selectByVisibleText(cName);
		//countryName.selectByIndex(cName);
		
	}

	public void phoneNum(String pNum) {
		enterPhoneNumber.sendKeys(pNum);
	}

	public void password(String pwd) {
		enterPassword.sendKeys(pwd);
	}

	public void cpassword(String cpwd) {
		confirmPassword.sendKeys(cpwd);
	}

	public void clickButton() {
		clickBtn.click();
	}

}
