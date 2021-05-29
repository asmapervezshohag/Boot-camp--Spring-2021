package expediaFightSearch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class TravelersInformationPage {
WebDriver driver;
@FindBy(xpath="//input[@id='firstname[0]']")
WebElement firstname;
@FindBy(xpath="(//input[@class='text cko-field always-include gb-whitelist'])[1]")
WebElement middleName;
@FindBy(xpath="//input[@id='lastname[0]']")
WebElement lastName;
@FindBy(xpath="(//select[@aria-label= 'Country/Territory Code'])[1]")
WebElement countrySelect;
@FindBy(xpath="(//input[@id= 'phone-number[0]'])[1]")
WebElement phoneNumber;
@FindBy(xpath="//input[@id= 'confirmation-sms-provider-checkbox']")
WebElement smsConfirmationCheckBox;
@FindBy(xpath="//select[@id= 'passport[0]']")
WebElement passengerPassport;
@FindBy(xpath="//input[@id= 'gender_female[0]']")
WebElement passengersgender;
@FindBy(xpath="//select[@id= 'date_of_birth_month0']")
WebElement dobMonth;
@FindBy(xpath="//select[@id= 'date_of_birth_day[0]']")
WebElement dobDay;
@FindBy(xpath="//select[@id= 'date_of_birth_year[0]']")
WebElement dobYear;
@FindBy(xpath="//input[@id='no_insurance']")
WebElement noProtectionCheckBox;

@FindBy(xpath="(//input[@name='creditCards[0].cardholder_name'])[2]")
WebElement cardholderName;
@FindBy(xpath="//input[@id='creditCardInput']")
WebElement cardNumber ;

@FindBy(xpath="//select[@name='creditCards[0].expiration_month']")
WebElement cardExpirationMonth ;

@FindBy(xpath="//select[@name='creditCards[0].expiration_year']")
WebElement cardExpirationYear ;

@FindBy(xpath="//input[@id='new_cc_security_code']")
WebElement cardSecurityCode ;
@FindBy(xpath="//select[@name='creditCards[0].country']")
WebElement creditCardCountry;
@FindBy(xpath="//input[@class='text billing-address-one cko-field gb-whitelist']")
WebElement billingAddressOne;

@FindBy(xpath="//input[@class='text billing-address-two cko-field gb-whitelist']")
WebElement billingAddressTwo;


@FindBy(xpath="//input[@class='text billing-city cko-field gb-whitelist']")
WebElement billingCity;
@FindBy(xpath="//input[@class='text billing-province cko-field gb-whitelist']")
WebElement billingState;
@FindBy(xpath="//input[@class='text billing-zip-code cko-field gb-whitelist']")
WebElement bilingZipCode;
@FindBy(xpath="(//input[@class='text cko-field always-include gb-whitelist'])[3]")
WebElement emailConfirmation;

@FindBy(xpath="(//input[@name='password'])[2]")
WebElement passField;

@FindBy(xpath="//input[@name='repeat_password']")
WebElement confirmPassField;

@FindBy(xpath="//button[@id='complete-booking']")
WebElement completeBookingButton ;

 public TravelersInformationPage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
 }
public void enterFirstName(String fname) {
	firstname.sendKeys(fname);
}
public void enterMiddleName (String mName) {
	middleName.sendKeys(mName);
}
public void enterLastName(String lName) {
lastName.sendKeys(lName);	
}

public void selecCountry() {
	Select objsel=new Select(countrySelect);
	objsel.selectByIndex(3);
}
public void enterPhoneNumber(String phNumber) {
	phoneNumber.sendKeys(phNumber);
}
public void clickSMSConfirmationCheckBox() {
	smsConfirmationCheckBox.click();
}
public void selectPassengerPassport() {
	Select objsel=new Select(passengerPassport);
	objsel.selectByIndex(6);
	
}
public void clickPassengersgender() {
	passengersgender.click();
}
public void enterdobMonth() {
	Select objsel=new Select(dobMonth);
	objsel.selectByIndex(5);
	
	
}
public void enterdobDay() {
	Select objsel=new Select(dobDay);
	objsel.selectByIndex(5);
}
public void enterdobYear() {
	Select objsel=new Select(dobYear);
	objsel.selectByIndex(3);
}
public void clickNoProtectionCheckBox() {
	noProtectionCheckBox.click();
}
public void cardholderName(String cName) {
	cardholderName.sendKeys(cName);
}
public void cardNumber(String cNumber) {
	cardNumber.sendKeys(cNumber);
}
public void selectCardExpirationMonth() {
	Select objsel=new Select(cardExpirationMonth);
	objsel.selectByIndex(5);
	
}
public void selectCardExpirationYear() {
	Select objsel=new Select(cardExpirationYear);
	objsel.selectByIndex(8);
	
}
public void  entercardSecurityCode(String cvs) {
	 cardSecurityCode.sendKeys(cvs);
}
public void selectcreditCardCountry() {
	Select objsel=new Select(creditCardCountry);
	objsel.selectByIndex(7);
	
}
public void enterBillingAddressOne (String address1) {
	billingAddressOne.sendKeys(address1);
}
public void enterBillingAddressTwo(String address2) {
	billingAddressTwo.sendKeys(address2);
}
public void enterBillingCity(String city) {
	billingCity.sendKeys(city);
}
public void selectbillingState(String bState) {
	billingState.sendKeys(bState);
	
}
public void enterBillingZipCode(String zipcode) {
	bilingZipCode.sendKeys(zipcode);
}
public void enterEmailConfirmation(String email) {
	emailConfirmation.sendKeys(email);
}
public void enterPassField(String password) {
	passField.sendKeys(password);
}
public void enterConfirmPassField(String conpass) {
	confirmPassField.sendKeys(conpass);
}
public void clickCompleteBookingButton() {
	completeBookingButton.click();
}

}
